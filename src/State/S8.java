package State;

import MDA_EFSM.MDA_EFSM;

public class S8 extends State {
    public S8(MDA_EFSM mda_efsm) {
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
            }
        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void CorrectPin() {

    }
}
