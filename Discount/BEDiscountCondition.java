package Discount;

import java.util.Scanner;

public class BEDiscountCondition implements DiscountCondition{
    private int discountAmount;

    public BEDiscountCondition(int discountAmount) {
        this.discountAmount = discountAmount;
    }
    // 할인 조건을 물어보는 메소드
    private boolean checkDiscountCondition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학원 학생이십니까? (1)_예 (2)_아니오");
        String input = scanner.nextLine();

        if(input.equals("1")) return true;
        else return false;
    }
    // 할인을 적용시키는 메소드
    private int calPrice(int price) {
        return price - (price * discountAmount / 100);
    }
    public int discount(int price) {
        if (checkDiscountCondition()) return calPrice(price);
        else return price;
    }
}
