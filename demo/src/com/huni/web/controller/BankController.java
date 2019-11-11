package com.huni.web.controller;

import com.huni.web.service.BankCreditService;
import com.huni.web.service.BankUserService;

import java.util.Scanner;

public class BankController {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String EXIT_SIGNAL = "exit";

    private final BankUserService bankUserService;
    private final BankCreditService bankCreditService;

    public BankController(BankUserService bankUserService,
            BankCreditService bankCreditService) {
        this.bankUserService = bankUserService;
        this.bankCreditService = bankCreditService;
    }

    public void handleUserInput() {
        System.out.println("Welcome to the Braavos Bank");
        final String input = SCANNER.next();
        while (!input.equals(EXIT_SIGNAL)) {

        }
    }
}
