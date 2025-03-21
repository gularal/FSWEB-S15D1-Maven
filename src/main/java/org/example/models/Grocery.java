package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList groceryList = new ArrayList<>();

    public void startGrocery() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i == 0) {
            return;
        } else if (i == 1) {
            System.out.println("Eklenmesini istediğiniz elemanları giriniz");
        } else if (i == 2) {
            System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item: items) {
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
                printSorted();
            }
        }
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item: items) {
            groceryList.remove(item);
            printSorted();
        }
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}