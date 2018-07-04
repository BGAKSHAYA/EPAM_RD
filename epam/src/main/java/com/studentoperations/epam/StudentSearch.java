/**
 * author @B G AKSHAYA
 * 
 */

package com.studentoperations.epam;

import java.util.ArrayList;

public class StudentSearch {

  /*.
 * (1. First Name");
 *  ("2. Last Name"); 
 *  ("3. Gender"); 
 *  ("4. Age");
 * ("5. Department"); 
 * ("6. Year of study"); 
 * ("7. Id"); 
 * ("8. College Name");
 */

  ArrayList<Student> search(int filterBy, String searchItem, ArrayList<Student> studentList) {
    ArrayList<Student> searchResult = new ArrayList<Student>();
    for (int index = 0; index < studentList.size(); index++) {
      Student s = studentList.get(index);
      String dataFound = "";
      if (filterBy == 1) {
        dataFound = s.getFirstName();
      } else if (filterBy == 2) {
        dataFound = s.getLastName();
      } else if (filterBy == 3) { 
        dataFound = s.getGender();
      } else if (filterBy == 4) {
        dataFound = Integer.toString(s.getAge());
      } else if (filterBy == 5) {
        dataFound = s.getDepartment();
      } else if (filterBy == 6) {
        dataFound = Integer.toString(s.getYearOfStudy());
      } else if (filterBy == 7) {
        dataFound = Integer.toString(s.getId());
      } else if (filterBy == 8) {
        dataFound = s.getCollegeName();
      }
      
      if (dataFound.equalsIgnoreCase(searchItem)) {
        searchResult.add(s);
      }
    }
    return searchResult;
  }
}