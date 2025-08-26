
interface Pay {

    // 추상 메소드
    void processPay(int amount);  // public abstract

    default void print() {
        System.out.println("call default method");
    }
    
    static void print1() {
        System.out.println("call static method");
    }
}


class Card implements Pay {

    @Override
    public void processPay(int amount) {
       System.out.println("🏧 신용 카드로 " + amount + "원을 결제하였습니다.");        
    }
    
}


public class InterfaceApp {
    public static void main(String[] args) {

        Card card = new Card();
        
        card.processPay(1000);

        card.print();

        Pay.print1();
        
    }   

}
