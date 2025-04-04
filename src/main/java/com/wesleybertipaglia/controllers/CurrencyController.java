package com.wesleybertipaglia.controllers;

import com.google.gson.Gson;
import com.wesleybertipaglia.models.CurrencyRates;
import com.wesleybertipaglia.utils.Config;

public class CurrencyController {
    private static final String API_URL = Config.get("exchange.api.url");
    private static final String API_KEY = Config.get("exchange.api.key");

    private final HttpController httpController;
    private final Gson gson = new Gson();

    public CurrencyController() {
        this.httpController = new HttpController();
    }

    public double convertCurrency(String from, String to, double amount) {
        String url = String.format("%s/%s/latest/%s", API_URL, API_KEY, from);

        try {
            String response = httpController.get(url).body();
            if (response == null)
                throw new Exception("Response is null");

            CurrencyRates data = gson.fromJson(response, CurrencyRates.class);

            if (data.getConversionRates() != null && data.getConversionRates().containsKey(to)) {
                double rate = data.getConversionRates().get(to);
                return amount * rate;
            } else {
                throw new Exception("Currency not found: " + to);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
