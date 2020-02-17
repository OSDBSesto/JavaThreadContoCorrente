package thread1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pogliani.mattia
 */
public class ContoCorrente {
    private float saldo;
    
    public ContoCorrente(float saldoIniziale){
        saldo = saldoIniziale;
    }
    
    public void prelievo (float soldi) throws InterruptedException{
//        while (saldo-soldi<0) wait();
        saldo -= soldi;
    }
    
    public void deposito(float soldi){
        saldo += soldi;
//        notify();
    }
    
    public float getSaldo(){
        return saldo;
    }
    
}
