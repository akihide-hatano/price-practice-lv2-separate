package com.discount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void プレミアム会員なら割引される(){
        PriceCalculator calculator = new PriceCalculator();
        double result = calculator.calculate(1000, true);
        assertEquals(900, result);
    }

    @Test
    void 通常会員なら割引されない(){
        PriceCalculator calculator = new PriceCalculator();
        double result = calculator.calculate(1000, false);
        assertEquals(1000, result);
    }

    @Test
    void 価格が0ならプレミアム会員でも0円のまま(){
        PriceCalculator calculator = new PriceCalculator();
        double result = calculator.calculate(0, true);
        assertEquals(0, result);
    }

    @Test
    void マイナス値の入力でも計算さえれてしまう(){
        PriceCalculator calculator = new PriceCalculator();
        double result = calculator.calculate(-1000, false);
        assertEquals(-1000,result);
    }
}