package com.wink.usercenter.model.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author wink
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3521771431522355857L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
