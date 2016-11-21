/**
 * Created by humbertosandigo on 11/21/16.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //two line

        //int numberOfElementsOnArray = 10
        int[] arrayOfInts;
        arrayOfInts = new int[5];

        //one line
        int[] arrayOfIntegers = new int[10]; //instead of 10 you would put numberOfElementsOnArray

        boolean[] arrayOfBooleans = new boolean[2];
        System.out.println(arrayOfBooleans[0]);
        System.out.println(arrayOfBooleans[1]);


        //shortcut syntax
        String[] arrayOfStrings = {"clean code", "head first java", "pragmatic programmer"};

        for(String title: arrayOfStrings){
            System.out.println(title);
        }

        double[] prices = {1.99, 2.99, 3.85, 1.95, 14999.99};
        double sum = 0;
        double average;

        for (double price : prices){
            sum += price;
        }
        average = sum / prices.length;
        System.out.println("Average price is " + average);


    }
}
