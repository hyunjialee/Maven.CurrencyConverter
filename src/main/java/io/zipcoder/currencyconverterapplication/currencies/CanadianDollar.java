package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    @Override
    public CurrencyType getConvertedCurrency() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}
