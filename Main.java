package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена для заполнения первого списка");
        String scName1 = scanner.nextLine();
        String scName2 = scanner.nextLine();
        String scName3 = scanner.nextLine();
        String scName4 = scanner.nextLine();
        String scName5 = scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        names.add(scName1);
        names.add(scName2);
        names.add(scName3);
        names.add(scName4);
        names.add(scName5);
        for (String name : names ) {
            System.out.println(name);
        }

        System.out.println("-----------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имена для заполнения первого списка");
        String scMenName1 = scanner.nextLine();
        String scMenName2 = scanner.nextLine();
        String scMenName3 = scanner.nextLine();
        String scMenName4 = scanner.nextLine();
        String scMenName5 = scanner.nextLine();
        ArrayList<String> menNames = new ArrayList<>();
        menNames.add(scMenName1);
        menNames.add(scMenName2);
        menNames.add(scMenName3);
        menNames.add(scMenName4);
        menNames.add(scMenName5);
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
