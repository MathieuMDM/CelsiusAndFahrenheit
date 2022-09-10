package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Celsius:");

        double celsiusValue = scanner.nextDouble();

        double fahrenheit = (9.0/5.0) * celsiusValue + 32;

        System.out.println(celsiusValue + " degrees Celsius is equal to 56 degrees fahrenheit " + fahrenheit);


    }
}
