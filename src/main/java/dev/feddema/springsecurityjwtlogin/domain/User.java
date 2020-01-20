package dev.feddema.springsecurityjwtlogin.domain;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@Data
public class User extends DatabaseObject{
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;
}
