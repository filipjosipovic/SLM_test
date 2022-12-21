package com.example.slm_test;


import org.springframework.stereotype.Service;

@Service
public class PercService {
    public int getPercentage(int perc) {
        if (perc < 50)
            return 5;
        else if (perc >= 50 && perc < 63)
            return 4;
        else if (perc >= 63 && perc < 75)
            return 3;
        else if (perc >= 75 && perc < 88)
            return 2;
        else if (perc >= 88)
            return 1;
        return 0;
    }
}