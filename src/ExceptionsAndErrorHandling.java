/*Created by humbertosandigo on 11/15/16.*/

import java.util.Scanner;
public class ExceptionsAndErrorHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");

        System.out.println("Enter Student Age: ");
        Integer input = sc.nextInt();


        if(input <= 0 || input > 100){
            System.out.println("The input is not valid");
        }



    }
}