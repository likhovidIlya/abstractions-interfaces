package LibraryUser;

import Roles.AdministratorRole;
import Roles.LibrarianRole;

public class Librarian extends User implements LibrarianRole, AdministratorRole {
    @Override
    public void attendsLibrary() {

    }


    @Override
    public void findsBook(Librarian librarian) {
        
    }

    @Override
    public void givesOutBook(Reader reader) {

    }

    @Override
    public void delayedNotifications(Reader reader) {

    }

    @Override
    public void orderBook(Supplier supplier) {

    }
}
