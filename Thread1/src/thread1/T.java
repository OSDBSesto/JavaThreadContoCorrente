/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class T extends Thread {

    private char c;

    public T(char c) {
        this.c = c;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Ciao sono thread " + c);
                Thread.sleep(2000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
