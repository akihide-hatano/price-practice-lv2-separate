package com.discount;

public class PriceCalculator {

    public double calculate(int price,boolean isPremium){
        if(isPremium ){
            return price * 0.9;
        }
        return price;
    }
}