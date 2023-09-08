/*
 * Kasun Miuranga
 * Copyright (c) 2023
 */

package lk.ijse.bo.custom;


import lk.ijse.bo.SuperBO;
import lk.ijse.dto.StudentDTO;

import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    Boolean addStudent(StudentDTO studentDTO);

    Boolean deleteStudent(StudentDTO studentDTO);

    ArrayList<StudentDTO> getStudentData();

    String getCurrentID();

    Boolean updateStudent(StudentDTO studentDTO);
}
