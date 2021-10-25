package top.dibazu.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.dibazu.user.entity.User;
import top.dibazu.user.repository.UserRepository;
import top.dibazu.user.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        //目前用不到
        return userRepository.findAll();
    }

    @Override
    public Integer save(User user) {
        Optional<User> tuser = userRepository.findByUsername(user.getUsername());
        if(tuser.isPresent()) {
            return 0;
        }
        userRepository.save(user);
        return 1;
    }

    @Override
    public Integer checkpwd(User user) {
        Optional<User> tuser = userRepository.findByUsername(user.getUsername());
        if(tuser.isPresent()) {
            if(user.getPassword().equals(tuser.get().getPassword()))
            {
                return 1;
            }
        }
        return 0;
    }
}
