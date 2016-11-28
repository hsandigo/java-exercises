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

        Student newStudent = new Student(firstName, lastName, score); // how you make an object based off of this class

        System.out.println(newStudent);

        // make an arrayList where each element on the list is a Student object
        ArrayList<Student> students = new ArrayList<>();

        // create the student object
        System.out.print("Please input the student's first name: ");
        firstName = sc.nextLine();

        System.out.print("Please input the student's last name: ");
        lastName = sc.nextLine();

        System.out.println("Please input that student's score: ");
        score = sc.nextInt();

// create a new student object to hold the data for a single student.
        Student newStudent = new Student(firstName, lastName, score);

// put the newStudent object onto the ArrayList
        students.add(newStudent);

    }
}
