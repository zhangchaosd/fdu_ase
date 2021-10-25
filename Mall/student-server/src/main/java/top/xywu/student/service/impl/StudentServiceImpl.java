package top.dibazu.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.dibazu.user.entity.Student;
import top.dibazu.user.repository.StudentRepository;
import top.dibazu.user.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xywu
 * @date 2021/03/29
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
