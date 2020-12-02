package GasPumps;

import AbstractFactory.*;
import DataStore.*;
import MDA_EFSM.*;

public class GP2 {
    DS2 d2;
    AbstractFactory af;
    MDA_EFSM m;

    public  GP2 ()
    {
        af = new CF2();
        d2 = new DS2();
        m = new MDA_EFSM();
        m.intialize(af, d2);
    }

    public void Activate(float a, float b, float c)
    {

    }

    public void Start()
    {

    }

    public void PayCredit()
    {

    }

    public void Reject()
    {

    }

    public void PayDebit(String p)
    {

    }

    public void Pin(String p)
    {

    }

    public void Cancel()
    {

    }

    public void Approved()
    {

    }

    public void Regular()
    {

    }

    public void Diesel()
    {

    }

    public void Super()
    {

    }

    public void StartPump()
    {

    }

    public void PumpGallon()
    {

    }

    public void StopPump()
    {

    }

    public void FullTank()
    {

    }


}
