package com.maxim;

public class Test {
    public static void main(String[] args){
//        int i = 0;
//        do {
//            System.out.println("hello " + args[i]);
//            System.out.println("THIS IS A WHILE LOOP");
//            i++;
//
//        } while (i < args.length);
//
//
//        System.out.println("the end to danik");
        Person rex = new Person();
        rex.name = "rex";
        rex.surname = "McDonalds";
        rex.age = 20;
        rex.annoying = true;
        System.out.println("the persons name is " + rex.name +
                " " + rex.surname +
                "\n and his age is " + rex.age +
                "\n is he annoying: " + rex.annoying
        );
        Person tomyinit = new Person();
        tomyinit.name = "tomy";
        tomyinit.surname = "jerry";
        tomyinit.age = 45;
        tomyinit.annoying = false;
        System.out.println(
                "the other persons name is " +
                        tomyinit.name +
                        tomyinit.surname +
                        "\nhis age is " +
                        tomyinit.age +
                        "is he annoying: " +
                        tomyinit.annoying
        );
        System.out.println("lalalalalallallalalalall");

    }
}
