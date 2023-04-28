package com.kishore.users.api;

import com.kishore.users.dto.UserDto;
import com.kishore.users.model.UserModel;
import com.kishore.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserApi {

    private final UserService userService;

    @Autowired
    public UserApi(final UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getUserName/{Id}")
    private String getUserName(@PathVariable("Id") Integer id){

        return userService.getNameById(id);
    }

    @GetMapping("/getAll")
    private List<UserModel> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getAllById/{Id}")
    private List<UserModel> getAllById(@PathVariable("Id") Integer Id){
        return  userService.getAllById(Id);
    }

}
