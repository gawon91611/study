package com.example.springboot.bean;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ToString
public class LoginRequestBean implements Serializable {

    @NotNull
    private String loginId;

    @NotNull
    private String password;


}
