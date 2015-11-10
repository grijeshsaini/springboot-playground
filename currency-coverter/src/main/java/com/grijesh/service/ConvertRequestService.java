package com.grijesh.service;

import com.grijesh.dto.ConvertRequest;

import java.math.BigDecimal;

/**
 * Created by grijesh on 31/10/15.
 */
public interface ConvertRequestService {
    public BigDecimal convertCurrency(ConvertRequest convertRequest);
}
