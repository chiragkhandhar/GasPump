package ReturnCash;

import DataStore.DataStore;

public class ReturnCash1 extends ReturnCash {
    @Override
    public void returnCash(DataStore dst) {
        if(dst.getW() == 0)
        {
            System.out.println("Cash Returned");
        }

    }
}
