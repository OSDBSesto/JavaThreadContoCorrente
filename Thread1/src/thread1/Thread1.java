/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.util.Scanner;

/**
 *
 * @author pogliani.mattia
 */
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        T t = new T('a');
//        t.start();
//        T t2 = new T('b');
//        t2.start();
//        
//        R r = new R('c');
//        Thread t3 = new Thread(r);
//        t3.start();
//        
//        R r2 = new R('d');
//        Thread t4 = new Thread(r2);
//        t4.start();

//        Contatore cont = new Contatore();
//        RS r1 = new RS("thread111", cont);
//        RS r2 = new RS("thread222", cont);
        System.out.print("inserisci saldo iniziale:");
        Scanner in = new Scanner(System.in);
        int saldoIniziale = Integer.parseInt(in.nextLine());
        ContoCorrente conto = new ContoCorrente(saldoIniziale);
        ThreadBanca T = new ThreadBanca("cliente1" , conto);
        
        while(true){
            System.out.println("1 - preleva\n2 - deposita");
            switch(in.nextLine()){
                case "2":
                    System.out.println("quanto vuoi depositare?");
                    T.versa(in.nextFloat());
                    break;
                    
                case "1":
                    System.out.println("quanto vuoi prelevare?");
                    T.preleva(in.nextFloat());
                    break;                
            }
        }
        
        //in.close();
    }

}
