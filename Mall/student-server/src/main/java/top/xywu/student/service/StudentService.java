package top.dibazu.user.service;

import top.dibazu.user.entity.Student;

import java.util.List;

/**
 * @author xywu
 * @date 2021/03/29
 */
public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
