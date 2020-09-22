package com.rob.problems.arrays;

public class URLify {

    public static String URLify(String input, int length) {
        StringBuilder out = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = 0 ; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == ' ') {
                if (out.length() < length) {
                    out.append("%20");
                }
            } else {
                out.append(ch);
            }
        }
        return out.toString();
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount =0, index = 0;

        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount *2;

        if (trueLength < str.length) str[trueLength] = '\0';

        for (int i = trueLength -1; i >=0; i--) {
            if (str[i] ==' ') {
                str[index -1] = '0';
                str[index -2] = '2';
                str[index -3] = '%';
                index = index -3;
            } else {
                str[index -1] = str[i];
                index --;
            }
        }

    }


    public static void main(String[] args) {
        String input = "Mr John Smith        ";
        String expected ="Mr%20John%20Smith";

        char[] ch = input.toCharArray();
        replaceSpaces(ch, 13);

        StringBuilder b = new StringBuilder();
        for (char cha: ch) {
            b.append(cha);
        }
        System.out.println("."+b+".");
        System.out.println(b.equals(expected));
    }



}
