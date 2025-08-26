// Account.java

//클래스 선언
public class Account {

    //static(클래스) field
    public static String bankName;


    //instance filed    
    private String accountNumber;
    private String name;
    private String pwd;
    private int balance;


    static {
        System.out.println("call static 초기화 블록");
        bankName = "우리은행";
    }
    
    // Contructor method

    public Account() {  // Default Constuctor method

    }
    

    public Account(String accountNumber, String name, String pwd, int balance) {
        
        System.out.println("call construtor method");

        System.out.println("this : " + this);

        this.accountNumber = accountNumber;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }


    // instatnce method
    // 입금하다
    public void deposit(int amoumt) {
        this.balance += amoumt;
    }

    //출금하다.
    public void withdraw(int amount) {
        this.balance -= amount;
    }
    
    //잔액 조회하다.
    public int getBalance() {
        return balance;
    }

    //계좌이체하다.
    public void transferAccount(Account account, int amount) {
        this.withdraw(amount);
        account.deposit(amount);

    }
    
}
