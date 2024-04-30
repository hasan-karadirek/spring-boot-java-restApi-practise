package com.hasan.sprindemo.student;

import java.util.List;

public interface StudentService {

    Student save(Student s);

    Student update(Student s);

    Student findByEmail(String email);

    List<Student> findAllStudents();

    void delete(String email);
}
