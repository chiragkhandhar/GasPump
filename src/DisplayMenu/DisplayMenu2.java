package DisplayMenu;

import DataStore.DataStore;

public class DisplayMenu2 extends DisplayMenu{
    @Override
    public void displayMenu(DataStore dst) {
        System.out.println("|          Select Fuel Type              |");
        System.out.println("|            9. Regular                  |");
        System.out.println("|            8. Diesel                   |");
        System.out.println("|           10. Super                    |");
        System.out.println("|            6. Cancel                   |");

    }
}
