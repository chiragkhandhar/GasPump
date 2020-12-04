package State;

import MDA_EFSM.MDA_EFSM;

public class activate extends State {
    public activate(MDA_EFSM mda_efsm) {
        super(mda_efsm);
    }

    @Override
    public void Activate()
    {
        if (m.getObject().S == m.getObject().LS[0])
        {
            m.getObject().op.StorePrice();
            m.getObject().change_state(1);

        } else {
            System.out.println("This operation is not Valid on current state");
        }

    }

    @Override
    public void start() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void PayCash() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void PayCredit() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void PayDebit() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void Approved() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void Reject() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void StartPump() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void Cancel() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void Pump() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void StopPump() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void IncorrectPin(int k) {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }

    @Override
    public void CorrectPin() {
        System.out.println(" Please Activate.  This is not the correct state to initiate this operation.");
    }
}
