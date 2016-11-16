/*Created by humbertosandigo on 11/16/16.*/

import java.util.Scanner;

public class GameDevelopment101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Random = (int) Math.floor(Math.random() * 101);
        System.out.println("Guess the number we chose :)");
//        Integer input = sc.nextInt();

        if(input <= 0 || input > 100){
            System.out.println("The input is not valid");
        }

    }
}
