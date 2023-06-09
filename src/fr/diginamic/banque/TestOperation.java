package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Map;

public class TestOperation {
    public static void main(String[] args) {
        Credit credit1 = new Credit(new Date(), BigDecimal.valueOf(1233.08));
        Credit credit2 = new Credit(new Date(), BigDecimal.valueOf(1332.11));
        Debit debit1 = new Debit(new Date(), BigDecimal.valueOf(223.94));
        Debit debit2 = new Debit(new Date(), BigDecimal.valueOf(122.23));

        Operation[] tableauOperations = new Operation[4];

        tableauOperations[0] = credit1;
        tableauOperations[1] = debit1;
        tableauOperations[2] = credit2;
        tableauOperations[3] = debit2;

        BigDecimal solde = BigDecimal.valueOf(0);

        for (Operation compte : tableauOperations) {
            solde = compte.recalculSolde(solde);
            System.out.println(compte.getDateOperation().toInstant().atZone(ZoneId.systemDefault())
                    + " "
                    + compte.getType()
                    + " "
                    + compte.getMontantOperation()
                    + " SOLDE: "
                    + solde);
        }
    }
}
