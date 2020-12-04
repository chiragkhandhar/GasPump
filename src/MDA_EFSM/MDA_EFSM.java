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
        System.out.println("|----------------------------------------|");
        System.out.println("|           Current State = " + detectState(a) + "           |");
        System.out.println("|                                        |");

    }

    public MDA_EFSM getObject() {
        return this;
    }

    // ---------------------------------- Methods of MDA_EFSM ----------------------------------

    public void Activate()
    {
        S.Activate();
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
        S.StartPump();
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

    // Utility function to check the current state

    String detectState (int a)
    {
        switch (a)
        {
            case 0:
                return "Activate";
            case 1:
                return "S0";
            case 2:
                return "S1";
            case 3:
                return "S2";
            case 4:
                return "S3";
            case 5:
                return "S5";
            case 6:
                return "S8";
            default:
                return "Invalid";
        }
    }
}


