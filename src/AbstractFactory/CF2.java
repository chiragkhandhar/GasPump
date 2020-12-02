package AbstractFactory;

import CancelMsg.*;
import DisplayMenu.*;
import EjectCard.*;
import EnterPinMsg.*;
import GasPumpedMsg.*;
import InitializeData.*;
import PayMsg.*;
import PrintReceipt.*;
import PumpGasUnit.*;
import RejectMsg.*;
import ReturnCash.*;
import SetInitialValues.*;
import SetPrice.*;
import StoreCash.*;
import StorePin.*;
import StorePrices.*;
import WrongPinMsg.*;
import setW.*;

public class CF2 extends AbstractFactory {
    @Override
    public StorePrices makeObjectStorePrices() {
        return new StorePrice2();
    }

    @Override
    public PayMsg makeObjectPayMsg() {
        return new PayMsg2();
    }

    @Override
    public StoreCash makeObjectStoreCash() {
        return new StoreCash2();
    }

    @Override
    public DisplayMenu makeObjectDisplayMenu() {
        return new DisplayMenu2();
    }

    @Override
    public RejectMsg makeObjectRejectMsg() {
        return new RejectMsg2();
    }

    @Override
    public SetPrice makeObjectSetPrice() {
        return new SetPrice2();
    }

    @Override
    public SetInitialValues makeObjectSetInitialValues() {
        return new SetInitialValues2();
    }

    @Override
    public PumpGasUnit makeObjectPumpGasUnit() {
        return new PumpGasUnit2();
    }

    @Override
    public GasPumpedMsg makeObjectGasPumpedMsg() {
        return new GasPumpedMsg2();
    }

    @Override
    public PrintReceipt makeObjectPrintReceipt() {
        return new PrintReceipt2();
    }

    @Override
    public CancelMsg makeObjectCancelMsg() {
        return new CancelMsg2();
    }

    @Override
    public ReturnCash makeObjectReturnCash() {
        return new ReturnCash2();
    }

    @Override
    public WrongPinMsg makeObjectWrongPinMsg() {
        return new WrongPinMsg2();
    }

    @Override
    public StorePin makeObjectStorePin() {
        return new StorePin2();
    }

    @Override
    public EnterPinMsg makeObjectEnterPinMsg() {
        return new EnterPinMsg2();
    }

    @Override
    public InitializeData makeObjectInitializeData() {
        return new InitializeData2();
    }

    @Override
    public setW makeObjectSetW() {
        return new setW2();
    }

    @Override
    public EjectCard makeObjectEjectCard() {
        return new EjectCard2();
    }
}
