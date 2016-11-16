/*Created by humbertosandigo on 11/11/16.*/

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

//        double userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Something: ");
//        userInput = sc.nextDouble();
//        System.out.println("You entered: " + userInput);

//        String userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        userInput = sc.nextLine();
//        System.out.println("You entered: " + userInput);

        int width;
        int length;

        String userInput;

        System.out.println("welcome to the room calculator");
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter width: ");
            width = sc.nextInt();
            System.out.println("enter the length: ");
            length = sc.nextInt();

            System.out.println("the room has a perimeter of " + perimeter(width, length));
            System.out.println("the area is " + area(width, length));

            System.out.println("thank you for using the room calculator");
            System.out.println("do you want to calculate another room? ");
            userInput = sc.next();

        } while (userInput.equals("y"));

        System.out.println("thank you for using the room calculator");
    }

    public static int perimeter(int width, int height) {return 2 * width + 2 * height;}

    public static int area(int width, int height) {return 2 * width + 2 * height;}

}

//
//    public static void typeExample(){
//    byte numberExample = 12;
//        System.out.println(numberExample);
//
//    short numberExampleTwo = 14567;
//        System.out.println(numberExampleTwo);
//
//    int numberExampleThree = 345531642;
//        System.out.println(numberExampleThree);
//
//    long numberExampleFour = 785982782;
//        System.out.println(numberExampleFour);
//
//    float numberExampleFive = (float) 1.1853;
//        System.out.println(numberExampleFive);
//
//    double numberExampleSix = .0873651426354623;
//        System.out.println(numberExampleSix);
//
//    char something = 'o';
//        System.out.println(something);
//
////these are both valid ways of writing things
//
//    boolean somethingElse;
//        somethingElse = true;
//        System.out.println(somethingElse);
//
//    }

