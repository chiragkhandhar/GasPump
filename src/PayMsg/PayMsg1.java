package PayMsg;

import DataStore.DataStore;

public class PayMsg1 extends PayMsg {
    @Override
    public void payMsg(DataStore dst) {
        System.out.println("|           Select Payment               |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }
}
