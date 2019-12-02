package com.huni.web.store.impl;

import com.huni.web.data.User;
import com.huni.web.exceptions.SimpleCustomException;
import com.huni.web.store.UserStore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserStoreImpl implements UserStore {

    private Set<User> users = new HashSet<>();

    FileWriter fileWriter = new FileWriter("test.txt");
    BufferedWriter writer = new BufferedWriter(fileWriter);

    FileReader fileReader = new FileReader("test.txt");
    BufferedReader reader = new BufferedReader(fileReader);

    public UserStoreImpl() throws IOException {
    }

    @Override
    public void createUser(User user) {
        users.add(user);
        try {
            writer.append(user.getName());
            writer.close();
        } catch (IOException e) {
            throw new SimpleCustomException("Unable to save to file", e);
        }
    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Override
    public List<String> findAll() {
        List<String> strings = new ArrayList<>();
        try {
            strings.add(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new SimpleCustomException("Unable to read from file", e);
        }
        return strings;
    }

    public static void main(String[] args) throws IOException {
        UserStore userStore = new UserStoreImpl();
        userStore.createUser(new User("1", "username", "Vasya", "Pupkin"));
        for (String s : userStore.findAll()) {
            System.out.println(s);
        }
    }
}
