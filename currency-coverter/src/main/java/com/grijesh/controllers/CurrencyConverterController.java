package com.grijesh.controllers;

import com.grijesh.dto.ConvertRequest;
import com.grijesh.dto.ConvertResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by grijesh on 31/10/15.
 */

@RestController
public class CurrencyConverterController {

    @RequestMapping("/currency")
    public ConvertResponse convertCurrency(@RequestParam ConvertRequest request){
    return null;
    }

}
