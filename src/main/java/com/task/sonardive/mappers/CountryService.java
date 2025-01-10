package com.task.sonardive.mappers;

import org.springframework.stereotype.Service;

@Service
public class CountryService {
    public String getName(String isoCode) {
        return "name of " + isoCode;
    }
    public CountryService() {
    }
}
