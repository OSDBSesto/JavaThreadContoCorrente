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
public class RS implements Runnable {

    Thread T;
    String threadName;
    Contatore cont;

    public RS(String threadName, Contatore cont) {
        this.threadName = threadName;
        this.cont = cont;
        T = new Thread(this);
        T.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + threadName);

//        synchronized (cont) {
        cont.stampaContatore();
//        }

        System.out.println("Thread " + threadName + " exiting.");
    }

}
