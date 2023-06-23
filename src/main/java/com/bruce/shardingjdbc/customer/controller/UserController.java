package com.bruce.shardingjdbc.customer.controller;

import com.bruce.shardingjdbc.customer.dto.UserDTO;
import com.bruce.shardingjdbc.customer.query.UserQueryDTO;
import com.bruce.shardingjdbc.customer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService ;

    @PostMapping("list")
    @ResponseBody
    public List<UserDTO> queryUserList(@RequestBody @NotNull UserQueryDTO userQueryDTO){
        return userService.queryUserList(userQueryDTO) ;
    }
}
