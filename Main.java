
import Configurer.AppConfigurer;
import Discount.BEDiscountCondition;
import Discount.DiscountCondition;
import Discount.StudentDiscountCondition;
import KIOSK.Kiosk;

public class Main {
    public static void main(String[] args) {
        AppConfigurer appConfigurer = new AppConfigurer();
        Kiosk kiosk = new Kiosk(appConfigurer.discountCondition());
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

// 할인 조정을 한 줄의 코드로만 바꿈
// 기존 로직은 그대로
// 이것이? 인터페이스다

// 추가로 Main 클래스는 실행 시키는 역할만 해주는 걸로 변경

//    Kiosk kiosk = new Kiosk(new BED~~~());
// 이런게 의존성 주입, 의존(값을 얻어올 것)할 객체를 매개변수 인자로 생성하면서 불러옴
// == DI
// 이 DI는 클래스 A가 B가 뭘 하는지 모르고 걍 불러오기만 하는 그런 느낌
// Configurer 는 기존 메인 메소드에 할인을 같이 입력하던 DI를
// 객체를 분리해서 따로 할인 조건을 관리하는 객체를 생성해 그 객체를 메인 메소드에서 DI 하는것