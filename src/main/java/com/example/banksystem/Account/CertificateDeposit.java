/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banksystem.Account;

/**
 *
 * @author Admin
 */
public class CertificateDeposit extends SavingsAccount{
     public CertificateDeposit() {
        type = "Certificate Deposit";
    }
    public float Withdraw(float w){
        float new_balance = getBalance() - w;
        //penalty
        new_balance *= 0.8;
        setBalance(new_balance);
        return new_balance;
    }
}
