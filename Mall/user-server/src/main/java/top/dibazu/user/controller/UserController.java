package top.dibazu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.dibazu.user.entity.User;
import top.dibazu.user.service.UserService;

import javax.annotation.Resource;
import javax.naming.spi.DirStateFactory.Result;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {
    @Resource
    UserService userService;

    @PostMapping(value = "/register")
    public User register(@RequestBody User user) {
        Integer ret = userService.save(user);
        if (ret == 1)
        {
            return Result.ok(user);
        }
        return Result.fail("重名");
    }

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) {
        Integer ret = userService.checkpwd(user);
        if (ret == 1)
        {
            return Result.ok(user);
        }
        return Result.fail("密码错误");
    }

    //@GetMapping(value = "/login")
    //public List<User> findAll() {
    //    return studentService.findAll();
    //}
}
