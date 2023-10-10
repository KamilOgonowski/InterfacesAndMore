package com.kamil.Awards.Courses;

import java.util.Scanner;

public class Courses {

    public double price;
    public static Scanner scanner = new Scanner(System.in);

//    public Courses(){
//        this(price);
//        System.out.println("Please insert the price of the course: ");
//        price = scanner.nextDouble();
//
//    }

    public Courses(double price){
        this.price = price;
    }

    public void priceInformation(){
        System.out.println("You paid $" + price + " for your course!");
    }
}
