package ATM;

//definir el procesamiento de la solicitud
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}
