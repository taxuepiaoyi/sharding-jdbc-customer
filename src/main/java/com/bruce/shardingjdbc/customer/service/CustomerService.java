package com.bruce.shardingjdbc.customer.service;

import com.bruce.shardingjdbc.customer.dto.UserDTO;
import com.bruce.shardingjdbc.customer.query.UserQueryDTO;

import java.util.List;

public interface CustomerService {

    List<UserDTO> queryUserList(UserQueryDTO userQueryDTO) ;

}
