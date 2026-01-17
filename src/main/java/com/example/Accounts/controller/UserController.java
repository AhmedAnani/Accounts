package com.example.Accounts.controller;

import com.example.Accounts.dto.golbal.ResponseDto;
import com.example.Accounts.dto.user.UserDto;
import com.example.Accounts.dto.user.UserRequestDto;
import com.example.Accounts.dto.user.UserResposneDto;
import com.example.Accounts.services.imp.UserServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
@Validated
public class UserController {
   private final UserServices userServices;


    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity createUser(@Valid @RequestBody UserDto userDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(userServices.createUser(userDto));
    }

    @GetMapping("/all")
    public  ResponseEntity<List<UserResposneDto>>getAllUsers(){
        return ResponseEntity.ok(userServices.getAllUsers());
    }

    @GetMapping
    public ResponseEntity<UserResposneDto> getUser(@Valid@RequestBody UserRequestDto userRequestDto){

        return ResponseEntity.ok(userServices.getUser(userRequestDto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto> deleteUser(@Valid@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.status(HttpStatus.FOUND).body(userServices.deleteUser(userRequestDto));
    }
}
