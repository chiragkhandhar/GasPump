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

    public void Activate(int a)
    {
        if( a > 0)
        {
            d1.setTemp_a(a);
            m.Activate();
        }
    }

    public void Start()
    {
        m.Start();
    }

    public void PayCash(int c)
    {
        if (c > 0)
        {
            d1.setTemp_c(c);
            m.PayCash();
        }
    }

    public void PayCredit()
    {
        m.PayCredit();
    }

    public void Approved()
    {
        m.Approved();
    }

    public void Reject()
    {
        m.Reject();
    }

    public void Cancel()
    {
        m.Cancel();
    }

    public void StartPump()
    {
        m.StartPump();
    }

    public void PumpLiter()
    {
        if ( d1.getW() == 1)
        {
            m.Pump();
        }
        else if (d1.getCash() > 0 && (d1.getCash() < d1.getPrice() * (d1.getL() + 1)))
        {
            m.StopPump();
        }
        else
        {
            m.Pump();
        }
    }

    public void StopPump()
    {
        m.StopPump();
    }

    // Utility function to print datastore
    public void printDataStore()
    {
        System.out.println("-----------ds1--------------");
        System.out.println("temp_c = " + d1.getTemp_c());
        System.out.println("cash = " + d1.getCash());
        System.out.println("total = " + d1.getTotal());
        System.out.println("L = " + d1.getL());
        System.out.println("price = " + d1.getPrice());
        System.out.println("temp_a = " + d1.getTemp_a());
        System.out.println("w = " + d1.getW());
        System.out.println("----------------------------");
    }
}
