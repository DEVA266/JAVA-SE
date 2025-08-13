package org.example;

public class OldUser {
    public String adminName ;
    public long mobileNumber ;
    public double accountBalance ;

    void setAdminName(String name){
        this.adminName = name;
    }
    void setMobileNumber(long number){
        this.mobileNumber = number;
    }

    void setAccountBalance(double userBalance){
        this.accountBalance = userBalance;
    }

    String getAdminName(){
        return this.adminName;
    }

    long getMobileNumber(){
        return this.mobileNumber;
    }

    double getAccountBalance() {
        return this.accountBalance;
    }
}
