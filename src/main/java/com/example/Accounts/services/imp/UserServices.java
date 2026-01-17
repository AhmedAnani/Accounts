package com.example.Accounts.services.imp;

import com.example.Accounts.dto.golbal.ResponseDto;
import com.example.Accounts.dto.user.UserDto;
import com.example.Accounts.dto.user.UserRequestDto;
import com.example.Accounts.dto.user.UserResposneDto;
import com.example.Accounts.exception.Founded;
import com.example.Accounts.exception.NotFound;
import com.example.Accounts.mapper.UserMapper;
import com.example.Accounts.model.User;
import com.example.Accounts.repository.UserRepository;
import com.example.Accounts.services.IUserServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServices implements IUserServices {

    private final UserRepository userRepository;

    UserMapper userMapper;
    @Override
    public ResponseDto createUser(UserDto userDto) {
        if(userRepository.existsByEmail(userDto.getEmail())){
            throw new Founded("Account already exist login pls.");
        }
        User user =userMapper.createUser(userDto);
        userRepository.save(user);
        return new ResponseDto("User created successfully");
    }

    @Override
    public List<UserResposneDto> getAllUsers() {
        List<User> users=userRepository.findAll();

        return userMapper.getAllUsers(users);
    }

//    @Override
//    public UserResposneDto getUser(UserRequestDto userRequestDto) {
//
//        User user=userRepository.findByEmail(userRequestDto.getEmail()).orElseThrow(()->new NotFound("User not found."));
//
//        return userMapper.getUser(user);
//    }

    @Override
    public UserResposneDto getUser(UserRequestDto userRequestDto) {

        User user=userRepository.findByEmail(userRequestDto.getEmail()).orElseThrow(()->new NotFound("User not found."));

        return userMapper.getUser(user);
    }
    @Override
    public ResponseDto deleteUser(UserRequestDto userRequestDto) {
       User user= userRepository.findByEmail(userRequestDto.getEmail()).orElseThrow(()->new NotFound("User not found. "));
       userRepository.deleteById(user.getId());
        return new ResponseDto("User deleted successfully.");
    }
}
