package enigma.sekolah.controller;

import enigma.sekolah.model.Student;
import enigma.sekolah.service.StudentService;
import enigma.sekolah.utils.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Student create(@RequestBody Student newStudent) {
        return studentService.create(newStudent);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return Response.renderJson(
                studentService.getAll(),
                "Success",
                HttpStatus.OK
        );
    }
}
