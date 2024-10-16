package com.tanphat.mathutil.core.test;

import com.tanphat.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    // test case #4 : check getFactorial() with n= -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void getFactorialGivenWrongArgumentThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-1));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-2));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-3));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-4));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(21));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(22));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(23));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(24));

    }

    @Test
    public void getFactorialGivenWrongArgumentMinus5ThrowsException() {
        //so sanh 2 thang expected va actual
        //MathUtility.getFactorial(-5); CHƯA BẮT XEM CÓ NGOẠI LỆ ĐÚNG NHƯU KÌ VỌNG KHÔNG
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
    }//THẤY NGOẠI LỆ MỪNG RƠI NUOWCS MẮT
    // VÌ HÀM THIẾT KẾ RA RẰNG ĐƯA N<0 VÀ N>20 THÌ NGOẠI LỆ ĐC NÉM RA
    // VẬY NẾU NGOWIJ LỆ ĐC NÉM RA KHI N = -5 THÌ PHẢI XANH
    // XANH VÌ TRẢ VỀ NGOẠI LỆ ĐÚNG NHƯ KÌ VỌNG


    // test case #3 (gop): check getFactorial() with n=2 3 4 5 6...
    @Test
    public void getFactorialGivenRightArgumentReturnWell() {

        //so sanh 2 thang expected va actual
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
        assertEquals(720,MathUtility.getFactorial(6));

    } //bad smell = doan code boc mui (Robert C.Martin - Clean Code)
    //code bi lap lai lon sộn test data va lenh kiem thu
    //ta can tinh chinh toi ưu code - REFACTOR, REFACTORING


    // test case #2: check getFactorial() with n=1
    @Test
    public void getFactorialGivenRightArgument1ReturnWell() {
        long expectedValue = 1; //hi vong 0! ra 1
        long actualValue = MathUtility.getFactorial(1);

        //so sanh 2 thang expected va actual
        assertEquals(expectedValue,actualValue);
    }

    //test case structure: ID, Description, step, expected value, status
    //                     bug ID (bugzilla, jira)
    // test case #1: check getFactorial() with n=0
    @Test
    public void getFactorialGivenRightArgument0ReturnWell() {
        long expectedValue = 1; //hi vong 0! ra 1
        long actualValue = MathUtility.getFactorial(1);

        //so sanh 2 thang expected va actual
        assertEquals(expectedValue,actualValue);
    }

}