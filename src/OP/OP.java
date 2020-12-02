package OP;

import AbstractFactory.AbstractFactory;
import DataStore.*;

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

public class OP {
    DataStore dataStore;
    StorePrices storePrices;
    PayMsg payMsg;
    StoreCash storeCash;
    DisplayMenu displayMenu;
    RejectMsg rejectMsg;
    SetPrice setPrice;
    SetInitialValues setInitialValues;
    PumpGasUnit pumpGasUnit;
    GasPumpedMsg gasPumpedMsg;
    PrintReceipt printReceipt;
    CancelMsg cancelMsg;
    ReturnCash returnCash;
    WrongPinMsg wrongPinMsg;
    StorePin storePin;
    EnterPinMsg enterPinMsg;
    InitializeData initializeData;
    setW set_W;
    EjectCard ejectCard;

    public void initialize(AbstractFactory abstractFactory, DataStore ds)
    {
         dataStore = ds;
         storePrices = abstractFactory.makeObjectStorePrices();
         payMsg = abstractFactory.makeObjectPayMsg();
         storeCash = abstractFactory.makeObjectStoreCash();
         displayMenu = abstractFactory.makeObjectDisplayMenu();
         rejectMsg = abstractFactory.makeObjectRejectMsg();
         setPrice = abstractFactory.makeObjectSetPrice();
         setInitialValues = abstractFactory.makeObjectSetInitialValues();
         pumpGasUnit = abstractFactory.makeObjectPumpGasUnit();
         gasPumpedMsg = abstractFactory.makeObjectGasPumpedMsg();
         printReceipt = abstractFactory.makeObjectPrintReceipt();
         cancelMsg = abstractFactory.makeObjectCancelMsg();
         returnCash = abstractFactory.makeObjectReturnCash();
         wrongPinMsg = abstractFactory.makeObjectWrongPinMsg();
         storePin = abstractFactory.makeObjectStorePin();
         enterPinMsg = abstractFactory.makeObjectEnterPinMsg();
         initializeData = abstractFactory.makeObjectInitializeData();
         set_W = abstractFactory.makeObjectSetW();
         ejectCard = abstractFactory.makeObjectEjectCard();
    }

    public void StorePrice()
    {
        storePrices.storePrices(dataStore);
    }

    public void PayMsg()
    {
        payMsg.payMsg(dataStore);
    }

    public void StoreCash()
    {
        storeCash.storeCash(dataStore);
    }

    public void DisplayMenu()
    {
        displayMenu.displayMenu(dataStore);
    }

    public void RejectMsg()
    {
        rejectMsg.rejectMsg(dataStore);
    }

    public void SetPrice(int price)
    {
        setPrice.setPrice(price);
    }

    public void SetInitialValues()
    {
        setInitialValues.setInitialValues(dataStore);
    }

    public void PumpGasUnit()
    {
        pumpGasUnit.pumpGasUnit(dataStore);
    }

    public void GasPumpedMsg()
    {
        gasPumpedMsg.gasPumpedMsg(dataStore);
    }

    public void PrintReceipt()
    {
        printReceipt.printReceipt(dataStore);
    }

    public void CancelMsg()
    {
        cancelMsg.cancelMsg(dataStore);
    }

    public void ReturnCash()
    {
        returnCash.returnCash(dataStore);
    }

    public void WrongPinMsg()
    {
        wrongPinMsg.wrongPinMsg(dataStore);
    }

    public void StorePin()
    {
        storePin.storePin(dataStore);
    }

    public void EnterPinMsg()
    {
        enterPinMsg.enterPinMsg(dataStore);
    }

    public void InitializeData()
    {
        initializeData.initializeData(dataStore);
    }

    public void SetW(int w)
    {
        set_W.set_W(w);
    }

    public void EjectCard()
    {
        ejectCard.ejectCard(dataStore);
    }
}
