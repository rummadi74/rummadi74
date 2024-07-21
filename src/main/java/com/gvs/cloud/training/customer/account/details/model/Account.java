package com.gvs.cloud.training.customer.account.details.model;

public abstract class Account {

    private String accountReferenceId;

    private String  firstName;

    private String lastName;

    private String customerReferenceId;

    private String accountNumber;

    private String sorId;

    private Double availableBalance;

    private Double currentBalance;

    private String routingNumber;

    public String getAccountReferenceId() {
        return accountReferenceId;
    }

    public void setAccountReferenceId(String accountReferenceId) {
        this.accountReferenceId = accountReferenceId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerReferenceId() {
        return customerReferenceId;
    }

    public void setCustomerReferenceId(String customerReferenceId) {
        this.customerReferenceId = customerReferenceId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSorId() {
        return sorId;
    }

    public void setSorId(String sorId) {
        this.sorId = sorId;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    public abstract Double calculateAvailableBalance(
            Double currentBal, Double transPosted);
}
