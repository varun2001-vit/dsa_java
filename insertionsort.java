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
public class insertionsort {
    public static void main(String[] args) {
        int a[]={6,4,7,8,3,9,5};
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>-1 && temp<a[j])
            {
                a[j+1]=a[j];
                a[j]=temp;
                j--;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
