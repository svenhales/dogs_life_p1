package com.qa;

import java.util.Arrays;

public class Account implements Comparable<Account> {
    private String cardTypes[];
    private String sortCard;
    private String accountNumber;
    private String password;

    public Account(String[] cardTypes, String sortCode, String accountNumber, String password){
        super();
        this.cardTypes = cardTypes;
        this.sortCard = sortCode;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String[] getCardTypes(){
        return cardTypes;
    }

    public void setCardTypes(String[] cardTypes){
        this.cardTypes = cardTypes;
    }

    public String getSortCard(){
        return sortCard;
    }

    public void setSortCard(String sortCard){
        this.sortCard = sortCard;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int compareTo(Account thatAct){
        if(Arrays.asList(this.cardTypes).contains(thatAct.cardTypes[0]))
            if (this.sortCard.equals(thatAct.sortCard))
                if (this.accountNumber.equals(thatAct.accountNumber))
                    if(this.password.equals(thatAct.password)){
                        return 0;
                    }
        return -1;
    }

}
