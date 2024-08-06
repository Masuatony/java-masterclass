package org.java.springsecurity.Strings;

public class Strings {
    public static void main(String[] args) {
//        printStrings("\t ");
        printStrings("hello");
    }

    public static void printStrings(String string) {
        int len = string.length();
        System.out.println("String is length: " + len);

        if (string.isEmpty()){
            System.out.println("String is empty");
//            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
//            return;
        }
//        System.out.println("check blank character: " + );

        for (int i = 0; i < len; i++) {
            System.out.println("Character at index " + i + ": " + string.charAt(i));
        }
//        System.nanoTime();
        System.out.println("String reversed: " + new StringBuilder(string).reverse().toString());
        String concat = string.concat("_world");
        System.out.println(string.concat(" world"));
        System.out.println(concat);

        String substring = concat.substring(6,9);
        System.out.println(substring);

        String replaced = concat.replace("_world", " universe");
        System.out.println(replaced);
//        String replaceAll = replaced.join("-" , substring);
        String replaceAll = String.join("-", replaced,concat);
        System.out.println(replaceAll);
        System.out.println(replaceAll.indexOf("-"));
        System.out.println(replaceAll.replaceFirst("hello", "Sting"));
        System.out.println(replaceAll.repeat(3).indent(4));

    }
}
