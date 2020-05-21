package com;

import java.io.IOException;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeMachine machine = new ExchangeMachine(100,100,100);
        Banknote banknote = new Banknote();

        boolean input_status = true;

        int c =0;

        do{
            do {
                System.out.println("1.Banknote 20");
                System.out.println("2.Banknote 50");
                System.out.println("3.Banknote 100");
                System.out.println("4.Banknote 500");
                System.out.println("5.Banknote 1000");
                System.out.print("Key 1-5 :");
                c = scanner.nextInt();
            }while (c<1 && c>5);

            switch (c){
                case 1 : banknote.setBankNote20(banknote.getBankNote20()+1);
                         break;
                case 2 : banknote.setBankNote50(banknote.getBankNote50()+1);
                         break;
                case 3 : banknote.setBankNote100(banknote.getBankNote100()+1);
                         break;
                default: System.out.println("Can't use this Banknote");
            }

            System.out.println("Total money is "+banknote.getMoney());

            int c1=0;
            do{

                System.out.print("add Banknote 1.yes or 2.no :");
                c1 = scanner.nextInt();

            }while (c1 != 1 && c1 != 2);

            if(c1== 2){
                input_status = false;
            }

        }while (input_status == true);
        if(machine.checkCoin(banknote.getMoney())){
            Coin result = machine.exchangeCoin(banknote.getMoney());
            System.out.println("Coin10 is "+result.getCoin10());
            System.out.println("Coin5 is "+result.getCoin5());
            System.out.println("Coin1 is "+result.getCoin1());
        }else{
            System.out.println("This Machine is enough coins");
        }




    }
}
