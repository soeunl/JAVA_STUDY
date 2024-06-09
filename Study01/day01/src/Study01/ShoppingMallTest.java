package Study01;

public class ShoppingMallTest {
    public static void main(String[] args) {

        ShoppingMall shoppingMall = new ShoppingMall();

        shoppingMall.orderId = "201803120001";
        shoppingMall.customerId = "abc123";
        shoppingMall.orderDate = "2018년 3월 12일";
        shoppingMall.customerName = "홍길순";
        shoppingMall.productId = "PD345-12";
        shoppingMall.Address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호 : " + shoppingMall.orderId);
        System.out.println("주문자 아이디 : " + shoppingMall.customerId);
        System.out.println("주문 날짜 : " + shoppingMall.orderDate);
        System.out.println("주문자 이름 : " + shoppingMall.customerName);
        System.out.println("주문 상품 번호 : " + shoppingMall.productId);
        System.out.println("배송 주소 : " + shoppingMall.Address);
    }
}
