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
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        T t = new T('a');
        t.start();
        T t2 = new T('b');
        t2.start();
    }
    
}
