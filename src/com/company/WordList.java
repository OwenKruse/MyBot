package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordList {
    List<String> words = new ArrayList<>();

    public int size() {
        return words.size();
    }

    public void addWord(String w) {
        words.add(w);
    }

    public List wordListMain5(char a, char b, char c, char d, char e){
        List<String> mainResultA = new ArrayList<>();
        for(String h : words) {
            if(h.length() == 5 && h.charAt(0) == a){
                    mainResultA.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) == b){
                    mainResultA.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) == c){
                mainResultA.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) != c && h.charAt(3) == d){
                mainResultA.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) != c && h.charAt(3) != d && h.charAt(4) == e){
                mainResultA.add(h);
            }
//
        }
        return mainResultA;
    }
    public List wordListMain4(char a, char b, char c, char d){
        List<String> mainResultB = new ArrayList<>();
        for(String h : words) {
            if(h.length() == 5 && h.charAt(0) == a){
                mainResultB.add(h);
            }
            else if(h.charAt(0) != a && h.charAt(1) == b){
                mainResultB.add(h);
            }
            else if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) == c){
                mainResultB.add(h);
            }
            else if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) != c && h.charAt(3) == d){
                mainResultB.add(h);
            }

//
        }
        return mainResultB;
    }
    public List wordListMain3(char a, char b, char c){
        List<String> mainResultC = new ArrayList<>();
        for(String h : words) {
            if(h.length() == 3 && h.charAt(0) == a){
                mainResultC.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) == b){
                mainResultC.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) == c){
                mainResultC.add(h);
            }

//
        }
        return mainResultC;
    }
    public List wordListMain6(char a, char b, char c, char d, char e, char f){
        List<String> mainResultD = new ArrayList<>();
        for(String h : words) {
            if(h.length() == 5 && h.charAt(0) == a){
                mainResultD.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) == b){
                mainResultD.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) == c){
                mainResultD.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) != c && h.charAt(3) == d){
                mainResultD.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) != c && h.charAt(3) != d && h.charAt(4) == e){
                mainResultD.add(h);
            }
            if(h.charAt(0) != a && h.charAt(1) != b && h.charAt(2) != c && h.charAt(3) != d && h.charAt(4) != e && h.charAt(5) == f){
                mainResultD.add(h);
            }
//
        }
        return mainResultD;
    }

//    public List wordListMain5(String[] letters){
//        List<String> mainResult = new ArrayList<>();
//        for(String h : words) {
//            //loop through the array of letter using an index.
//            //If this word's ith letter matches the ith letter in letters, pop it onto the list.
//            //Example: "pilot" matches if the array of letters is ['p','a','n','s','y']
//        }
//        return mainResult;
//    }

    public List allWordsWithLengthAndStart(int n, char ch2) {
        List<String> result2 = new ArrayList<>();

            for (String z : words) {
                if (z.length() == n & z.charAt(0) == ch2) {
                    result2.add(z);
                }
            }


        return result2;
    }


    public List allWordsWithLength(int n) {
        List<String> result = new ArrayList<>();
        for (String w : words) {
            if (w.length() == n) {
                result.add(w);
            }
        }
        return result;
    }
    public List allWordsWithStart(char ch2) {
        List<String> result1 = new ArrayList<>();
        for (String d : words) {
            if (d.charAt(0) == ch2 ){
                result1.add(d);
            }
        }
        return result1;
    }

    public WordList() {
        Scanner s = null;
        try {
            s = new Scanner(new File("Wordlist.txt"));
            s.useDelimiter(",");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (s.hasNext()){
            String nextWord = s.next();
            if(nextWord.charAt(0) == '"') {
                nextWord = nextWord.substring(1, nextWord.length() - 1);
            }
            words.add(nextWord);
        }
        s.close();
    }
    public String random() {
        Random r = new Random();
        int randomitem = r.nextInt(words.size());
        String randomElement = words.get(randomitem);
        return randomElement;
    }


}
