/**
* author @B G AKSHAYA
* 
*/

package com.studentoperations.epam;

import java.util.Comparator;

public class Student implements Comparable<Student> {
  private int id;
  private int age;
  private int yearOfStudy;
  private String firstName;
  private String lastName;
  private String department;
  private String collegeName;
  private String gender;
  /** Student constructor.
   * @param f firstName
   * @param l lastName
   * @param gender Gender 
   * @param age Age of student
   * @param dept department of Student
   * @param year Year of study
   * @param id id of student
   * @param clg college name of student
   */
  
  public Student(String f,String l,String gender,int age,String dept,int year,int id,String clg) {
    this.id = id;
    this.firstName = f;
    this.lastName = l;
    this.gender = gender;
    this.age = age;
    this.department = dept;
    this.yearOfStudy = year;
    this.collegeName = clg;
  }
  
  /*
   * Method to get FirstName
   */
  public String getFirstName() {
    return firstName;
  }
  
  /*
   * Method to set FirstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  /*
   * Method to get LastName
   */
  public String getLastName() {
    return lastName;
  }

  /*
   * Method to set LastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  /*
   * Method to get Gender
   */
  public String getGender() {
    return gender;
  }
  
  /*
   * Method to set Gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  /*
   * Method to get Age
   */
  public int getAge() {
    return age;
  }
  
  /*
   * Method to set Age
   */
  public void setAge(int age) {
    this.age = age;
  }

  /*
   * Method to get Department
   */
  public String getDepartment() {
    return department;
  }

  /*
   * Method to set Department
   */
  public void setDepartment(String department) {
    this.department = department;
  }
  
  /*
   * Method to get YearOfStudy
   */
  public int getYearOfStudy() {
    return yearOfStudy;
  }

  /*
   * Method to set YearOfStudy
   */
  public void setYearOfStudy(int yearOfStudy) {
    this.yearOfStudy = yearOfStudy;
  }
  
  /*
   * Method to get id
   */
  public int getId() {
    return id;
  }

  /*
   * Method to set id
   */
  public void setId(int id) {
    this.id = id;
  }

  /*
   * Method to get CollegeName
   */
  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  /*
   * Method to set CollegeName
   */
  public String getCollegeName() {
    return collegeName;
  }
  
  /**.
   *  This method is called when a Student object is printed
   */
  
  public String toString() {
    String ages = Integer.toString(age);
    String year = Integer.toString(yearOfStudy);
    String ids = Integer.toString(id);
    return firstName + " " + lastName + " " + gender + " " + ages 
      + " " + department + " " + year + " " + ids + " " + collegeName;

  }
  
  public int compareTo(Student s1) { //default comparator
    return (this.id - s1.id);
  }

  public static Comparator<Student> FirstNameComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getFirstName().compareTo(s2.getFirstName());
    }
  };

  public static Comparator<Student> LastNameComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getLastName().compareTo(s2.getLastName());
    }
  };

  public static Comparator<Student> GenderComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getGender().compareTo(s2.getGender());
    }
  };

  public static Comparator<Student> AgeComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getAge() - s2.getAge();
    }
  };

  public static Comparator<Student> DepartmentComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getDepartment().compareTo(s2.getDepartment());
    }
  };

  public static Comparator<Student> YearOfStudyComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getYearOfStudy() - s2.getYearOfStudy();
    }
  };

  public static Comparator<Student> IdComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getId() - s2.getId();
    }
  };

  public static Comparator<Student> CollegeNameComparator = new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
      return s1.getCollegeName().compareTo(s2.getCollegeName());
    }
  };



} 
