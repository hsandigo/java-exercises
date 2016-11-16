/*Created by humbertosandigo on 11/16/16.*/

import java.util.Scanner;

public class GameDevelopment101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Guess the number we chose :)");
        int random = (int) Math.floor(Math.random() * 101);
        int guess = input.nextInt();

        while (guess != random) {
            System.out.println("Keep guessing!");
//            guess = scanner.nextInt();
        }if (guess > random){
            System.out.println("Lower");
        }else if (guess < random){
            System.out.println("Higher");
        }else{
            System.out.println("GOOD GUESS!");
        }
        input.close();
    }
}
