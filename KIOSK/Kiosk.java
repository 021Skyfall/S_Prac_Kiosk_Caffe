package KIOSK;

import Discount.BEDiscountCondition;
import Discount.DiscountCondition;
import Discount.StudentDiscountCondition;
import Product.Product;
import Product.ProductRepository;

import java.util.Scanner;

public class Kiosk {
    private ProductRepository productRepository = new ProductRepository();
//    private StudentDiscountCondition studentDiscountCondition =new StudentDiscountCondition(500);
//   private DiscountCondition discountCondition;
    Scanner scanner = new Scanner(System.in);
//    private BEDiscountCondition beDiscountCondition = new BEDiscountCondition(20);
    DiscountCondition discountCondition;

    public Kiosk(DiscountCondition discountCondition) {
        this.discountCondition = discountCondition;
    } //     DiscountCondition을 받아오는 생성자를 만들어서 하위 클래스인 BED랑 Student를 불러옴


    public void operate() {
        extracted();
        // 메뉴 선택 -> 입력
        int selectedId = Integer.parseInt(scanner.nextLine());
        Product selectedProduct = productRepository.findID(selectedId);
        // 옵션 여부 적용
        // 1. 상품에 따라 옵션 묻기
        // 2. 선택 한 옵션 적용
        // 3. 옵션 선택 내용 문자열로 만들어주기
        selectedProduct.applyOption();
        // 할인 여부 적용
        // 주문 내역 출력
//        int price = beDiscountCondition.discount(selectedProduct.getPrice());
        int price = discountCondition.discount(selectedProduct.getPrice());
        System.out.println("주문이 완료되었습니다.");
        System.out.printf("주문 상품 : %s %s\n",
                selectedProduct.getName(),selectedProduct.getOptionToString());
        System.out.println("가격 : "+price);
    }

    private void extracted() {
        // 메뉴 출력
        System.out.println("# 메뉴");
        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        // 상품 목록 출력
        for(Product product : productRepository.getProducts()) {
            System.out.printf("(%d) %-1s %d\n",
                    product.getId(), product.getName(), product.getPrice());
        } // %-1Ss  스트링 왼쪽정렬
        System.out.println("-".repeat(50));
        System.out.println("메뉴를 선택해 주세요.");
    }
}
