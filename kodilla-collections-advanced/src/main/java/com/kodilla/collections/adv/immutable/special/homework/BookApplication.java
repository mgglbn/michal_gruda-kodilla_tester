package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Book A", "Anonymous");
        Book book2 = BookManager.createBook("Book A", "Anonymous");
        Book book3 = BookManager.createBook("Book C", "Adam Mickiewicz");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("Book1 == Book2: " + (book1 == book2) + "; Book1 == Book3: " + (book1 == book3) + "; Book2 == Book3: " + (book2 == book3));
    }
}