package me.dio.service;

import me.dio.domain.model.User;

import java.util.Optional;

public interface UserService extends CrudService<Long, User> {

    User findByName(String username);
}
