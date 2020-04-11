package Roles;

import LibraryUser.Administrator;

public interface ReaderRole {
    void returnsBook(Administrator adm);
    void takeBook();
}
