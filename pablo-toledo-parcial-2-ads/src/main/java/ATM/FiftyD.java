package ATM;

//cadena para los billetes de 50
public class FiftyD implements DispenseChain{
    private DispenseChain chain;
    
    @Override
    public void setNextChain(DispenseChain nextChain){
        this.chain=nextChain;
    }
    
    @Override
    public void dispense(Currency cur){
        if(cur.getAmount() >=50){
            int num= cur.getAmount()/50;
            int remainder = cur.getAmount()%50;
            System.out.println("Dispensing " + num + " of 50$ ");
            if(remainder != 0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
