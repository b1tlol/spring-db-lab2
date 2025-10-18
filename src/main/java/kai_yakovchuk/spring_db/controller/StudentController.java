package kai_yakovchuk.spring_db.controller;

import kai_yakovchuk.spring_db.entity.Student;
import kai_yakovchuk.spring_db.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(path = "/students")
    public @ResponseBody List<Student> getAllStudents() {
        return studentService.findAll();
    }
}