package com.gvs.cloud.training.customer.account.details.model;

public class AutoLoanAccount extends Account{
    private String loanNumber;
    private String loanFinancialCompany;
    private String branchName;
    private Double totalLoanAmount;
    private Double monthlyLoanAmount;

    private Integer loanTenure;

    @Override
    public Double calculateAvailableBalance(Double currentBal, Double transAmtPosted) {
        return currentBal - transAmtPosted;

    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getLoanFinancialCompany() {
        return loanFinancialCompany;
    }

    public void setLoanFinancialCompany(String loanFinancialCompany) {
        this.loanFinancialCompany = loanFinancialCompany;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Double getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public void setTotalLoanAmount(Double totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public Double getMonthlyLoanAmount() {
        return monthlyLoanAmount;
    }

    public void setMonthlyLoanAmount(Double monthlyLoanAmount) {
        this.monthlyLoanAmount = monthlyLoanAmount;
    }

    public Integer getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(Integer loanTenure) {
        this.loanTenure = loanTenure;
    }
}
