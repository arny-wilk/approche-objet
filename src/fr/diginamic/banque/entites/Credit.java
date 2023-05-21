package fr.diginamic.banque.entites;

import java.math.BigDecimal;
import java.util.Date;

public class Credit extends Operation {
    public Credit(Date date_operation, BigDecimal montant_operation) {
        super(date_operation, montant_operation);
    }

    @Override
    public Date getDate_operation() {
        return super.getDate_operation();
    }

    @Override
    public void setDate_operation(Date date_operation) {
        super.setDate_operation(date_operation);
    }

    @Override
    public BigDecimal getMontant_operation() {
        return super.getMontant_operation();
    }

    @Override
    public void setMontant_operation(BigDecimal montant_operation) {
        super.setMontant_operation(montant_operation);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }

    @Override
    public String toString() {
        return "Credit{" +
                "date_operation=" + date_operation +
                ", montant_operation=" + montant_operation +
                '}';
    }
}
