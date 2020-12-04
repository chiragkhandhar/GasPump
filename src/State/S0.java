package State;

import MDA_EFSM.MDA_EFSM;

public class S0 extends State {
    public S0(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void Activate() {
        System.out.println("You have already activated the gas pump");

    }

    @Override
    public void start() {
        if (m.getObject().S == m.getObject().LS[1])
        {
            m.getObject().op.PayMsg();
            m.getObject().change_state(1);

        } else {
            System.out.println("This operation is not Valid on current state");
        }
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

    }

    @Override
    public void StartPump() {

    }

    @Override
    public void Cancel() {

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
