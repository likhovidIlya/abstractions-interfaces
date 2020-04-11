package LibraryUser;

import Roles.ReaderRole;

public class Reader extends User implements ReaderRole {
    @Override
    public void attendsLibrary() {

    }


    @Override
    public void takeBook() {

    }

    @Override
    public void returnsBook(Administrator adm) {

    }
}
