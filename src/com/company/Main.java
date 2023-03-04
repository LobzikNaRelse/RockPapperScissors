package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

// Rock, Paper, Scissors
public class Main {

    public static void main(String[] args) {
        Player bot = new Player();
       // Scanner scan = new Scanner(System.in);
        Integer a;
        do {
                System.out.println("Vvedite chislo ot 1 do 3 (1-Scissors;2-Paper;3-Rock): ");
            try
            {
                Scanner scan = new Scanner(System.in);
                a = scan.nextInt();
                if (a == 1 || a == 2 || a == 3)
                    break;
            } catch(InputMismatchException e)
            {
                System.out.println("Nugno vvesti chislo");
            }
        } while (true);


        Player human = new Player(a, "Human");
        //  Player human = new Player(Variants.Scissors, "Alex"); // Я решил добавить выбор игрока
        // есть вызов закомментированного метода что бы все работало как в задании

        bot.whoWins(bot, human); //зачем sout если можно его в метод запихнуть, мне кажется так гармоничнее
    }
}
