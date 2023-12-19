package com.app.log_reg.services;

import com.app.log_reg.dtos.LoginUserDto;
import com.app.log_reg.dtos.RegisterUserDto;
import com.app.log_reg.exceptions.IncorrectLoginCredentialsException;
import com.app.log_reg.exceptions.UserAlreadyExistsException;
import com.app.log_reg.models.User;

public interface UserService {
    User registerUser(RegisterUserDto registerUserDto) throws UserAlreadyExistsException;
    User loginUser(LoginUserDto loginUserDto) throws IncorrectLoginCredentialsException;
}
