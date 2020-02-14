package com.company;

class ComputerStep {

    public void sayBegin(){
        System.out.print("Ход компьютера. ");
    }

    public void sayStepPlayer(){
        System.out.println("Ход игрока. Введите количество спичек (число от 1 до 3).");
    }

    public void sayCount(int i){
        System.out.println("На столе осталось " + i + " спичек(-и/ -а).");
    }

    public void sayFinish(){
        System.out.println("Игра закончена! Компьютер ПОБЕДИЛ!!!");
    }

    public void sayCountCom(int i){
        System.out.println("Компьютер убирает " + i + " спичку(и).");
    }

}