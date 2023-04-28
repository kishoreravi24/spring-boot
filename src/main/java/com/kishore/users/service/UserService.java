package com.kishore.users.service;

import com.kishore.users.dao.UserRepository;
import com.kishore.users.dto.UserDto;
import com.kishore.users.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;
    UserDto userDto = new UserDto();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Find userName by Id
    public String getNameById(Integer Id){
        userDto.setUsername(userRepository.findById(Id).get().getUsername());
        return userDto.getUsername();
    }

    public List<UserModel> getAll(){
        return userRepository.findAll();
    }

    public List<UserModel> getAllById(Integer Id){
        return userRepository.findAllById(Id);
    }
}
