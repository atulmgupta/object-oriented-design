package com.atul.ood.atm.model;

import com.atul.ood.atm.enums.CustomerStatus;
import com.atul.ood.libraryManagementSystem.model.Account;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private Address address;
	private CustomerStatus status;

	private Card card;
	private Account account;

	public boolean makeTransaction(Transaction transaction);

	public Address getBillingAddress();
}
