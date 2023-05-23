package fr.diginamic.banque.entites;

import java.math.BigDecimal;
import java.util.Date;

public class Credit extends Operation {
    public Credit(Date dateOperation, BigDecimal montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public BigDecimal recalculSolde(BigDecimal ancienSolde){
        return ancienSolde.add(getMontantOperation());
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
