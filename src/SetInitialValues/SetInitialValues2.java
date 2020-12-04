package SetInitialValues;

import DataStore.DataStore;

public class SetInitialValues2 extends SetInitialValues {
    @Override
    public void setInitialValues(DataStore dst) {
        if(dst.getFloatPrice() > 0)
        {
            dst.setG(0);
            dst.setFloatTotal(0);
        }
        else
        {
            System.out.println("|         Please Select a Gas            |");
        }

    }
}
