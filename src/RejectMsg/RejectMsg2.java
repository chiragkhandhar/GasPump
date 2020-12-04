package RejectMsg;

import DataStore.DataStore;

public class RejectMsg2 extends RejectMsg {
    @Override
    public void rejectMsg(DataStore dst) {
        System.out.println("|                                        | ");
        System.out.println("|----------Transaction Rejected----------| ");
        System.out.println("|                                        | ");
    }
}
