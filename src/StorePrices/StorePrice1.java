package StorePrices;

import DataStore.DataStore;

public class StorePrice1 extends  StorePrices {
    @Override
    public void storePrices(DataStore dst) {
        dst.setPrice(dst.getTemp_a());
    }
}
