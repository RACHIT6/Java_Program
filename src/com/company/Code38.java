package com.company;

public class Code38 {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 1; i < 10; i++) {
            try{
                res = (1/i);
                break;
            }
            catch (Exception e){
                System.out.println("Can't find");
            }

            finally {
                System.out.println(res);
            }
        }
    }
}
