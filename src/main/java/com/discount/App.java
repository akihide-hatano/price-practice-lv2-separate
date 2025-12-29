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

            while (true) {
                //1.価格入力
                System.out.println("商品価格を入力してください > ");
                String priceInput = scanner.nextLine().trim();
    
                int price;
    
                try {
                    price = Integer.parseInt(priceInput);
                    if(price < 0 ){
                        System.out.println("価格は0以上で入力してください");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("数字で入力してください（例: 1200）");
                    continue;
                }


                // 2. 会員区分入力
                System.out.println("プレミアム会員ですか？ yes / no / q(終了) > ");
                String input = scanner.nextLine().trim();

                if("q".equalsIgnoreCase(input)){
                    System.out.println("終了します。ありがとうございました。");
                    break;
                }

                //プレミアム会員であるかどうかを表示させる
                boolean isPremium;
                if( "yes".equalsIgnoreCase(input)){
                    isPremium = true;
                }else if( "no".equalsIgnoreCase(input)){
                    isPremium = false;
                }else{
                    System.out.println("yes/no/qを入力してください。");
                    return;
                }
                //計算ロジックの表示
                double finalPrice = calculator.calculate(price, isPremium);

                //結果表示
                if(isPremium){
                    System.out.println("プレミアム会員割引後の価格:"+ finalPrice + "円");
                    break;
                }else{
                    System.out.println("通常価格" + finalPrice + "円");
                    break;
                }
            }
        }
    }
}
