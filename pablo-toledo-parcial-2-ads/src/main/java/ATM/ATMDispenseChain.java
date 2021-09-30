package ATM;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain c1;
    
    public ATMDispenseChain(){
        //initialize the chain
        this.c1 = new FiftyD();
        DispenseChain c2 = new TwentyD();
        DispenseChain c3 = new TenD();
        DispenseChain c4 = new FiveD();
    
        //Set the chain of responsability
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }
    
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        //proxy
        int nuevoValor;
        ATM cash = new ATM(10000);
        getATMData atm = new ATM(10000);
        getATMData proxy = new ATMProxy(atm);
        
        while(true){
            int amount = 0;
            System.out.println("Insertar el valor a retirar");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 5 !=0){
                System.out.println("ERROR!! EL VALOR DEBE SER MÚLTIPLO DE 5");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));
            //proxy
            nuevoValor = cash.getCash()-amount;
            
            //proxy
            System.out.println("El dinero restante es: "+nuevoValor);
        }
    }
}
