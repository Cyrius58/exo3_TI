package com.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une bibliothèque.
 */
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Ajoute un livre à la bibliothèque.
     * @param book le livre à ajouter.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Vérifie si un livre est disponible dans la bibliothèque.
     * @param book le livre à vérifier.
     * @return true si le livre est disponible, sinon false.
     */
    public boolean isBookAvailable(Book book) {
        return books.contains(book);
    }

    /**
     * Permet à un utilisateur d'emprunter un livre.
     * @param book le livre à emprunter.
     * @param user l'utilisateur qui emprunte.
     * @return true si le livre a été emprunté avec succès, sinon false.
     */
    public boolean borrowBook(Book book, User user) {
        if (isBookAvailable(book)) {
            books.remove(book);
            user.getBorrowedBooks().add(book);
            return true;
        }
        return false;
    }
}
