package com.tanphat.mathutil.core.test;

import com.tanphat.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilityDDTTest {

    //CLASS NÀY SẼ CHỨA CÁC HÀM KIỂM THỬ CODE THEO STYLE DDT
    //DATA DRIVEN TESTING, TA TÁCH CODE KIỂM THỬ RIÊNG RA
    //KO GOP VỚI DATA KIỂM THỬ , ĐỂ ĐÁNH GIÁ ĐC XEM CÓ BAO NHIÊU TEST
    //CASE ĐANG ĐC
    //BỘ DATA ĐƯA VÀO TEST ĐỂ


    // ham nay tra ve 1 mang cac con so am hoac lon hon n gay ra exception
    public static Integer[] initWrongDataSet() {
        return new Integer[] {-1,-2,-3,-4,-100,-1000,21,22,23,100,1000};
    }

    //Test case#...: check if getFactorial() throws IllegalArgumentException
    //               in case of n < 0 or n > 20

    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }

    //Test case #... : checkFactorial() with right argument and runs well
    //                 n= 0 1 2 3 4 ... 18 19 20

    public static Object[][] initRightDataSet() {
        return new Object[][] {{0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                               {5, 120},
                               {6, 720}
                              };
    }
    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n,long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}