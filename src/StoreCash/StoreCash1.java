package StoreCash;

import DataStore.DataStore;

public class StoreCash1 extends StoreCash{
    @Override
    public void storeCash(DataStore dst) {
        dst.setCash(dst.getTemp_c());
    }
}
