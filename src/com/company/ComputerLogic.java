package com.company;

public class ComputerLogic {


    ComputerStep sc = new ComputerStep();
    public int countSpich(int n){
        sc.sayBegin();

        if (n % 4 == 0){
            n = n - 3 ;
            sc.sayCountCom(3);
            sc.sayCount(n);
            sc.sayStepPlayer();
        }

        else if (n % 2 == 0){
            n = n - 1 ;
            sc.sayCountCom(1);
            sc.sayCount(n);
            sc.sayStepPlayer();
        }

        else {
            n = n - 2;
            sc.sayCountCom(2);
            sc.sayCount(n);
            sc.sayStepPlayer();
        }
        return n;
    }

}