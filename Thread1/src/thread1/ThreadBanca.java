/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author pogliani.mattia
 */
public class ThreadBanca implements Runnable{
    Thread T;
    String threadName;
    ContoCorrente conto;

    public ThreadBanca(String threadName, ContoCorrente conto) {
        this.threadName = threadName;
        this.conto = conto;
        T = new Thread(this);
        T.start();
    }

    @Override
    public void run() {
        System.out.println(threadName + " partito con saldo= " + conto.getSaldo());
    }
    
    public void versa(float importo){
        conto.deposito(importo);
        System.out.println("\t" +threadName +" saldo: " + conto.getSaldo());
    }
    
    public void preleva(float importo) throws InterruptedException{
        conto.prelievo(importo);
        System.out.println("\t" +threadName +" saldo: " + conto.getSaldo());
    }
}
