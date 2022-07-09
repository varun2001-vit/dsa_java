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
class factorial_value
{
    int n;

    public int factor(int n)
    {
        if(n==1)return 1;
        else {
            System.out.println("Value cuurently in loop is " + n);
            return n * factor(n-1);
            }
    }
}
public class factorial {
    public static void main(String[] args) {
        factorial_value f= new factorial_value();
        System.out.println(f.factor(4));
        
    }
}
