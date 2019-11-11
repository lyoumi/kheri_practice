package com.huni.web.service.impl;

import com.huni.web.data.User;
import com.huni.web.service.BankUserService;
import com.huni.web.store.UserStore;

public class BankUserServiceImpl implements BankUserService {

    private final UserStore userStore;

    public BankUserServiceImpl(UserStore userStore) {
        this.userStore = userStore;
    }

    @Override
    public void createUser(User user) {
        userStore.createUser(user);
    }

    @Override
    public User getUserByName(String name) {
        return userStore.findUserByName(name);
    }
}
