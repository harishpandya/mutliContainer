package com.service.impl;

import com.service.BookKeepingService;

public class BookKeepingServiceImpl implements BookKeepingService {
    @Override
    public int getTodaysSell(int dayOfMonth) {

        switch(dayOfMonth){
            case 1: return dayOfMonth+10000;
            case 2: return dayOfMonth+10000;
            case 3: return dayOfMonth+10000;
            case 4: return dayOfMonth+10000;
            case 5: return dayOfMonth+10000;
            case 6: return dayOfMonth+10000;
            case 7: return dayOfMonth+10000;
            case 8: return dayOfMonth+10000;
            case 9: return dayOfMonth+10000;
        }
        return 0;
    }
}
