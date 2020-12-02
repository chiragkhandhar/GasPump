package State;

import MDA_EFSM.MDA_EFSM;

public class activate extends State {
    public activate(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void create()
    {
        if (m.getObject().S == m.getObject().LS[0])
        {

        } else {
            System.out.println("This opreation is not Valid on current state");
        }

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
