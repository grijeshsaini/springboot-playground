package com.grijesh.service;

import com.grijesh.dto.ConvertRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by grijesh on 31/10/15.
 */
@Service
public class ConvertRequestServiceImpl implements ConvertRequestService {

    @Override
    public BigDecimal convertCurrency(ConvertRequest convertRequest) {
        return new BigDecimal(50);
    }
}
