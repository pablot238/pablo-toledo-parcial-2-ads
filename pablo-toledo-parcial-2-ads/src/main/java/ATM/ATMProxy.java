package ATM;

public class ATMProxy implements getATMData{
    private getATMData machine;
    
    public ATMProxy(getATMData machine){
        this.machine = machine;
    }
    
    @Override
    public int getCash(){
        return machine.getCash();
    }
}
