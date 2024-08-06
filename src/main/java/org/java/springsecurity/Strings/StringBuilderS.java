package org.java.springsecurity.Strings;

public class StringBuilderS {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Hello

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, "Java ");
        System.out.println(sb);

//        sb.delete(5, 11);
        System.out.println(sb);

//        sb.reverse();
        System.out.println(sb);
        sb.replace(5,11, "Hey");
        System.out.println(sb);
    }
}
