package CancelMsg;

import DataStore.DataStore;

public class CancelMsg2 extends CancelMsg {
    @Override
    public void cancelMsg(DataStore dst) {
        System.out.println("|----------Transaction Cancelled---------|");
        System.out.println("|                                        |");
    }
}
