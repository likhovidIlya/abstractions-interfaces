package Roles;

import LibraryUser.Librarian;
import LibraryUser.Reader;

public interface AdministratorRole {
    void findsBook(Librarian librarian);
    void givesOutBook(Reader reader);
    void delayedNotifications(Reader reader);
}
