package com.practice.javapro;

import java.util.ArrayList;
import java.util.Scanner;

public class Songplaylist {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your no. of song will be added in your playlist :- ");
            int song = sc.nextInt();
            if (song < 3) {
                System.out.println("playlist must include atleast 3 songs");
                System.exit(0);
            }
            ArrayList<Integer> playlist = new ArrayList<Integer>();
            for (int i = 1; i <= song; i++) {
                playlist.add(i);
            }
            System.out.printf("playing playlist :- %d,%d,%d\n", playlist.get(0), playlist.get(1), playlist.get(2));
            while (true) {
                try {
                    System.out.print("enter which song number you want to play (0 exit):- ");
                    int inp = sc.nextInt() - 1;
                    if (inp < 0) {
                        break;
                    }
                    int element_pop = playlist.remove(inp);
                    playlist.add(element_pop);
                    System.out.print("playing playlist :- ");
                    for (int i = -3; i < 0; i++) {
                        System.out.printf("s%d, ", playlist.get(playlist.size() + i));
                    }
                    System.out.print("\b\b \n");
                } catch (Exception e) {
                    System.out.println("Invalid input. Input the song number from you playlist.");
                }
            }
        } catch (Exception e) {
            System.out.println("Enter only numbers");
        }
    }
}