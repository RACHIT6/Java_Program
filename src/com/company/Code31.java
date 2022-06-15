package com.company;
import java.util.Scanner;

interface TVRemote{
    void ChangeChannel();
    void ChangeVolume();
}

interface SmartTVRemote extends TVRemote{
    void VoiceCommand();
}

class TV implements SmartTVRemote{
    public final Scanner sc = new Scanner(System.in);

    public void VoiceCommand(){
        System.out.println("Could not found internet services now");
    }

    public void ChangeChannel(){
        System.out.println("Press '+' to increment and '-' to decrement");
        String choice = sc.next();

        if (choice.equals("+")){
            System.out.println("Increasing...");
        }

        else{
            System.out.println("Decreasing...");
        }
    }

    public void ChangeVolume(){
        System.out.println("Press '+' to increment and '-' to decrement the volume");
        String choice = sc.next();

        if (choice.equals("+")){
            System.out.println("Increasing Volume...");
        }

        else{
            System.out.println("Decreasing Volume...");
        }
    }
}

public class Code31 {
    public static void main(String[] args) {
        TV obj = new TV();

        obj.ChangeChannel();
        obj.ChangeVolume();
    }
}
