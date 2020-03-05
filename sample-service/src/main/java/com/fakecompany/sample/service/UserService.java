package com.fakecompany.sample.service;

import com.fakecompany.sample.domain.User;
import com.fakecompany.sample.domain.UserRequest;
import com.fakecompany.sample.exception.EmptyNameException;
import com.fakecompany.sample.utils.Loggable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements Loggable {
    public UserService() {
    }

    public User createUser(UserRequest userRequest){
//        validateUserRequest(userRequest);
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    private void validateUserRequest(UserRequest userRequest){
        if(userRequest.getName().isEmpty()){
            throw new EmptyNameException();
        }
    }
}