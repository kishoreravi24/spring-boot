package com.kishore.users.service;

import com.kishore.users.dao.UserRepository;
import com.kishore.users.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserModel> getName(Integer Id){
        return userRepository.findById(Id);
    }
}
