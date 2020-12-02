package AbstractFactory;

import CancelMsg.CancelMsg;
import DisplayMenu.DisplayMenu;
import EjectCard.EjectCard;
import EnterPinMsg.EnterPinMsg;
import GasPumpedMsg.GasPumpedMsg;
import InitializeData.InitializeData;
import PayMsg.PayMsg;
import PrintReceipt.PrintReceipt;
import PumpGasUnit.PumpGasUnit;
import RejectMsg.RejectMsg;
import ReturnCash.ReturnCash;
import SetInitialValues.SetInitialValues;
import SetPrice.SetPrice;
import StoreCash.StoreCash;
import StorePin.StorePin;
import StorePrices.StorePrices;
import WrongPinMsg.WrongPinMsg;
import setW.setW;

public abstract class AbstractFactory {
    public abstract StorePrices makeObjectStorePrices();

    public abstract PayMsg makeObjectPayMsg();

    public abstract StoreCash makeObjectStoreCash();

    public abstract DisplayMenu makeObjectDisplayMenu();

    public abstract RejectMsg makeObjectRejectMsg();

    public abstract SetPrice makeObjectSetPrice();

    public abstract SetInitialValues makeObjectSetInitialValues();

    public abstract PumpGasUnit makeObjectPumpGasUnit();

    public abstract GasPumpedMsg makeObjectGasPumpedMsg();

    public abstract PrintReceipt makeObjectPrintReceipt();

    public abstract CancelMsg makeObjectCancelMsg();

    public abstract ReturnCash makeObjectReturnCash();

    public abstract WrongPinMsg makeObjectWrongPinMsg();

    public abstract StorePin makeObjectStorePin();

    public abstract EnterPinMsg makeObjectEnterPinMsg();

    public abstract InitializeData makeObjectInitializeData();

    public abstract setW makeObjectSetW();

    public abstract EjectCard makeObjectEjectCard();


}
