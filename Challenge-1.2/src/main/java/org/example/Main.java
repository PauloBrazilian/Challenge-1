package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hello, how are you?\n");
        String question = scan.nextLine();

        if (question.contains(":-)") && question.contains(":-(")){
            System.out.print("neutral\n");
        } else if (question.contains(":-(")){
            System.out.print("upset\n");
        }else if (question.contains(":-)")){
            System.out.print("fun\n");
        }else {
            System.out.print("neutral\n");
        }

    }
}