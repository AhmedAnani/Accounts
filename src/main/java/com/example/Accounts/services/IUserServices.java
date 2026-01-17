package com.example.Accounts.services;

import com.example.Accounts.dto.golbal.ResponseDto;
import com.example.Accounts.dto.user.UserDto;
import com.example.Accounts.dto.user.UserRequestDto;
import com.example.Accounts.dto.user.UserResposneDto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUserServices {
    /**
     * Create user
     * @Param UserDto
     * @Return ResponseDto
     *
     */
    ResponseDto createUser(UserDto userDto);

    /**
     * Get all users
     * @Return List of UserDto
     *
     */
    List<UserResposneDto> getAllUsers();
    /**
     * Get user
     * @Param userRequestDto
     * @Return UserResponseDto
     *
     */
    UserResposneDto getUser(UserRequestDto userRequestDto);

    /**
     * Delete user
     * @Param userRequestDto
     * @Return ResponseDto
     *
     */
    @Transactional
    @Modifying
    ResponseDto deleteUser(UserRequestDto userRequestDto);
}
