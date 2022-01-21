package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            WordList words = new WordList();
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the hint?");
            String word = scan.nextLine();
                char a = word.charAt(0);
                char b = word.charAt(1);
                char c = word.charAt(2);
                System.out.println(words.wordListMain3(a, b, c));

//            else if(num == 4) {
//                System.out.println("What is the hint?");
//                String word4 = scan.nextLine();
//                char a = word4.charAt(0);
//                char b = word4.charAt(1);
//                char c = word4.charAt(2);
//                char d = word4.charAt(2);
//                System.out.println(words.wordListMain4(a, b, c, d));
//            }
//                System.out.println("What is the hint?");
//                String word5 = scan.nextLine();
//                char a = word5.charAt(0);
//                char b = word5.charAt(1);
//                char c = word5.charAt(2);
//                char d = word5.charAt(2);
//                char e = word5.charAt(2);
//                System.out.println(words.wordListMain5(a, b, c, d, e));

            System.out.println(words.random());




        }
}



