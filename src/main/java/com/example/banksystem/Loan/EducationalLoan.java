package com.example.banksystem.Loan;

import com.example.UserFactory.User;

public class EducationalLoan extends Loan{
    User user;
    @Override
    public void ApplyForLoan() {

    }

    @Override
    public double InterestRate(int numOfMonths) {
        if(numOfMonths==6) {
            rate =0.15;
            //return (Amount + rate * Amount) / numOfMonths;
        } else if (numOfMonths==12) {
            rate=0.20;

        }
        return rate;
    }

    @Override
    public double CalcMonthlyPaid(int numOfMonths) {
    return (Amount + rate* Amount) / numOfMonths;
    }
}
