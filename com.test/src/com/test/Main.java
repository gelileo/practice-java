package com.test;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Playground playground = new Playground();
//        playground.testDate();
//        playground.splitCharArray();
        SumDifference.run();




//        Person alex = new Person("alex");
//        System.out.println(alex.name);


//        int max = 6;
//        for (int i=1; i<=max; i++) {
//            for (int j=1; j<=max; j++) {
//                for (int k=1; k<=max; k++) {
//                    String number = String.format("%d%d%d", i, j, k);
//                    System.out.println(number);
//                }
//            }
//        }

//        JFrame f=new JFrame();//creating instance of JFrame
//
//        JButton b=new JButton("click");//creating instance of JButton
//        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
//
//        f.add(b);//adding button in JFrame
//
//        f.setSize(400,500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible

    }
    static  class Person {
        String name;
        Person(String name) {this.name = name;}

    }

}