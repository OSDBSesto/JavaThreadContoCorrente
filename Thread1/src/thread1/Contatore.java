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
public class Contatore {

    public synchronized void stampaContatore() {
        for (int i = 5; i > 0; i--) {
            System.out.println("\tcontatore: " + i);
        }
    }
}
