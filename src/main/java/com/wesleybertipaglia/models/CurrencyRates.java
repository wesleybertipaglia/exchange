package com.wesleybertipaglia.models;

import java.util.Map;

public class CurrencyRates {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public void setBaseCode(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
