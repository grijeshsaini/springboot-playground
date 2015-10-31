package com.grijesh.com.grijesh.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by grijesh on 31/10/15.
 */
@Setter
@Getter
public class ConvertRequest {
    private String amount;
    private String baseCurrency;
    private String requestedCurrency;

    @Override
    public String toString() {
        return "ConvertRequest{" +
                "amount='" + amount + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", requestedCurrency='" + requestedCurrency + '\'' +
                '}';
    }
}
