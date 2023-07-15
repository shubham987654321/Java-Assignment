package TemplateDesignPattern;

abstract class TaxCalculation {

    public final int calculateTax(int income){
        int  incAfterSD = applyStandardDeduction(income);
        int tax = applyTaxRate(incAfterSD);
        int taxAfterSurcharge = applySurcharge(tax);
        return  taxAfterSurcharge;
    }

    abstract int applySurcharge(int tax) ;

    abstract int applyTaxRate(int incAfterSD);

    abstract int applyStandardDeduction(int income) ;
}
