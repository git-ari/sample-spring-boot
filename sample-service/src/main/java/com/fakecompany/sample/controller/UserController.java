package com.fakecompany.sample.controller;

import com.fakecompany.sample.domain.User;
import com.fakecompany.sample.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Api(tags = {"User"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    @ApiOperation(value = "${UserController.getUsers.value}", nickname = "getUsers", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful. Returned the list of users", response = User.class),
            @ApiResponse(code = 400, message = "Invalid or incorrect requests", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class)
    })
    public ResponseEntity<List<User>> getUsers(@PathVariable(required = false) Integer id) {
        // this.userService.
        return new ResponseEntity(Collections.emptyList(), HttpStatus.OK);
    }

}