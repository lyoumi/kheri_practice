package com.huni.web.store.impl;

import com.huni.web.data.User;
import com.huni.web.store.UserStore;

import java.util.HashSet;
import java.util.Set;

public class UserStoreImpl implements UserStore {

    private Set<User> users = new HashSet<>();

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }
}
