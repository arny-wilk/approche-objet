package fr.diginamic.banque.entites;

import java.math.BigDecimal;
import java.util.Date;

public class Debit extends Operation {
    public Debit(Date dateOperation, BigDecimal montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }

    @Override
    public String toString() {
        return "Debit{" +
                "dateOperation=" + dateOperation +
                ", montantOperation=" + montantOperation +
                '}';
    }
}
