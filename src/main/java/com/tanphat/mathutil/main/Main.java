package com.tanphat.mathutil.main;
import com.tanphat.mathutil.core.MathUtility;
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenRightArgument5ReturnsWell();
    }

    //TA SE TEST HAM CUA TA VIET RA GOI LA UNIT TEST
    //TA CAN TEST HAM GETFACTORIAL() VOI CAC BO DATA DUA VAO -> TEST CASE
    //NHUNG BO DATA DUA VAO HAM VAO APP VA CACH THUC XAI DATA NAY VA KET QUA HI VONG APP VA HAM SE TRA VE

    //TEST CASE #2
    //DESCRIPTION:
    //          TO VERIFY THE getFactorial() method with correct given argument e.g n=5

    //STEP/PROCEDURES:
    //              CALL getFactorial() with valid arg: getFactorial(5)

    //EXPECTED RESULT
    // To have number 5 as the result of 120

    //STATUS (TRANG THAI CUA TEST CASE LA GI SAU KHI CHAY APP CHAY HAM)
    //          PASS/FAILED
    // CHO XEM HAM, APP XU LY DC SO MAY - ACTUAL VALUE VA DI SO SANH VOI EXPECTED
    // MLEM VI 0! TRA VE DUNG

    //VIET CODE TEST DE TEST HAM CHINH GETFACTORIAL() CO CHAY DUNG VOI N=0 HAY KO

    static void testFactorialGivenRightArgument5ReturnsWell(){
        int n = 5; // du tinh tinh n!
        long expectedResult = 120; //ket qua ki vong
        long actualResult = MathUtility.getFactorial(5); //tinh thu 0! bang ham

        //so sanh
        System.out.printf(n + "!= \n"+ "Expected value: "
                +expectedResult + "\nActual value: = "+actualResult+"\n\n");

    }



    //TEST CASE #1
    //DESCRIPTION:
    //          TO VERIFY THE getFactorial() method with correct given argument e.g n=0

    //STEP/PROCEDURES: (CAC BUOC TEST HAM/APP, NHAN GI, NHAP GI )
    //              CALL getFactorial() with valid arg: getFactorial(0)

    //EXPECTED RESULT (TA HY VONG HAM TRA VE GI VOI N= 0)
    // To have number 1 as the result of 0

    //STATUS (TRANG THAI CUA TEST CASE LA GI SAU KHI CHAY APP CHAY HAM)
    //          PASS/FAILED
    // CHO XEM HAM, APP XU LY DC SO MAY - ACTUAL VALUE VA DI SO SANH VOI EXPECTED
    // MLEM VI 0! TRA VE DUNG

    //VIET CODE TEST DE TEST HAM CHINH GETFACTORIAL() CO CHAY DUNG VOI N=0 HAY KO


    static void testFactorialGivenRightArgument0ReturnsWell(){
        int n = 0; // du tinh tinh n!
        long expectedResult = 1; //ket qua ki vong
        long actualResult = MathUtility.getFactorial(0); //tinh thu 0! bang ham

        //so sanh
        System.out.printf(n + "!= \n"+ "Expected value: "
                +expectedResult + "\nActual value: = "+actualResult+"\n\n");

    }
}