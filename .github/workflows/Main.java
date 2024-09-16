package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FizzBuzz();

    }

    public static List<String> FizzBuzz() {
        List<String> FB = new java.util.ArrayList<>(List.of());

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                if (i % 7 == 0) {
                    //System.out.println("fizzbuzz");
                    FB.add(i + " fizzbuzz\n");
                    continue;
                }

                //System.out.println("fizz");
                FB.add(i + " fizz\n");
                continue;

            }

            if (i % 7 == 0) {
                //System.out.println("buzz");
                FB.add(i + " buzz\n");
            }

        }
        System.out.print(FB);
        return FB;
    }
}
