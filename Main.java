package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена для заполнения первого списка");

        ArrayList<String> names = new ArrayList<>();
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        for (String name : names ) {
            System.out.println(name);
        }

        System.out.println("-----------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имена для заполнения первого списка");

        ArrayList<String> menNames = new ArrayList<>();
        menNames.add(scan.nextLine());
        menNames.add(scan.nextLine());
        menNames.add(scan.nextLine());
        menNames.add(scan.nextLine());
        menNames.add(scan.nextLine());
        for (String menName : menNames) {
            System.out.println(menName);
        }

        System.out.println("------------------------");

        ArrayList<String> names3 = new ArrayList<>();
        names3.add(names.get(0));
        names3.add(menNames.get(4));
        names3.add(names.get(1));
        names3.add(menNames.get(3));
        names3.add(names.get(2));
        names3.add(menNames.get(2));
        names3.add(names.get(3));
        names3.add(menNames.get(1));
        names3.add(names.get(4));
        names3.add(menNames.get(0));
        System.out.println(names3);

        System.out.println("-------------------------");

        names3.sort(Comparator.comparing(String::length));
        System.out.println(names3);
    }
}
