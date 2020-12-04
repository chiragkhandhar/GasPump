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
            m.getObject().change_state(2);

        } else {
            System.out.println("This operation is not Valid on current state");
        }
    }

    @Override
    public void PayCash() {
        System.out.println("Please Start.  This is not the correct state to initiate PayCash operation. ");
    }

    @Override
    public void PayCredit() {
        System.out.println("Please Start.  This is not the correct state to initiate PayCredit operation. ");
    }

    @Override
    public void PayDebit() {
        System.out.println("Please Start.  This is not the correct state to initiate PayDebit operation. ");
    }

    @Override
    public void Approved() {
        System.out.println("Please Start.  This is not the correct state to initiate Approved operation. ");
    }

    @Override
    public void Reject() {
        System.out.println("Please Start.  This is not the correct state to initiate Reject operation. ");
    }

    @Override
    public void SelectGas(int g) {
        System.out.println("Please Start.  This is not the correct state to initiate SelectGas operation. ");
    }

    @Override
    public void StartPump() {
        System.out.println("Please Start.  This is not the correct state to initiate StartPump operation. ");
    }

    @Override
    public void Cancel() {
        System.out.println("Please Start.  This is not the correct state to initiate Cancel operation. ");
    }

    @Override
    public void Pump() {
        System.out.println("Please Start.  This is not the correct state to initiate Pump operation. ");
    }

    @Override
    public void StopPump() {
        System.out.println("Please Start.  This is not the correct state to initiate StopPump operation. ");
    }

    @Override
    public void IncorrectPin(int k) {
        System.out.println("Please Start.  This is not the correct state to initiate IncorrectPin operation. ");
    }

    @Override
    public void CorrectPin() {
        System.out.println("Please Start.  This is not the correct state to initiate CorrectPin operation. ");
    }
}
