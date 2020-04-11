package LibraryUser;

import Roles.ReaderRole;
import Roles.SupplierRole;

public class Supplier extends User implements SupplierRole, ReaderRole {
    @Override
    public void attendsLibrary() {

    }


    @Override
    public void takeBook(Administrator administrator) {

    }

    @Override
    public void returnsBook(Administrator administrator) {

    }

    @Override
    public void suppliesBook(Librarian librarian) {

    }
}
