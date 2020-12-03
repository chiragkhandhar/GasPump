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
        if( a > 0 && b > 0 && c > 0)
        {
            d2.setTemp_a(a);
            d2.setTemp_b(b);
            d2.setTemp_c(c);
            m.Activate();
        }
    }

    public void Start()
    {
        m.Start();
    }

    public void PayCredit()
    {
        m.PayCredit();
    }

    public void Reject()
    {
        m.Reject();
    }

    public void PayDebit(String p)
    {
        d2.setTemp_p(p);
        m.PayDebit();
    }

    public void Pin(String x)
    {
        if (d2.getPin().equals(x))
        {
            m.CorrectPin();
        }
        else
        {
            m.IncorrectPin(1);
        }
    }

    public void Cancel()
    {
        m.Cancel();
    }

    public void Approved()
    {
        m.Approved();
    }

    public void Regular()
    {
        m.SelectGas(1);
    }

    public void Diesel()
    {
        m.SelectGas(3);
    }

    public void Super()
    {
        m.SelectGas(2);
    }

    public void StartPump()
    {
        if (d2.getPrice() > 0)
        {
            m.StartPump();
        }
    }

    public void PumpGallon()
    {
        m.Pump();
    }

    public void StopPump()
    {
        m.StopPump();
    }

    public void FullTank()
    {
        m.StopPump();
    }
}
