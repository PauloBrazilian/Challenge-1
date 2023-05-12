package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] right = new int[10];
        int[] wrong = new int[10];

        System.out.print("Astronomy Quiz\n " +
                "If you get everything right, you get a cold coke ;-)\n");
        scan.nextLine();

        System.out.print("Hello, what's your name?\n");
        String user = scan.nextLine();

        while(true){
            System.out.print("What is the name of our galaxy?\n");

            System.out.print("0 - Milky Way\n");
            System.out.print("1 - Andromeda\n");
            System.out.print("2 - Solar system\n");
            int escolha = scan.nextInt();


            switch (escolha) {
                case 0:
                    right[0]++;
                    break;
                case 1:
                    wrong[0]--;
                    break;
                case 2:
                    wrong[0]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("Which galaxy is closest to ours?\n");

            System.out.print("0 - Antenna galaxy\n");
            System.out.print("1 - Andromeda\n");
            System.out.print("2 - Triangle galaxy\n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    wrong[1]--;
                    break;
                case 1:
                    right[1]++;
                    break;
                case 2:
                    wrong[1]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("How many Lagrange points are there in Earth's orbit?\n");

            System.out.print("0 - 3\n");
            System.out.print("1 - 5\n");
            System.out.print("2 - 4\n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    wrong[2]--;
                    break;
                case 1:
                    right[2]++;
                    break;
                case 2:
                    wrong[2]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("What is Earth's natural satellite?\n");

            System.out.print("0 - hubble \n");
            System.out.print("1 - James Webb \n");
            System.out.print("2 - Moon \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    wrong[3]--;
                    break;
                case 1:
                    wrong[3]--;
                    break;
                case 2:
                    right[3]++;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("What is the binary star system?\n");

            System.out.print("0 - Solar system \n");
            System.out.print("1 - GW Orionis \n");
            System.out.print("2 - Sirius \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    wrong[4]--;
                    break;
                case 1:
                    wrong[4]--;
                    break;
                case 2:
                    right[4]++;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("What is the name of the black hole in our galaxy?\n");

            System.out.print("0 - M31 \n");
            System.out.print("1 - Sagittarius A \n");
            System.out.print("2 - Cygnus X-1 \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    wrong[5]--;
                    break;
                case 1:
                    right[5]++;
                    break;
                case 2:
                    wrong[5]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("After the sun dies it will turn:\n");

            System.out.print("0 - a white dwarf \n");
            System.out.print("1 - a black hole \n");
            System.out.print("2 - a super nova \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    right[6]++;
                    break;
                case 1:
                    wrong[6]--;
                    break;
                case 2:
                    wrong[6]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("How many planets are there in our solar system?\n");

            System.out.print("0 - 7 \n");
            System.out.print("1 - 8 \n");
            System.out.print("2 - 6 \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    wrong[7]--;
                    break;
                case 1:
                    right[7]++;
                    break;
                case 2:
                    wrong[7]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("What is the farthest saltile from earth?\n");

            System.out.print("0 - Voyader 1 \n");
            System.out.print("1 - hubble \n");
            System.out.print("2 - Explorer 1 \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    right[8]++;
                    break;
                case 1:
                    wrong[8]--;
                    break;
                case 2:
                    wrong[8]--;
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    continue;
            }
            break;
        }

        while (true){
            System.out.print("What was the last saletile released?\n");

            System.out.print("0 - GOES-T \n");
            System.out.print("1 - hubble \n");
            System.out.print("2 - James Webb \n");
            int escolha2 = scan.nextInt();


            switch (escolha2) {
                case 0:
                    right[9]++;
                    break;
                case 1:
                    wrong[9]--;
                    break;
                case 2:
                    wrong[9]--;
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
                    continue;
            }
            break;
        }


        int totalR = 0;
        int totalW = 0;

        for (int i = 0; i < right.length; i++) {
            totalR += right[i];
        }

        for (int i = 0; i < wrong.length; i++) {
            totalW += wrong[i];
        }

        System.out.print("\nName: " + user);
        System.out.print("\nRight: " + totalR );
        System.out.print("\nWrong: " + totalW + "\n");

        scan.close();
    }
}
