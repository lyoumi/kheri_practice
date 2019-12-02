package com.huni.web.store;

import com.huni.web.data.User;

import java.util.List;

public interface UserStore {
    void createUser(User user);

    User findUserByName(String name);

    List<String> findAll();
}
