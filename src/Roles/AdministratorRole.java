package Roles;

import LibraryUser.Librarian;
import LibraryUser.Reader;

public interface AdministratorRole {
    void findsBook(Librarian lib);
    void givesOutBook(Reader reader);
    void delayedNotifications(Reader reader);
}
