package com.huni.web;

import com.huni.web.controller.BankController;
import com.huni.web.service.BankCreditService;
import com.huni.web.service.BankUserService;
import com.huni.web.service.impl.BankCreditServiceImpl;
import com.huni.web.service.impl.BankUserServiceImpl;
import com.huni.web.store.UserStore;
import com.huni.web.store.impl.UserStoreImpl;

public class MainClass {

    public static void main(String[] args) {
        BankCreditService bankCreditService = new BankCreditServiceImpl();
        UserStore userStore = new UserStoreImpl();
        BankUserService bankUserService = new BankUserServiceImpl(userStore);
        BankController bankController = new BankController(bankUserService, bankCreditService);
        bankController.handleUserInput();
    }

}
