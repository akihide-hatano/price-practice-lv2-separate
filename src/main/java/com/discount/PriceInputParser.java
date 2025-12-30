package com.discount;

public class PriceInputParser {

    public static Integer parseOrNull(String raw){
        if( raw == null){
            return null;
        }

        String trimmed = raw.trim();
        if( trimmed.isEmpty()){
            return null;
        }

        try {
            int price = Integer.parseInt(trimmed);
            if( price < 0){
                return null;
            }
            return price;
        } catch (Exception e) {
            return null;
        }
    }
}