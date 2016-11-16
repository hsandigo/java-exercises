/*Created by humbertosandigo on 11/14/16.*/

import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(2 + " plus " + 2 + " is " + add(2, 2));
//        System.out.println(1.3 + " plus " + 2.5 + " is " + add(1.3, 2.5));
        System.out.println(3 + " minus " + 1 + " is " + subtract(3, 1));
        System.out.println(4 + " times " + 3 + " is " + multiply(4, 3));
        System.out.println(4 + " divided by " + 2 + " is " + division(4, 2));

    }


    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

//    private static double add(double a, double b) {
//        return a + b;
//    }

//    private static int rollSixSidedDie() {
//        return (int) Math.ceil(Math.random() * 6);
//    }


}


/*
private static void countToTen(){
    for (int i = 1; i <= 10; i++){
        System.out.println(i);
    }
}
private static int recurToTen (int n){
    if(n <= 10) {
        System.out.println(n);
        recurToTen(n + 1);
    }else{
        return n;
    }
}
*/
