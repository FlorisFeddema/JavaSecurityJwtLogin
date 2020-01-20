package dev.feddema.springsecurityjwtlogin.domain.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;

@Data
@AllArgsConstructor
public class UserPojo {
    private String username;
    private String password;
}
