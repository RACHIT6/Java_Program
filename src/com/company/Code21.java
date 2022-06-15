package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    private final int RandNo;
    private int GuessedNo;
    public int NoOfGuesses = 0;
    private final Scanner sc = new Scanner(System.in);

    public Game(){
        Random obj = new Random();
        RandNo = obj.nextInt(101);
    }

    public int GetRand(){
        return RandNo;
    }

    public void SetData(){
        System.out.print("Enter any number: ");
        GuessedNo = sc.nextInt();
    }

    public int GetData(){
        return GuessedNo;
    }

    public Boolean IsCorrectNumber(){
        return RandNo == GuessedNo;
    }
}

public class Code21 {
    public static void main(String[] args) {
        Game obj = new Game();

        while (!obj.IsCorrectNumber()){
            obj.SetData();
            if (obj.GetData() < obj.GetRand()){
                System.out.println("Smaller");
            }

            else{
                System.out.println("Greater");
            }

            obj.NoOfGuesses++;
        }

        System.out.println("Congratulation! You have Guess the number in "+ obj.NoOfGuesses+ " guesses");
    }
}
