package com;

public class ExchangeMachine extends Coin {


    public ExchangeMachine(int coin1, int coin5, int coin10) {
        super(coin1, coin5, coin10);
    }

    public boolean checkCoin(int money){
        if((super.getCoin1()+(super.getCoin5()*5)+(super.getCoin10()*10)) > money ){
            return true;
        }else{
            return false;
        }
    }

    public Coin exchangeCoin(int money){
        int coin10 =0,coin5=0,coin1=0;
        if(super.getCoin10()*10 > Math.floor(money/10)){

            coin10 = (int) Math.floor(money/10);
            money = (int) (money - (Math.floor(money/10)*10));
        }

        if(super.getCoin5()*5 > Math.floor(money/5) && money!=0){

            coin5 =(int)  Math.floor(money/5);
            money = (int) (money - (Math.floor(money/5)*5));
        }

            coin1 = money;


        return new Coin(coin1,coin5,coin10);
    }


}
