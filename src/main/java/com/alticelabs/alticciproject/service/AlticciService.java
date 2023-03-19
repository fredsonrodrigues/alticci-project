package com.alticelabs.alticciproject.service;

import com.alticelabs.alticciproject.model.AlticciResponse;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;

@ApplicationScoped
public class AlticciService {

    private final HashMap<Integer, Integer> alticciSequence = new HashMap<>();

    public AlticciService() {
        alticciSequence.put(0,0);
        alticciSequence.put(1,1);
        alticciSequence.put(2,1);
    }
    private Integer alticciNumbers(Integer n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 3; i <= n; i++) {
            d = a + b;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
    public AlticciResponse getAlticciSequenceNumber(Integer n) {
        AlticciResponse response = new AlticciResponse();
        if (alticciSequence.containsKey(n)) {
            response.setValue(alticciSequence.get(n));
            response.setSource("result from cache");
        } else {
            int newValue = alticciNumbers(n);
            alticciSequence.put(n, newValue);
            response.setValue(newValue);
            response.setSource("result from function");
        }
        return response;
    }
}

