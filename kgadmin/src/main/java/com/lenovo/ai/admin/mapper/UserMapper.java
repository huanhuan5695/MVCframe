package com.lenovo.ai.admin.mapper;

import com.lenovo.ai.admin.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> selectUser();
}