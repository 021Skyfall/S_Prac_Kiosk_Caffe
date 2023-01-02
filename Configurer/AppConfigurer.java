package Configurer;

import Discount.BEDiscountCondition;
import Discount.DiscountCondition;
import Discount.StudentDiscountCondition;
import KIOSK.Kiosk;

public class AppConfigurer {
    public DiscountCondition discountCondition() {
//        return new BEDiscountCondition(20);
        return new StudentDiscountCondition(500);
    }

}
// 본 클래스 추가로 할인 조건 수정 역할을 분리함
// 객체는 각 역할로 세세하게 분리하면 할 수록 좋음
// 추후에 할인 조건을 변경하고 싶으면 기존의 코드를 지우거나 변경하지 않아도
// Discount 패키지에 새로 할인 조건을 만들고
// 여기서 적용시키면
// 메인 메소드도 변경할 것 없이 정상적으로 출력됨