/*Created by humbertosandigo on 11/15/16.*/

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
public class ExceptionsAndErrorHandling {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Student Name: ");
//
//        System.out.println("Enter Student Age: ");
//        Integer input = sc.nextInt();
//
//
//        if(input <= 0 || input > 100){
//            System.out.println("The input is not valid");
//        }
        String studentName;
        int age;
        String reason;

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        studentName = input.nextLine();

        System.out.println("What's your age?");
        age = input.nextInt();

        System.out.println("Why do you want to learn to program?");
        reason = input.nextLine();


        System.out.println("Student name is "+ studentName);
        System.out.println("Student's age is " + age);
        System.out.println("Student wants to learn to code because  " + reason);
    }
}