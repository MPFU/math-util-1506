/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphuc.mathutil.test;

import static com.minhphuc.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class MathUtilTest {
    //Neu muon xai cac ham static, co 2 cach
//Cach 1: goi ten class. ten ham static()
//Cach 2: ko can goi ten class cham, goi ten ham minh muon
//        nho import static package...ten class.ten ham static

        //Test case #1: getF() with valid argument
        //n = 0, expected = 1; actual: doan...
        
        @Test//bien 1 ham bat ki trong 1 class bat ki thanh main()
        public void testFactorialGivenValidArgumentReturnsWell() {
            long expected = 1; //Hy vong ham tra ve 1 neu tinh 0!
            long actual = getFactorial(0);

            assertEquals(expected, actual);
            //--trong main() kieu cu, ta in ra ket qua expected va actual
            //mat tu nhin de coi 2 thg giong nhau hay ko
            //ben JUnit, tung 2 mau sac: Xanh: 2 thg khop nhau
        }

        //TEST CASE #2
        //NGOAI le lam sao de test
        //Ngoai le la 1 value
        //Ngoai le la 1 tinh huong, bat thuong, co kha nang xay ra
        //Ko la value de so sanh keu assertEquals()
        //Ngoai le ko dung ham assertEquals()
        //Chi do luong = cach coi co xh hay ko
        @Test //bien 1 ham bat ki trong 1 class bat ki thanh main()
        public void testFactorialGivenValidArgumentN6ReturnsWell() {
            long expected = 720; //Hy vong ham tra ve 720 neu tinh 6!
            long actual = getFactorial(6);

            assertEquals(expected, actual);

        }

        //TEST CASE #3
        //NGOAI le lam sao de test
        //Ngoai le la 1 value
        //Ngoai le la 1 tinh huong, bat thuong, co kha nang xay ra
        //Ko la value de so sanh keu assertEquals()
        //Ngoai le ko dung ham assertEquals()
        //Chi do luong = cach coi co xh hay ko
        @Test(expected = IllegalArgumentException.class) //bien 1 ham bat ki trong 1 class bat ki thanh main()
        public void testFactorialGivenInvalidArgumentThrowException(){
            getFactorial(-5);

        }
    }


