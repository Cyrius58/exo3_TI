package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests d'intégration pour la classe Library.
 * Cette classe teste les interactions de base entre les livres, les utilisateurs et la bibliothèque.
 * @author Victor Mauboussin
 * @version 1.0
 * @since 2023-09-10
 */
public class LibraryIntegrationTest {

    /**
     * Teste le processus d'emprunt d'un livre par un utilisateur.
     * Ce test vérifie que :
     * 1. Le livre est disponible dans la bibliothèque après avoir été ajouté.
     * 2. L'utilisateur peut emprunter le livre.
     * 3. Le livre n'est plus disponible dans la bibliothèque après avoir été emprunté.
     * 4. Le livre est maintenant dans la liste des livres empruntés par l'utilisateur.
     */
    @Test
    public void testBorrowBook() {
        // Créez une instance de la classe Library.
        Library library = new Library();

        // Créez une instance de la classe Book représentant un livre disponible dans la bibliothèque.
        Book book1 = new Book("Le Petit Prince", "Antoine de Saint Exupéry");
        library.addBook(book1);

        // Créez une instance de la classe User.
        User user1 = new User("Victor");

        // Appelez la méthode borrowBook() de la classe Library en passant le livre et l'utilisateur en tant que paramètres.
        boolean wasBorrowed = library.borrowBook(book1, user1);

        // Utilisez des assertions pour vérifier si l'utilisateur a emprunté le livre avec succès et si le livre a été retiré de la bibliothèque.
        assertTrue(wasBorrowed, "The book should be borrowed successfully.");
        assertFalse(library.isBookAvailable(book1), "The book should no longer be available in the library.");
        assertTrue(user1.getBorrowedBooks().contains(book1), "The borrowed book should be in the user's borrowedBooks list.");
    }
}



