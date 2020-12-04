package WrongPinMsg;

import DataStore.DataStore;

public class WrongPinMsg2 extends WrongPinMsg{
    @Override
    public void wrongPinMsg(DataStore dst) {
        System.out.println("|                                        |");
        System.out.println("|            Incorrect Pin               |");
        System.out.println("|                                        |");
    }
}
