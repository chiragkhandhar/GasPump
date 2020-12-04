package State;

import MDA_EFSM.MDA_EFSM;

public class S2 extends State {

    public S2(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void Activate() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");

    }

    @Override
    public void start() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");

    }

    @Override
    public void PayCash() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void PayCredit() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void PayDebit() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void Approved() {
        if (m.getObject().S == m.getObject().LS[3])
        {
            System.out.println("|                                        | ");
            System.out.println("|---------Transaction Approved-----------| ");
            System.out.println("|                                        | ");
            m.getObject().op.DisplayMenu();
            m.getObject().op.EjectCard();
            m.getObject().change_state(4);
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void Reject() {
        if (m.getObject().S == m.getObject().LS[3])
        {
            m.getObject().op.RejectMsg();
            m.getObject().op.EjectCard();
            m.getObject().change_state(1);
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void SelectGas(int g) {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void StartPump() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void Cancel() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void Pump() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void StopPump() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void IncorrectPin(int k) {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }

    @Override
    public void CorrectPin() {
        System.out.println("| Invalid Operation. Select following    |");
        System.out.println("|       - Approve Transaction            |");
        System.out.println("|       - Reject Transaction             |");
    }
}
