package PumpGasUnit;

import DataStore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit {
    @Override
    public void pumpGasUnit(DataStore dst) {
        int G = dst.getG();
        float total = dst.getFloatTotal();
        float price = dst.getFloatPrice();

        G = G + 1;
        total = price * G;

        dst.setG(G);
        dst.setFloatTotal(total);


    }
}
