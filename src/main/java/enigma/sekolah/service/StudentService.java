package enigma.sekolah.service;

import enigma.sekolah.model.Student;

import java.util.List;

public interface StudentService {
    Student create(Student newStudent);

    List<Student> getAll();

    Student getById(Integer id);

    Student updateById(Integer id, Student updatedStudent);

    void deleteById(Integer id);
}
