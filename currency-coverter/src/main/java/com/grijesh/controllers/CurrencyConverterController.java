package com.grijesh.controllers;

import com.grijesh.dto.ConvertRequest;
import com.grijesh.dto.ConvertResponse;
import com.grijesh.service.ConvertRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by grijesh on 31/10/15.
 */

@RestController
public class CurrencyConverterController {

    @Autowired
    private ConvertRequestService convertRequestService;

    @RequestMapping(value = "/currency", method = RequestMethod.POST)
    public ConvertResponse convertCurrency(@RequestBody ConvertRequest convertRequest) {
        BigDecimal amount = convertRequestService.convertCurrency(convertRequest);
        ConvertResponse convertResponse = new ConvertResponse();
        convertResponse.setConvertedAmount(amount.toString());
        return convertResponse;
    }

}
