package com.bruce.shardingjdbc.customer.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息DTO
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    /**
     * 主键ID.
     */
    private Long userId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 性别 1-男性 2-女性
     */
    private int sex ;

    /**
     * 年龄
     */
    private int age ;

    /**
     * 记录状态 0-有效 1-无效
     */
    private int status ;
}
