package com.grijesh.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by grijesh on 31/10/15.
 */

@Getter
@Setter
public class ConvertResponse {

    private String convertedAmount;

    @Override
    public String toString() {
        return "ConvertResponse{" +
                "convertedAmount='" + convertedAmount + '\'' +
                '}';
    }
}
