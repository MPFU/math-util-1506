/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphuc.mathutil.test;

import static com.minhphuc.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Dell
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest  {
    
    //ta can test thu ham getF() ben code chinh chay dung ko
    //ro rang ta phai dua data cho ham, xong xem no tra ve gi
    //so sanh ket luan ham dung sai
    //3 viec: chuan bi data, dua data vao ham, ket luan dung sai
    //done o ben MathUtilTest roi, 
    //0! -->1
    //1! -->1
    //2! -->2             bo du lieu test, test data
    //3! -->6             luu table SQLSERVER, Excel, .CSV
    //5! -->120           lu trong mot mang trong code cx 
    //6! -->720
    //hoc cach viet code tach dam data ra khoi cac cau lenh
    //getF(), ko mixed. Tat ca cac framework UnitTest cua moi
    //NNLT deu lam dc dieu nay
    
    //Ham tra ve mang hai chhieu kieu Object
    //Vi cac framework choi voi object
    //Tuc la choi voi Wrapper Class neu mang so...
    //Wrapper class: Integer(int), Long(long),..
    
    //bao may  JVM JUNIT day la data nguon!!! dung nhoi vao assert()
    @Parameterized.Parameters
    public static Object[][] initData(){
        int a[] = {2,4,6,8};
        //int a[4]
        
        return new Integer[][]{
                                  {0, 1},
                                  {1, 1},
                                  {2, 2},
                                  {3, 6},
                                  {6, 720}
                };
    }
    //Can trich mang con ra de dc cap value input/expected
    @Parameterized.Parameter(value = 0)//map cot 0
    public  int input;
    
    @Parameterized.Parameter(value = 1)//map cot 1
    public  int expected;
    
     @Test //bien 1 ham bat ki trong 1 class bat ki thanh main()
        public void testFactorialGivenValidArgumentN6ReturnsWell() {
            
            //long actual = getFactorial(input);

            assertEquals(expected, getFactorial(input));

        }
}
