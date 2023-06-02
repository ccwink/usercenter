package com.wink.usercenter.model.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author wink
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3521771431522355857L;

    private String userAccount;

    private String userPassword;

}
