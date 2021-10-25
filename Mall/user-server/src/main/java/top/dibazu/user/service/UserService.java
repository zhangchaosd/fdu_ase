package top.dibazu.user.service;

import top.dibazu.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    Integer save(User user);
    Integer checkpwd(User user);
}
