package com.cowerling.domain;

import org.apache.ibatis.type.Alias;

/**
 * Created by dell on 2017-6-15.
 */
@Alias("phoneNumber")
public class PhoneNumber {
    private String countryCode;
    private String stateCode;
    private String number;

    public PhoneNumber(String countryCode, String stateCode, String number) {
        this.countryCode = countryCode;
        this.stateCode = stateCode;
        this.number = number;
    }

    public PhoneNumber(String phoneNumberString) {
        String[] parts = phoneNumberString.split("-");

        if (parts.length == 3) {
            this.countryCode = parts[0];
            this.stateCode = parts[1];
            this.number = parts[2];
        }
    }

    @Override
    public String toString() {
        return countryCode + "-" + stateCode + "-" + number;
    }
}
