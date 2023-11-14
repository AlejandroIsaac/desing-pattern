package com.company.capdos.patterndesing.inmmutableobject;

public final class AccountBank {
    private final String nameBank;
    private final int account;

    public AccountBank(String nameBank, int account){
        this.nameBank = nameBank;
        this.account = account;
    }

    public String getNameBank(){
        return nameBank;
    }
    public int getAccount(){
        return account;
    }
}
