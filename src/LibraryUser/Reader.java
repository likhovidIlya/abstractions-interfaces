package LibraryUser;

import Roles.ReaderRole;

public class Reader extends User implements ReaderRole {
    @Override
    public void attendsLibrary() {

    }


    @Override
    public void takeBook(Administrator administrator) {

    }

    @Override
    public void returnsBook(Administrator administrator) {

    }
}
