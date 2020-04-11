package Roles;

import LibraryUser.Administrator;

public interface ReaderRole {
    void takeBook(Administrator administrator);
    void returnsBook(Administrator administrator);
}
