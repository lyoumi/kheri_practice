package com.huni.web.service;

import com.huni.web.data.User;

public interface BankUserService {

    void createUser(User user);

    User getUserByName(String name);
}
