package PrintReceipt;

import DataStore.DataStore;

public class PrintReceipt1 extends PrintReceipt {
    @Override
    public void printReceipt(DataStore dst) {
        System.out.println("\n");
        System.out.println("|========================================|");
        System.out.println("|               RECEIPT                  |");
        System.out.println("|========================================|");
        System.out.println("|    Total:                 $"+dst.getTotal()+"         |");
        System.out.println("|    Litres:                   "+dst.getL()+"         |");
        System.out.println("|----------------------------------------|");
        System.out.println("|               THANK YOU                |");
        System.out.println("|----------------------------------------|");
        System.out.println("|========================================|");
        System.out.println("\n");
    }
}
