package com.alticelabs.alticciproject.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {

    private Integer alticciNumbers(Integer n) {
        if (n < 2) {
            return n;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return alticciNumbers(n - 3) + alticciNumbers(n - 2);
        }
    }

    public Integer getAlticciSequenceNumber(Integer n) {
        return alticciNumbers(n);
    }
}
