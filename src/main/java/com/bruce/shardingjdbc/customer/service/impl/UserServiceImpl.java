package com.bruce.shardingjdbc.customer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.bruce.shardingjdbc.customer.dto.UserDTO;
import com.bruce.shardingjdbc.customer.entity.UserEntity;
import com.bruce.shardingjdbc.customer.mapper.UserMapper;
import com.bruce.shardingjdbc.customer.query.UserQueryDTO;
import com.bruce.shardingjdbc.customer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @DS("master")
    @Override
    public List<UserDTO> queryUserList(UserQueryDTO userQueryDTO) {
        log.info("queryUserList...userQueryDTO = {}.", JSONObject.toJSONString(userQueryDTO));
       List<UserEntity> userEntities = userMapper.queryUserList(userQueryDTO) ;
       if(CollectionUtils.isEmpty(userEntities)){
           return null ;
       }
       List<UserDTO> userDTOList = new ArrayList<>() ;
        for (UserEntity userEntity: userEntities) {
            UserDTO userDTO = UserDTO.builder().build();
            BeanUtils.copyProperties(userEntity,userDTO);
            userDTOList.add(userDTO) ;
        }
        return userDTOList;
    }
}
