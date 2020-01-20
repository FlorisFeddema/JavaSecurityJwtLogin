package dev.feddema.springsecurityjwtlogin.services;

import dev.feddema.springsecurityjwtlogin.exceptions.UniqueValueExistsException;

public interface IUserService {
    void register(String username, String password) throws UniqueValueExistsException;
}
