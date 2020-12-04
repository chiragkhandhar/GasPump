package StorePrices;

import DataStore.DataStore;

public class StorePrice2 extends StorePrices {
    @Override
    public void storePrices(DataStore dst) {
        dst.setRprice(dst.getFloatTemp_a());
        dst.setDprice(dst.getTemp_b());
        dst.setSprice(dst.getFloatTemp_c());

    }
}
