/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banksystem.Account;


import java.util.Hashtable;

/**
 *
 * @author Admin
 */
public class AccountCache {

    private static Hashtable<String, Account> accountMap = new Hashtable<String, Account>();

    public static Account getAccount(String accountId) {
        Account cachedAccount = accountMap.get(accountId);
        return (Account) cachedAccount.clone();
    }

    public static void loadCache() {
        
        SavingsAccount savings = new SavingsAccount();
        savings.setAccount_no(1);
        String savings_id = Integer.toString(savings.getAccount_no());
        accountMap.put(savings_id,savings);
        
    }
        
}
