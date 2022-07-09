/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.ArrayList;

class Node_hm
{
    String key;
    int value;
    Node_hm next;

    public Node_hm(String key, int value) {
        this.key = key;
        this.value = value;
    }
    
}
class hash_class
{
    int size=7;
    Node_hm datamap[];
    hash_class()
    {
      datamap= new Node_hm[size];  
     
    }
    public void print_table()
    {
        for(int i =0;i<datamap.length;i++)
        {
            System.out.print(i+ ": ");
            Node_hm temp=datamap[i];
            while(temp!=null)
            {
                System.out.print("{ " + temp.key + " = " +temp.value +"} ");
                temp=temp.next;
               
            }
             System.out.println("");
        }
    }
    public int hash(String key)
    {
        int k=0;
        char keyarray[]=key.toCharArray();
        for(int i=0;i<keyarray.length;i++)
        {
            int ascii=keyarray[i];
            k=k+(23*ascii);
           
            
        }
        k=(int)k%7;
        return k;
    }
    public void set(String key,int value)
    {
        int index=hash(key);
        Node_hm newnode=new Node_hm(key,value);
        if(datamap[index]==null)
        {
            datamap[index]=newnode;
        }
        else
        {
            Node_hm temp= datamap[index];
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public int get(String key)
    {
        int index=hash(key);
        Node_hm temp=datamap[index];
        while(temp!=null)
        {
            if(key==temp.key)return temp.value;
            else temp=temp.next;
        }
        return 0;
    }
    public ArrayList keys()
    {
        ArrayList <String> allkeys= new ArrayList<String>();
        for(int i=0; i<datamap.length;i++)
        {
            Node_hm temp =datamap[i];
            while(temp!=null)
            {
                allkeys.add(temp.key);
                temp=temp.next;
            }
        }
        return allkeys;
    }
}
public class hashMap {
    public static void main(String[] args) {
        hash_class hm= new hash_class();
       
        hm.set("varun", 1);
        hm.set("ram", 2);
        hm.set("sid", 3);
        hm.print_table();
        int index=hm.get("sid");
        if(index==0)System.out.println("Not found");
        else System.out.println("The value is " + index);
        ArrayList ls= hm.keys();
        System.out.println(ls);
    }
    
}
