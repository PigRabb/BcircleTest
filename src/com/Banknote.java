package com;

public class Banknote {
    private int bankNote20=0;
    private int bankNote50=0;
    private int bankNote100=0;


    public int getBankNote20() {
        return bankNote20;
    }

    public void setBankNote20(int bankNote20) {
        this.bankNote20 = bankNote20;
    }

    public int getBankNote50() {
        return bankNote50;
    }

    public void setBankNote50(int bankNote50) {
        this.bankNote50 = bankNote50;
    }

    public int getBankNote100() {
        return bankNote100;
    }

    public void setBankNote100(int bankNote100) {
        this.bankNote100 = bankNote100;
    }

    public int getMoney(){
        return (this.bankNote20*20)+(this.bankNote50*50)+(this.bankNote100*100);
    }
}
