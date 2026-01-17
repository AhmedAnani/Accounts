package com.example.Accounts.mapper;

import com.example.Accounts.dto.user.UserDto;
import com.example.Accounts.dto.user.UserResposneDto;
import com.example.Accounts.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    public User createUser(UserDto userDto){

        User user=new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPhone(userDto.getPhone());
        return user;
    }

    public List<UserResposneDto> getAllUsers(List<User> users) {
        return users.stream().map(user -> new UserResposneDto(user.getId(), user.getName(), user.getEmail(),user.getPhone())).toList();
    }

    public UserResposneDto getUser(User user) {
        return new UserResposneDto(user.getId(), user.getName(), user.getEmail(), user.getPhone());
    }
}
