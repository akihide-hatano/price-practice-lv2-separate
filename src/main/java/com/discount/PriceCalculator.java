package com.discount;

public class PriceCalculator {

    public double calculate(int price,boolean isPremium){
        if( price < 0 ){
            throw new IllegalArgumentException("price must be >= 0");
        }
        if(isPremium ){
            return price * 0.9;
        }
        return price;
    }
}