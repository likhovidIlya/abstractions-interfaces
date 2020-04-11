import LibraryUser.*;
import Roles.*;


class Main {
    public static void main(String[] args) {
        User[] users = {new Administrator(), new Librarian(), new Reader(), new Supplier()};

        User reader = new Reader();
        reader.attendsLibrary();

        ((ReaderRole) reader).takeBook();
    }
    }