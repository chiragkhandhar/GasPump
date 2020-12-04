package State;

import MDA_EFSM.MDA_EFSM;

public class S3 extends State {
    public S3(MDA_EFSM mda_efsm) {
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
        if (m.getObject().S == m.getObject().LS[4])
        {
            m.getObject().op.SetPrice(g);
            System.out.println("|                                        |");
            System.out.println("|            11. StartPump               |");
            System.out.println("|             6. Cancel                  |");
            System.out.println("|                                        |");
        } else {
            System.out.println("This operation is not Valid on current state");
        }
    }

    @Override
    public void StartPump() {
        if (m.getObject().S == m.getObject().LS[4])
        {
            m.getObject().op.SetInitialValues();
            System.out.println("|                                        |");
            System.out.println("|            Pump Started                |");
            System.out.println("|                                        |");
            m.getObject().change_state(5);
            System.out.println("|   Start Pumping Gas by selecting Pump  |");
            System.out.println("|                                        |");
        } else {
            System.out.println("This operation is not Valid on current state");
        }
    }

    @Override
    public void Cancel() {
        if (m.getObject().S == m.getObject().LS[4])
        {
            m.getObject().op.CancelMsg();
            m.getObject().change_state(1);
        } else {
            System.out.println("This operation is not Valid on current state");
        }

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
    public void IncorrectPin(int k) {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }

    @Override
    public void CorrectPin() {
        System.out.println("|          Invalid Operation.            |");
        System.out.println("|                                        |");
    }
}
