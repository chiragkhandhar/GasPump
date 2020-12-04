package SetInitialValues;

import DataStore.DataStore;

public class SetInitialValues1 extends SetInitialValues {
    @Override
    public void setInitialValues(DataStore dst) {
        dst.setL(0);
        dst.setTotal(0);
    }
}
