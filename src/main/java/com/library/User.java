package com.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un utilisateur.
 */
public class User {
    private String name;
    private List<Book> borrowedBooks;

    /**
     * Constructeur pour l'utilisateur.
     * @param name le nom de l'utilisateur.
     */
    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters et setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
