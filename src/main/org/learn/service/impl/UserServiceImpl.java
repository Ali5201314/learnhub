package main.org.learn.service.impl;

import main.org.learn.entity.User;
import main.org.learn.repo.UserRepo;
import main.org.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepo userRepo;


    @Override
    public void addUser(User user) {
        userRepo.saveAndFlush(user);
    }

    @Override
    public Optional<User> findUser(String username, String password) {
       return userRepo.findByUsernameAndPassword(username, password);
    }


}
