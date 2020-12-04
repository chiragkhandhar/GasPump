package State;

import MDA_EFSM.MDA_EFSM;

public class S5 extends State {
    public S5(MDA_EFSM mda_efsm) {
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
        if (m.getObject().S == m.getObject().LS[5])
        {
            m.getObject().op.PumpGasUnit();
            m.getObject().op.GasPumpedMsg();
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void StopPump() {
        if (m.getObject().S == m.getObject().LS[5])
        {
            m.getObject().op.PrintReceipt();
            m.getObject().change_state(1);
        } else {
            System.out.println("This operation is not Valid on current state");
        }

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
