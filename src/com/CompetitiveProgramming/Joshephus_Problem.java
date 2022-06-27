package com.CompetitiveProgramming;

public class Joshephus_Problem {
    static int jef(int people, int start){
        if (people == 0){
            return 1;
        }

        return (jef(people - 1, start) + start) % people;
    }

    public static void main(String[] args) {
        System.out.println(jef(5, 3));
    }
}
