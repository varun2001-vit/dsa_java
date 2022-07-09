/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author varun
 */
class node_s
{
    int value;
    node_s next;
    node_s(int value)
    {
        this.value=value;
    }
}
class stack_class
{
    node_s top;
    int height;
    stack_class(int value)
    {
        node_s sc= new node_s(value);
        top=sc;
        height=height+1;
    }
    void  get_height()
    {
        System.out.println("height is " + height);
    }
    void get_top()
    {
        System.out.println("the  top element is "+ top.value);
    }
    public void print_stack()
    {
        node_s temp=top;
        while(temp!=null)
        {
            System.out.println(temp.value + " ");
            temp=temp.next;
        }
        System.out.println("");
        
    }
    public void push(int value)
    {
        node_s newnode= new node_s(value);
        if(height==0)
        {
            top=newnode;
            height++;
        }
        else
        {
            newnode.next=top;
            top=newnode;
            height++;
        }
    }
    public void pop()
    {
        if(height==0)System.out.println("empty");
        else
        {
            node_s temp=top;
            top=top.next;
            temp.next=null;
        }
            
        
    }
}
public class stack {
    public static void main(String[] args) {
        stack_class s = new stack_class(3);
        s.get_height();
        s.get_top();
        s.print_stack();
        s.push(4);
        s.push(5);
        s.push(6);
        
        s.print_stack();
        s.pop();
        s.pop();
        s.print_stack();
    }
    
}
