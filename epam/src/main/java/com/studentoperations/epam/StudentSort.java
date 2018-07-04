/**
 * author @B G AKSHAYA
 * 
 */

package com.studentoperations.epam;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

  ArrayList<Student> sort(int filterBy, ArrayList<Student> studentList) {
    if (filterBy == 1) {
      Collections.sort(studentList, Student.FirstNameComparator);
    } else if (filterBy == 2) {
      Collections.sort(studentList, Student.LastNameComparator);
    } else if (filterBy == 3) { 
      Collections.sort(studentList, Student.GenderComparator);
    } else if (filterBy == 4) {
      Collections.sort(studentList, Student.AgeComparator);
    } else if (filterBy == 5) {
      Collections.sort(studentList, Student.DepartmentComparator);
    } else if (filterBy == 6) {
      Collections.sort(studentList, Student.YearOfStudyComparator);
    } else if (filterBy == 7) {
      Collections.sort(studentList, Student.IdComparator);
    } else if (filterBy == 8) {
      Collections.sort(studentList, Student.CollegeNameComparator);
    }
    return studentList;

  }
}
