package RejectMsg;

import DataStore.DataStore;

public class RejectMsg1 extends RejectMsg {
    @Override
    public void rejectMsg(DataStore dst) {
        System.out.println("|                                        | ");
        System.out.println("|----------Transaction Rejected----------| ");
        System.out.println("|                                        | ");
    }
}
