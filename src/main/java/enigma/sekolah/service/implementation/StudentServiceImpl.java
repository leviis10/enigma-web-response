package enigma.sekolah.service.implementation;

import enigma.sekolah.model.Student;
import enigma.sekolah.repository.StudentRepository;
import enigma.sekolah.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student create(Student newStudent) {
        String prefix = newStudent.getName() + newStudent.getBirthDate().getTime();
        newStudent.setNim(prefix);
        return studentRepository.save(newStudent);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateById(Integer id, Student updatedStudent) {
        Student student = getById(id);
        student.setName(updatedStudent.getName());
        student.setNim(updatedStudent.getNim());
        student.setBirthDate(updatedStudent.getBirthDate());
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
