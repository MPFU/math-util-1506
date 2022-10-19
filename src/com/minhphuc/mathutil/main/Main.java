/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphuc.mathutil.main;
import com.minhphuc.mathutil.core.MathUtil;
/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[]args) {
        //ta kiem thu bang cach goi ham, voi data dua vao, chay, va
        //nhin ket qua cua ham tra ve (ACTUAL) so sanh voi cai ta
        //hy vong no se tra ve (EXPECTED)   
        //vi du 5! thi ta hy vong nhan ve expected = 120
        // thuc te ham getFI(5) tra ve may actual = ?
        //chay moi biet
        //cuoi cung so sanh EXPECTED vs ACTUAL
        //de fam bao ham dung, ta phai chia cac truong hop/nghi ra
        //cac tinh huong ham se dc xai, tuc la nghi ra cac bo data
        //dua cho ham se dc
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //compare
        System.out.println("0! -> expected: " + expected 
                                 + "; actual: " + actual);
        
        //test case  #2: n =6. expected = 720; actual:...
        expected = 720;
        actual = MathUtil.getFactorial(6);
        //compare
        System.out.println("6! -> expected: " + expected 
                                 + "; actual: " + actual);
        
         //test case  #3: n =6. expected = 720; actual:...
        System.out.println("Check if an exception is thrown by using invalid argument");
         expected = -5;
        actual = MathUtil.getFactorial(-5);
        //compare
//        System.out.println("6! -> expected: " + expected 
//                                 + "; actual: " + actual);
    }
}
