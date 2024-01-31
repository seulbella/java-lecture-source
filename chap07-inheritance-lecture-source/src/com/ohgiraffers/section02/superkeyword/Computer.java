package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    /* 기본 생성자 */
    public Computer() {
        super();
        System.out.println("Computer 클래스의 기본 생성자 호출...");
    }

    /* Computer 클래스의 모든 필드를 초기화 하는 생성자 */
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super(); // 부모 클래스의 기본 생성자 호출
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출...");
    }

    /* Product 클래스와 Computer 클래스의 모든 필드를 초기화 하는 생성자 */

    public Computer(String code, String brand, String name, int price, Date manufaturingDate, String cpu, int hdd, int ram, String operationSystem) {
        /* 부모 클래스의 매개변수 생성자 호출 */
        super(code, brand, name, price, manufaturingDate);
        /* 위에 작성 된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는 것과 같기 때문에 허용 되지 않는다.
         * (부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한 번만 호출 가능하다.) */
        //this(cpu, hdd, ram, operationSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Product 클래스와 Computer 클래스의 모든 필드를 초기화 하는 생성자 호출...");
    }

    /* getter, setter는 부모 필드의 메소드에 대해서 자신의 것처럼 사용 가능하므로 별도 작성이 필요 없다.
     * 자식 클래스에 추가 된 필드에 대해서만 작성한다. */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        /* 부모 클래스의 private 멤버에는 직접 접근 불가하여 getter 메소드로 접근함.
        *  부모의 멤버는 super. 과 this. 모두 사용 가능하나 코드의 의미를 명확히 하기 위해 super. 을 사용함. */
//        return "Computer["
//                + "code=" + super.getCode()
//                + ",brand=" + super.getBrand()
//                + ",name=" + super.getName()
//                + ",price=" + super.getPrice()
//                + ",manufacturingDate=" + super.getInformation()
//                + ",cpu=" + this.cpu
//                + ",hdd=" + this.hdd
//                + ",ram=" + this.ram
//                + ",operationSystem=" + this.operationSystem
//                + "]";

        /* Product 클래스에 있는 getInformation()에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 있다.
        * 부모 클래스의 메소드를 호출해서 반환 받은 문자열에 현재 클래스의 필드 값을 추가 덧붙여본다. */
        /* super.getInformation() : 정상적으로 부모의 메소드 호출
        *  this.getInformation() : 재귀 호출이 일어나며 StackOverFlowError 발생
        *  getInformation() : this.이 자동으로 추가되며 재귀 호출 발생
        *  오버라이딩 된 메소드가 아니라 부모 메소드를 호출하기 위해 반드시 super. 을 작성해서 구분
        * */
        return super.getInformation()
                + "Computer["
                + "cpu=" + this.cpu
                + ",hdd=" + this.hdd
                + ",ram=" + this.ram
                + ",operationSystem=" + this.operationSystem
                + "]";

    }
}
