package fr.diginamic.banque.entites;

import javax.print.attribute.DateTimeSyntax;
import java.math.BigDecimal;
import java.util.Date;

public abstract class Operation {
    Date dateOperation;
    BigDecimal montantOperation;

    public Operation(Date dateOperation, BigDecimal montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public BigDecimal getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(BigDecimal montantOperation) {
        this.montantOperation = montantOperation;
    }
}
