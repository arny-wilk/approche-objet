package fr.diginamic.banque.entites;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Operation {
    Date date_operation;
    BigDecimal montant_operation;

    public Operation(Date date_operation, BigDecimal montant_operation) {
        this.date_operation = date_operation;
        this.montant_operation = montant_operation;
    }

    public abstract String getType();

    public Date getDate_operation() {
        return date_operation;
    }

    public void setDate_operation(Date date_operation) {
        this.date_operation = date_operation;
    }

    public BigDecimal getMontant_operation() {
        return montant_operation;
    }

    public void setMontant_operation(BigDecimal montant_operation) {
        this.montant_operation = montant_operation;
    }
}
