package kai_yakovchuk.spring_db.service;

import kai_yakovchuk.spring_db.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
}