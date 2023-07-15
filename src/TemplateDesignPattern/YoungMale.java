package TemplateDesignPattern;

public class YoungMale extends  TaxCalculation{
    @Override
    int applySurcharge(int tax) {
        return (int)( tax*2.00);
    }

    @Override
    int applyTaxRate(int incAfterSD) {
        return  (int) (incAfterSD*0.5);
    }

    @Override
    int applyStandardDeduction(int income) {
        return (int) income-20000;
    }
}
