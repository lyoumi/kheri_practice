package com.huni.web.store;

import com.huni.web.data.User;

public interface UserStore {
    void createUser(User user);

    User findUserByName(String name);
}
