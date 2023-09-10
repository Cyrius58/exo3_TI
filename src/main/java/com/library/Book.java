package com.library;

/**
 * Représente un livre.
 */
public class Book {
    private String title;
    private String author;

    /**
     * Constructeur pour le livre.
     * @param title le titre du livre.
     * @param author l'auteur du livre.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters et setters.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
