/**
 * Created by humbertosandigo on 11/28/16.
 */

import java.util.Scanner;

public class StudentRecordApp {
    public static void main(String[] args) {
        //prompt user for input
        //how many students?
        //then instantiate or create that many student objects

        Scanner sc = new Scanner(System.in);
        String addMoreStudents;
        String firstName;
        String lastName;
        int score;

        System.out.println("Welcome to the Student Records Application");
//        do {

        System.out.println("Please input the student's first name: ");
        firstName = sc.nextLine();

        System.out.println("Please input the student's last name: ");
        lastName = sc.nextLine();

        System.out.println("Please input that student's score: ");
        score = sc.nextInt();

        Student newStudent = new Student(firstName, lastName, score); // how you make an object based off of this class

        System.out.println(newStudent);

        ArrayList<Student> students = new ArrayList<>();
        students.add(newStudent);

//        } while (addMoreStudents.equalsIgnoreCase("y"));

        //instead of hard-coding "bob", get this input from the Scanner input
//        newStudent.firstName = "Bob";
//        newStudent.lastName = "Bobberson";
//        newStudent.score = 100;

    }
}
