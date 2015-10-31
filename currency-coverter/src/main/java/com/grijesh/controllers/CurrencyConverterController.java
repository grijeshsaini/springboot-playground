package com.grijesh.controllers;

import com.grijesh.dto.ConvertResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by grijesh on 31/10/15.
 *
 */

@RestController
public class CurrencyConverterController {



    @RequestMapping(value = "/currency",method = RequestMethod.POST)
    public ConvertResponse convertCurrency(@RequestParam(value = "amount") String amount,@RequestParam(value = "baseCurrency")String baseCurrency,@RequestParam(value = "requestedCurrency") String requestedCurrency){
     return null;
    }

}
