package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return (targetCurrencyType.getRate()
                /sourceCurrencyType
                .getConvertedCurrency()
                .getRate()) * amountOfBaseCurrency;

        /**
         Base currency rate / Foreign currency rate  = EXCHANGE RATE

         RATE * AMOUNT = the converted amount

         Convertible currency - CURRENCY BY ENUM -> RATE

        */
    }
}
