package fr.diginamic.banque.entites;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Operation {
    private Date dateOperation;
    private BigDecimal montantOperation;

    public Operation(Date dateOperation, BigDecimal montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

    public abstract BigDecimal recalculSolde(BigDecimal ancienSolde);

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


    @Override
    public String toString() {
        return "dateOperation=" + dateOperation +
                ", montantOperation=" + montantOperation;
    }
}
