package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currencyBR = CurrencyFactory.newCurrency(Country.BRAZIL);
        Currency currencyEUA = CurrencyFactory.newCurrency(Country.EUA);
        System.out.println(currencyBR.getSymbol());
        System.out.println(currencyEUA.getSymbol());
    }
}
