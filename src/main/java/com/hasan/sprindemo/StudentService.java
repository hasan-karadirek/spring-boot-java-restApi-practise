package com.hasan.sprindemo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(new Student("hasan2", "karadirek", LocalDate.now(), "hasankaradirek3@gmail.com", 34));
    }
}
