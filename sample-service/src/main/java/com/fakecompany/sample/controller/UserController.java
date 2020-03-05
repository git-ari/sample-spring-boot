package com.fakecompany.sample.controller;

import com.fakecompany.sample.domain.User;
import com.fakecompany.sample.domain.UserRequest;
import com.fakecompany.sample.service.UserService;
import com.fakecompany.sample.utils.Loggable;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"User"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UserController implements Loggable {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    @ApiOperation(value = "${UserController.getUsers.value}", nickname = "getUsers", response = User.class, responseContainer = "List")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successful. Returned the list of users", response = User.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid or incorrect requests", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class)
    })
    public ResponseEntity<List<User>> getUsers(@PathVariable(required = false) Integer id) {
        logger().info("Getting users with id: {}", id);
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @PostMapping(value = "/users")
    @ApiOperation(value = "${UserController.createUser.value}", nickname = "createUser", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully created a user", response = User.class),
            @ApiResponse(code = 400, message = "Invalid or incorrect requests", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class)
    })
    public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
        logger().info("Creating user with name: {}", userRequest.getName());
        return new ResponseEntity(this.userService.createUser(userRequest), HttpStatus.OK);
    }

    @PutMapping(value = "/users")
    @ApiOperation(value = "${UserController.updateUser.value}", nickname = "updateUser", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully updated user", response = User.class),
            @ApiResponse(code = 400, message = "Invalid or incorrect requests", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class)
    })
    public ResponseEntity<Void> updateUser(@PathVariable(required = false) Integer id) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @DeleteMapping(value = "/users")
    @ApiOperation(value = "${UserController.deleteUser.value}", nickname = "deleteUser", response = User.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully deleted the user"),
            @ApiResponse(code = 400, message = "Invalid or incorrect requests", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class)
    })
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

}