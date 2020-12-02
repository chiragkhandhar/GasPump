package State;

import MDA_EFSM.MDA_EFSM;

public  class State {

    MDA_EFSM m;

    public State(MDA_EFSM mda_efsm) {
        this.m = mda_efsm;
    }

    public  void create()
    {
        System.out.println("In State Class");
    };

    public  void start(){
        System.out.println("In State Class");
    };

    public  void PayCash(){
        System.out.println("In State Class");
    };

    public  void PayCredit(){
        System.out.println("In State Class");
    };

    public  void PayDebit(){
        System.out.println("In State Class");
    };

    public  void Approved(){
        System.out.println("In State Class");
    };

    public  void Reject(){
        System.out.println("In State Class");
    };

    public  void SelectGas(int g){
        System.out.println("In State Class");
    };

    public  void StartPump(){
        System.out.println("In State Class");
    };

    public  void Cancel(){
        System.out.println("In State Class");
    };

    public  void Pump(){
        System.out.println("In State Class");
    };

    public  void StopPump(){
        System.out.println("In State Class");
    };

    public  void IncorrectPin(int k){
        System.out.println("In State Class");
    };

    public  void CorrectPin(){
        System.out.println("In State Class");
    };
}
