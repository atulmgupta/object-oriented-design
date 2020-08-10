package com.atul.ood.libraryManagementSystem.model;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword();
}
