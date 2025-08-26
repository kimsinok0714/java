
// super class
abstract class Employee {
    
    // default 접근 제어자
    String empNo;
    String name;

    
    // constructor method
    public Employee() {

    }

    public Employee(String empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }
    
    // 추상 메소드
    public abstract int payCheck();

    // 구상 메소드
    public void printEmpInfo() {
        String str = "empNo : " + empNo +
            ", name : " + name;
        System.out.println(str);
    }


}

// sub class

class Regular extends Employee {

    private int pay;


    Regular(String empNo, String name, int pay) {
        super(empNo, name);  // 상위 클래스 생성자 메소드 호출
        this.pay = pay;
    }


    @Override
    public int payCheck() {
        return pay;
    }


    @Override
    public void printEmpInfo() {
        super.printEmpInfo();
        System.out.println("pay : " + pay);
    }


}




public class InheritanceApp {
    
    public static void main(String[] args) {

        // 정규직 사원 객체 생성
        Regular emp1 = new Regular("1", "일길동", 5000000);

        int pay = emp1.payCheck();

        //System.out.println("pay" + pay);

        emp1.printEmpInfo();

        // Employee emp = new Employee();

        
    }
    
}
