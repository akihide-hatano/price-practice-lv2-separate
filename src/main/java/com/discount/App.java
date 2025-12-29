package com.discount;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args){
        System.out.println("=== 割引アプリ (Lv2 / 分離版) ===");

        //計算ロジック担当クラスを作成
        PriceCalculator calculator = new PriceCalculator();

        try(Scanner scanner = new Scanner(System.in)){

            //1.価格入力
            System.out.println("商品価格を入力してください > ");
            String priceInput = scanner.nextLine().trim();

            int price;

            try {
                price = Integer.parseInt(priceInput);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
