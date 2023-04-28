package com.kishore.users.dao;

import com.kishore.users.dto.UserDto;
import com.kishore.users.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    List<UserModel> findAllById(Integer Id);
}
