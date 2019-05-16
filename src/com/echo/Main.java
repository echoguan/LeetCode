package com.echo;

import com.echo.easy._204.CountPrimes;

public class Main {

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        int num = countPrimes.countPrimes(1500000);
        System.out.println("result " + num);
    }
}
