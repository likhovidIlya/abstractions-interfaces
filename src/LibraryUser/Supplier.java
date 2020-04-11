package LibraryUser;

import Roles.ReaderRole;
import Roles.SupplierRole;

public class Supplier extends User implements SupplierRole, ReaderRole {
    @Override
    public void attendsLibrary() {

    }


    @Override
    public void takeBook() {

    }

    @Override
    public void returnsBook(Administrator adm) {

    }

    @Override
    public void suppliesBook(Librarian lib) {

    }
}
