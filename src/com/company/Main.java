package com.company;

public class Main {

    public static void main(String[] args) {
        int temp = temp();
        int age = Age();
        if (temp >= -20 && temp <= 30){
            if ( age >= 20 && age <= 45){
                walk();
            }else {
                home();
            }
        }

        if (temp >= 0 && temp <= 28){
            if ( age <= 20){
                walk();
            }else {
                home();
            }
        }

        if ( temp >= -10 && temp <= 25){
            if (age >= 45){
                walk();
            }else {
                home();
            }
        }


    }


    public static void walk(){
        System.out.println("Можете идти гулять!");

    }


    public static void home(){
        System.out.println("Оставайтесть дома!");

    }


    public static int Age()  {
        int a = (int) (Math.random() * 100);
        System.out.println(a);
        return a;
    }

    public static int temp() {
        int b = (int) (-20 + Math.random() * 30);
        System.out.println(b);
        return b;
    }
}