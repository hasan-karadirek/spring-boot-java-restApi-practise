package com.hasan.sprindemo.student;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DBStudentService implements StudentService {

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();

    }

    @Override
    public Student save(Student s) {

        return repository.save(s);

    }

    @Override
    public Student update(Student s) {

        return repository.save(s);
    }

    @Override
    public Student findByEmail(String email) {

        return repository.findByEmail(email);
    }

    @Override
    public void delete(String email) {

        repository.deleteByEmail(email);
    }
}
