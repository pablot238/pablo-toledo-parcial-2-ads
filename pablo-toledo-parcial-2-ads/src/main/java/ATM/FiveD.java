package ATM;

//cadena para los billetes de 5
public class FiveD implements DispenseChain{
    private DispenseChain chain;
    
    @Override
    public void setNextChain(DispenseChain nextChain){
        this.chain=nextChain;
    }
    
    @Override
    public void dispense(Currency cur){
        if(cur.getAmount() >=5){
            int num= cur.getAmount()/5;
            int remainder = cur.getAmount()%5;
            System.out.println("Dispensing " + num + " of 5$");
            if(remainder != 0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
