package StorePin;

import DataStore.DataStore;

public class StorePin2 extends StorePin {
    @Override
    public void storePin(DataStore dst) {
        dst.setPin(dst.getTemp_p());
    }
}
