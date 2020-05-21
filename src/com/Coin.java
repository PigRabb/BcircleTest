package com;

public class Coin {
    private int coin1 ;
    private int coin5 ;
    private int coin10 ;


    public Coin(int coin1, int coin5, int coin10) {
        this.setCoin1(coin1);
        this.setCoin5(coin5);
        this.setCoin10(coin10);
    }

    public int getCoin1() {
        return coin1;
    }

    public void setCoin1(int coin1) {
        this.coin1 = coin1;
    }

    public int getCoin5() {
        return coin5;
    }

    public void setCoin5(int coin5) {
        this.coin5 = coin5;
    }

    public int getCoin10() {
        return coin10;
    }

    public void setCoin10(int coin10) {
        this.coin10 = coin10;
    }


}
