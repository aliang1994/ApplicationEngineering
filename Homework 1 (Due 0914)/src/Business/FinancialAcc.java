/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Wenqing
 */
public class FinancialAcc {
    private long checkingAccNo;
    private String creationDateChecking;
    private boolean isActiveChecking;    
    private String debtChecking;
    private String creditChecking; 
    
    private long savingaAccNo;
    private String creationDateSaving; 
    private boolean isActiveSaving;    
    private String debtSaving;
    private String creditSaving;

    public long getCheckingAccNo() {
        return checkingAccNo;
    }

    public void setCheckingAccNo(long checkingAccNo) {
        this.checkingAccNo = checkingAccNo;
    }

    public String getCreationDateChecking() {
        return creationDateChecking;
    }

    public void setCreationDateChecking(String creationDateChecking) {
        this.creationDateChecking = creationDateChecking;
    }

    public boolean isIsActiveChecking() {
        return isActiveChecking;
    }

    public void setIsActiveChecking(boolean isActiveChecking) {
        this.isActiveChecking = isActiveChecking;
    }

    
    public String getDebtChecking() {
        return debtChecking;
    }

    public void setDebtChecking(String debtChecking) {
        this.debtChecking = debtChecking;
    }
        
    public String getCreditChecking() {
        return creditChecking;
    }

    public void setCreditChecking(String creditChecking) {
        this.creditChecking = creditChecking;
    }
    
    
    public long getSavingaAccNo() {
        return savingaAccNo;
    }

    public void setSavingaAccNo(long savingaAccNo) {
        this.savingaAccNo = savingaAccNo;
    }

    public String getCreationDateSaving() {
        return creationDateSaving;
    }

    public void setCreationDateSaving(String creationDateSaving) {
        this.creationDateSaving = creationDateSaving;
    }

    public boolean isIsActiveSaving() {
        return isActiveSaving;
    }

    public void setIsActiveSaving(boolean isActiveSaving) {
        this.isActiveSaving = isActiveSaving;
    }
    
    

    public String getDebtSaving() {
        return debtSaving;
    }

    public void setDebtSaving(String debtSaving) {
        this.debtSaving = debtSaving;
    }

    public String getCreditSaving() {
        return creditSaving;
    }

    public void setCreditSaving(String creditSaving) {
        this.creditSaving = creditSaving;
    }
    
}
