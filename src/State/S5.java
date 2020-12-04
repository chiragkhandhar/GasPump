package State;

import MDA_EFSM.MDA_EFSM;

public class S5 extends State {
    public S5(MDA_EFSM mda_efsm) {
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

    }

    @Override
    public void CorrectPin() {

    }
}
