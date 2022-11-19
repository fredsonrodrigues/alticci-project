package com.alticelabs.alticciproject.service;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {

    private Integer alticciNumbers(Integer n) {
        int[] f = new int[n+3];
        int i;

        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for (i = 3; i <= n; i++)
        {
            f[i] = f[i-3] + f[i-2];
        }

        return f[n];
    }

    @CacheResult(cacheName = "alticci-cache")
    public Integer getAlticciSequenceNumber(Integer n) {
        return alticciNumbers(n);
    }
}
