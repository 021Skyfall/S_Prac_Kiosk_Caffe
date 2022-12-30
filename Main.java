
import Discount.DiscountCondition;
import Discount.StudentDiscountCondition;
import KIOSK.Kiosk;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.operate();
    }
}
/*
프로그램 설계 순서
1. 요구사항 파악
2. 객체 설계
 */
/*
객체 설계
커피, 차 -> Coffee, Tea => {이름, 가격, id (상품 선택용)} 공통정보, 옵션(커피는 샷추가 / 티는 티백 유무)
상품 목록 저장 -> ProductRepository
할인 조건 -> StudentDiscountCondition
프로그램의 메인 로직 -> Kiosk
 */