package PrintReceipt;

import DataStore.DataStore;

public class PrintReceipt2 extends PrintReceipt {
    @Override
    public void printReceipt(DataStore dst) {
        System.out.println("\n");
        System.out.println("|========================================|");
        System.out.println("|               RECEIPT                  |");
        System.out.println("|========================================|");
        System.out.println("|    Total:                 $"+dst.getFloatTotal()+"        |");
        System.out.println("|    Gallons:                   "+dst.getG()+"        |");
        System.out.println("|----------------------------------------|");
        System.out.println("|               THANK YOU                |");
        System.out.println("|----------------------------------------|");
        System.out.println("|========================================|");
        System.out.println("\n");

    }
}
