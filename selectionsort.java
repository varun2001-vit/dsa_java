/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Arrays;

/**
 *
 * @author varun
 */
public class selectionsort {
    public static void main(String[] args) {
        int a[]={6,4,7,8,3,9,5};
        for(int i=0;i<a.length;i++)
        {
            int min =i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                    
                {
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            System.out.println(Arrays.toString(a));
        }
        
    }
}
