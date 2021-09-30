
package ATM;

public class ATM implements getATMData{
    private int cash;
    
    public ATM(int cash){
        this.cash = cash;
    }
    @Override
    public int getCash(){
        return cash;
    }
    
}
