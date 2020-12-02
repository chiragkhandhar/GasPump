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

public class CF1 extends AbstractFactory  {
    @Override
    public StorePrices makeObjectStorePrices() {
        return new StorePrice1();
    }

    @Override
    public PayMsg makeObjectPayMsg() {
        return new PayMsg1();
    }

    @Override
    public StoreCash makeObjectStoreCash() {
        return new StoreCash1();
    }

    @Override
    public DisplayMenu makeObjectDisplayMenu() {
        return new DisplayMenu1();
    }

    @Override
    public RejectMsg makeObjectRejectMsg() {
        return new RejectMsg1();
    }

    @Override
    public SetPrice makeObjectSetPrice() {
        return new SetPrice1();
    }

    @Override
    public SetInitialValues makeObjectSetInitialValues() {
        return new SetInitialValues1();
    }

    @Override
    public PumpGasUnit makeObjectPumpGasUnit() {
        return new PumpGasUnit1();
    }

    @Override
    public GasPumpedMsg makeObjectGasPumpedMsg() {
        return new GasPumpedMsg1();
    }

    @Override
    public PrintReceipt makeObjectPrintReceipt() {
        return new PrintReceipt1();
    }

    @Override
    public CancelMsg makeObjectCancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public ReturnCash makeObjectReturnCash() {
        return new ReturnCash1();
    }

    @Override
    public WrongPinMsg makeObjectWrongPinMsg() {
        return new WrongPinMsg1();
    }

    @Override
    public StorePin makeObjectStorePin() {
        return new StorePin1();
    }

    @Override
    public EnterPinMsg makeObjectEnterPinMsg() {
        return new EnterPinMsg1();
    }

    @Override
    public InitializeData makeObjectInitializeData() {
        return new InitializeData1();
    }

    @Override
    public setW makeObjectSetW() {
        return new setW1();
    }

    @Override
    public EjectCard makeObjectEjectCard() {
        return new EjectCard1();
    }
}
