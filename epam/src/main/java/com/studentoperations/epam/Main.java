/**
 * author @B G AKSHAYA
 * 
 */

package com.studentoperations.epam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  /**Main Method.
  * @param args command line arguments
  * @throws IOException It may throw IOException
  * @throws FileNotFoundException  It may throw FileNotFoundException
  */
  public static void main(String[] args) throws IOException, FileNotFoundException {
    String studentDetailsFile = "C:\\Users\\APSSDC\\Documents\\Student_Details.csv";
    Scanner fileScanner = new Scanner(new File(studentDetailsFile));
    Scanner consoleScanner = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<Student>();
    String lineRead = "";
    while (fileScanner.hasNextLine()) {
      lineRead = fileScanner.nextLine();
      String[] student = lineRead.split(",");
      String first = student[0]; //first name
      String last = student[1];//last name
      String gender = student[2];
      int age = Integer.parseInt(student[3]);
      String dept = student[4];//department
      int yearOfStudy = Integer.parseInt(student[5]);
      int id = Integer.parseInt(student[6]);
      String collegeName = student[7];
      Student studentRecord = new Student(first,last,gender,age,dept,yearOfStudy,id,collegeName);
      studentList.add(studentRecord);
    }
    fileScanner.close();
    do {
      System.out.println("*---MENU---*");
      System.out.println("1. Search");
      System.out.println("2. Sort");
      System.out.println("3. Exit");
      
      System.out.println("Enter your choice");
      int choice = consoleScanner.nextInt();
      
      if (choice == 3) {
        System.out.print("Program exited");
        break;
      }
      
      if (choice == 1) {
        System.out.println("Search?");
      } else {
        System.out.println("Sort By?");
      }
      
      System.out.println("1. First Name");
      System.out.println("2. Last Name");
      System.out.println("3. Gender");
      System.out.println("4. Age");
      System.out.println("5. Department");
      System.out.println("6. Year of study");
      System.out.println("7. Id");
      System.out.println("8. College Name");
      
      int filterBy = consoleScanner.nextInt();
      if (choice == 1) {
        String searchItem = consoleScanner.next();
        StudentSearch searchObject = new StudentSearch();
        ArrayList<Student> result = searchObject.search(filterBy, searchItem, studentList);
        for (int index = 0; index < result.size(); index++) {
          System.out.println(result.get(index));
        }
      }
      
      if (choice == 2) {
        StudentSort sortObject = new StudentSort();
        ArrayList<Student> result = sortObject.sort(filterBy, studentList);
        for (int index = 0; index < result.size(); index++) {
          System.out.println(result.get(index));
        }
      }

    } while (true);
    consoleScanner.close();
  }
}
