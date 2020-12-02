package GasPumps;

import AbstractFactory.*;
import DataStore.*;
import MDA_EFSM.*;

public class GP1 {
    DS1 d1;
    AbstractFactory af;
    MDA_EFSM m;

    public  GP1 ()
    {
        af = new CF1();
        d1 = new DS1();
        m = new MDA_EFSM();
        m.intialize(af, d1);
    }

    public void Activate(int price)
    {

    }

    public void Start()
    {

    }

    public void PayCash(int amount)
    {

    }

    public void PayCredit()
    {

    }

    public void Approved()
    {

    }

    public void Reject()
    {

    }

    public void Cancel()
    {

    }

    public void StartPump()
    {

    }

    public void PumpLiter()
    {

    }

    public void StopPump()
    {

    }
}
