package GasPumpedMsg;

import DataStore.DataStore;

public class GasPumpedMsg1 extends GasPumpedMsg {
    @Override
    public void gasPumpedMsg(DataStore dst) {
        System.out.println("|        Pumped 1 Litre of Gas           |");
        System.out.println("|                                        |");
        System.out.println("|       Total Litres Pumped = "+dst.getL()+"          |");
        System.out.println("|        Total Amount = $"+dst.getTotal()+"/-         |");
        System.out.println("|                                        |");

    }
}
