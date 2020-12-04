package State;

import MDA_EFSM.MDA_EFSM;

public class S8 extends State {
    public S8(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void Activate() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void start() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void PayCash() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void PayCredit() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void PayDebit() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void Approved() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void Reject() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void StartPump() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void Cancel() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void Pump() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void StopPump() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void IncorrectPin(int max) {
        if (m.getObject().S == m.getObject().LS[6])
        {
            if(m.getObject().k <= max)
            {
                m.getObject().op.WrongPinMsg();
                m.getObject().k = m.getObject().k + 1 ;
            }
            else if (m.getObject().k > max)
            {
                m.getObject().op.WrongPinMsg();
                m.getObject().op.EjectCard();
                m.getObject().change_state(1);
            }
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void CorrectPin() {
        if (m.getObject().S == m.getObject().LS[6])
        {
            System.out.println("|                                        | ");
            System.out.println("|---------Transaction Approved-----------| ");
            System.out.println("|                                        | ");
            m.getObject().op.EjectCard();
            m.getObject().op.DisplayMenu();
            m.getObject().change_state(4);
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }
}
