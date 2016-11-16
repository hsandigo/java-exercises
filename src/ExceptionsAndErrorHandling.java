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
//        if(age <= 0 || age > 115){
//            System.out.println("The input is not valid");
//        }
//
//
        String studentName;
        int age;
        String reason;

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("What's your name?");
        studentName = input.next();

        //wishful thinking
        age = askStudentForHerAge(input);

        System.out.println("Why do you want to learn to program?");
        reason = input.next();

        System.out.println("Student name is " + studentName);
        System.out.println("Student's age is " + age);
        System.out.println("Student wants to learn to code because  " + reason);

        input.close();
    }

    public static int askStudentForHerAge(Scanner input) {

        try {
            System.out.println("What's your age?");
            int age = input.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age must be a positive integer number");
            }
            return age;

        } catch (Exception e) { //Exception e
            input.next();
            System.out.println("Invalid age. Age must be an integer number");
            return askStudentForHerAge(input);

//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//            return askStudentForHerAge(input);

        }
    }
}