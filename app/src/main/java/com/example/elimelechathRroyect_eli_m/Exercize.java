package com.example.elimelechathRroyect_eli_m;

import java.util.Random;

public class Exercize{

        private int num;
        private int num2;
        private int num3;



                public  void challenge(){
                        Random r = new Random();
                         num = r.nextInt(99)+1;
                         num2 = r.nextInt(9)+1;
                }

                public void loah() {
                    Random r = new Random();
                    num = r.nextInt(9) + 1;
                    num2 = r.nextInt(9) + 1;
                }

                public void loah20(){
                    Random r = new Random();
                    num = r.nextInt(19) + 1;
                    num2 = r.nextInt(9) + 1;
                }

                public boolean test(String sst){
                    num3=num*num2;
                    int rt=Integer.valueOf(sst);

                    if(num3==rt) {
                    return true;
                    }
                    else return false;

              }


    public int getNum() {
        return num;
    }


    public int getnum2() {
        return  num2;
    }
}