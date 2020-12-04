package State;

import MDA_EFSM.MDA_EFSM;

public class S1 extends State {
    public S1(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void Activate() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void start() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void PayCash() {
        if (m.getObject().S == m.getObject().LS[2])
        {
            m.getObject().op.StoreCash();
            m.getObject().op.SetW(0);
            m.getObject().op.DisplayMenu();
            m.getObject().change_state(4);
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void PayCredit() {
        if (m.getObject().S == m.getObject().LS[2])
        {
            m.getObject().op.SetW(1);
            m.getObject().change_state(3);
            System.out.println("|                                        | ");
            System.out.println("|       - Approve Transaction            | ");
            System.out.println("|       - Reject Transaction             | ");
            System.out.println("|                                        | ");
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void PayDebit() {
        if (m.getObject().S == m.getObject().LS[2])
        {
            m.getObject().op.EnterPinMsg();
            m.getObject().op.StorePin();
            m.getObject().k = 0;
            m.getObject().change_state(6);
        } else {
            System.out.println("This operation is not Valid on current state");
        }
    }

    @Override
    public void Approved() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void Reject() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void StartPump() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void Cancel() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void Pump() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void StopPump() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void IncorrectPin(int k) {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }

    @Override
    public void CorrectPin() {
        System.out.println("|   Invalid Operation. Select Payment    |");
        System.out.println("|             2. By Credit               |");
        System.out.println("|             6. By Cash                 |");
    }
}
