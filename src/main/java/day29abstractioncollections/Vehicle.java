package day29abstractioncollections;

import java.util.HashSet;

public interface Vehicle {
    public static void main(String[] args) {

        HashSet<String>emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println("emails = " + emails);
    }
}