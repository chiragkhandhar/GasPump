package MDA_EFSM;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;
import OP.OP;
import State.*;

public class MDA_EFSM {
    public OP op;
    public int k;
    public State S;
    public State [] LS;

    public MDA_EFSM()
    {
        LS = new State[7];
        op = new OP();
        S = new State(this);
        LS[0] = new activate(this);
        LS[1] = new S0(this);
        LS[2] = new S1(this);
        LS[3] = new S2(this);
        LS[4] = new S3(this);
        LS[5] = new S5(this);
        LS[6] = new S8(this);
        change_state(0);
    }

    // ---------------------------------- Utility Functions ----------------------------------
    public void intialize(AbstractFactory af, DataStore d) {
        op.initialize(af, d);
    }

    public void change_state(int a) {
        S = LS[a];
    }

    public MDA_EFSM getObject() {
        return this;
    }

    // ---------------------------------- Methods of MDA_EFSM ----------------------------------

    public void Activate()
    {
        S.create();
    }

    public void Start(){
        S.start();
    }

    public void Cancel()
    {
        S.Cancel();
    }

    public void Approved()
    {
        S.Approved();
    }

    public void Reject()
    {
        S.Reject();
    }

    public void StartPump()
    {
        S.Pump();
    }

    public void Pump()
    {
        S.Pump();
    }

    public void StopPump()
    {
        S.StopPump();
    }

    public void SelectGas(int gas)
    {
        S.SelectGas(gas);
    }

    public void CorrectPin()
    {
        S.CorrectPin();
    }

    public void IncorrectPin(int k)
    {
        S.IncorrectPin(k);
    }

    public void PayCash()
    {
        S.PayCash();
    }

    public void PayCredit()
    {
        S.PayCredit();
    }

    public void PayDebit()
    {
        S.PayDebit();
    }

}


