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
public class bubblesort {
    public static void main(String[] args) {
        int a[]={2,8,10,9,3,4,1};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
           for(int k=0;k<a.length;k++)
           {
               System.out.print(a[k]+" ");
           }
            System.out.println("");
        }
    }
    
}
