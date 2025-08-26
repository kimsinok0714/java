
class Calcurator {

    public static int subtract(int a, int b) {
        return a - b;
    }

}




public class AccountApp {


    // 클래스 메소드
    public static int add(int a, int b) {
        return a + b;
    }

    

    public static void main(String[] args) throws Exception {
        
        // // 인스턴스 생성
        // Account account1 = new Account("1111", "일길동", "1111", 10000);

        // // 인스턴스 생성
        // Account account2 = new Account("2222", "이길동", "2222", 20000);



        // System.out.println("account1 : " + account1);  
    
        // System.out.println("account1.balance : " + account1.getBalance());  

        // System.out.println("은행명 " + Account.bankName);

        // int result = add(1, 2);
        // // int result = AccountApp.add(1, 2);

        // System.out.println("result : " + result);


        // result = Calcurator.subtract(5, 1);

        //  System.out.println("result : " + result);


        // 인스턴스 생성
        Account account1 = new Account("1111", "일길동", "1111", 10000);

        System.out.println("account1 : " + account1);        

        Account account2 = new Account("2222", "이길동", "2222", 20000);

        // 게좌번호가 "1111"인 고객 게좌의 잔액을 조회하다.
        int balance = account1.getBalance();
        System.out.println("balance : " + balance);        

        // 게좌번호가 "2222"인 고객 게좌의 잔액을 조회하다.
        balance = account2.getBalance();
        System.out.println("balance : " + balance); 
        
        // 게좌번호가 "1111"인 고객 게좌로 1000원을 입금하다.
        account1.deposit(1000);


        // 게좌번호가 "1111"인 고객 게좌의 잔액을 조회하다.
        balance = account2.getBalance();
        System.out.println("balance : " + balance); 
        
        // 게좌번호가 "1111"인 고객 계좌에서  게좌번호가 "2222"인 고객 계좌로 5000원을 이체하다.
        account1.transferAccount(account2, 5000);

        balance = account1.getBalance();
        System.out.println("balance : " + balance);        

        // 게좌번호가 "2222"인 고객 게좌의 잔액을 조회하다.
        balance = account2.getBalance();
        System.out.println("balance : " + balance); 

    }
}
