/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphuc.mathutil.core;

/**
 *
 * @author Dell
 */
public class MathUtil {
    //ham tinh giai thua n! = 1.2.3.4...n
    //ko co giai thua so am
    //0! = 1! = 1 quy uoc
    //giai thua tang rat nhanh, 20! vua du cho long, 18 con so 0
    //21 vuot long vuot 18 so 0, tran
    //chan viec n < 0 va/hoac  n > 21
    public static long getFactorial(int n){
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument."
                    + " n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;///ket qua trung gian
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return  product;
    }
}
