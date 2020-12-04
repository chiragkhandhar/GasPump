package PumpGasUnit;

import DataStore.DataStore;

public class PumpGasUnit1 extends PumpGasUnit {
    @Override
    public void pumpGasUnit(DataStore dst) {
        int w = dst.getW();
        int cash = dst.getCash();
        int price = dst.getPrice();
        int L = dst.getL();
        int total = dst.getTotal();

        if(w==1 || ((w==0) && (cash >= price * (L+1))))
        {
            L = L + 1;
            dst.setL(L);
            total = price * L;
            dst.setTotal(total);
        }


    }
}
