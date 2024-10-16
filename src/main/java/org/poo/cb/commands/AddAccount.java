package org.poo.cb.commands;
import org.poo.cb.eBanking;

public class AddAccount extends Comanda{

        public void executa(eBanking eBanking, String[] arguments) {
            try {
                eBanking.addAccount(arguments[0], arguments[1]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}