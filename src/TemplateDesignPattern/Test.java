package TemplateDesignPattern;

public class Test {
    public static void main(String[] args) {
        TaxCalculation yongmale = new YoungMale();
       int res1 = yongmale.calculateTax(10000);
        TaxCalculation seniorcitizone = new SeniorCitizone();
        int res2 =seniorcitizone.calculateTax(10000);
        System.out.println("res 1" + res1 + " res 2"+res2);

    }
}
