package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matchesCount = 20;
        ComputerStep computerStep = new ComputerStep(); //запускаем игру
        String er = "Введите число от 1 до 3 включительно!";
        while (matchesCount != 0) {
            ComputerLogic opponent = new ComputerLogic(); // запускаем ход компьютера
            matchesCount = opponent.countSpich(matchesCount);

            boolean isFlag = true;
            while (isFlag) {
                isFlag = false;
                Scanner scanner = new Scanner(System.in);
                int number = 0;

                String input = scanner.nextLine();

                if (" ".equals(input) || (!("1".equals(input)) && !("2".equals(input)) && !("3".equals(input)) )) {
                    isFlag = true;
                    System.out.println(er);
                }
                else {
                    number = Integer.parseInt(input);
                    if (0 < number && number < 4 ) {
                        isFlag = false;
                        matchesCount = matchesCount - number;
                        computerStep.sayCount(matchesCount);
                    } else {
                        isFlag = true;
                        System.out.println(er);
                    }
                }
            }
        }
        computerStep.sayFinish();
    }
}