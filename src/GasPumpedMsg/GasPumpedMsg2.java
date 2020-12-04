package GasPumpedMsg;

import DataStore.DataStore;

public class GasPumpedMsg2 extends GasPumpedMsg {
    @Override
    public void gasPumpedMsg(DataStore dst) {
        System.out.println("|        Pumped 1 Gallon of Gas          |");
        System.out.println("|                                        |");
        System.out.println("|     Total Gallons Pumped = "+dst.getG()+"          |");
        System.out.println("|        Total Amount = $"+dst.getFloatTotal()+"/-         |");
        System.out.println("|                                        |");

    }
}
