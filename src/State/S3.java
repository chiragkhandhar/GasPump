package State;

import MDA_EFSM.MDA_EFSM;

public class S3 extends State {
    public S3(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void Activate() {

    }

    @Override
    public void start() {

    }

    @Override
    public void PayCash() {

    }

    @Override
    public void PayCredit() {

    }

    @Override
    public void PayDebit() {

    }

    @Override
    public void Approved() {

    }

    @Override
    public void Reject() {

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

    }

    @Override
    public void StopPump() {

    }

    @Override
    public void IncorrectPin(int k) {

    }

    @Override
    public void CorrectPin() {

    }
}
