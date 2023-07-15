package TemplateDesignPattern;

public class SeniorCitizone extends  TaxCalculation {
    @Override
    int applySurcharge(int tax) {
        return (int)( tax*1.00);
    }

    @Override
    int applyTaxRate(int incAfterSD) {
        return  (int) (incAfterSD*0.1);
    }

    @Override
    int applyStandardDeduction(int income) {
        return (int) income-100000;
    }
}
