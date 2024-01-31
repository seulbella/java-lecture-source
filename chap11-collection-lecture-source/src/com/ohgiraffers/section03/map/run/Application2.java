package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {
        /* Properties에 대해 이해하고 사용할 수 있다. */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println("prop : " + prop);

        /* Properties 객체의 값을 파일로 출력 */
        /* 예외처리 문법 */
        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 파일로부터 읽어와서 Properties 객체에 담기 */
        Properties prop2 = new Properties();
        try {
//            prop2.load(new FileInputStream("driver.dat"));
//            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
            prop2.list(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("====== 다른 방식으로 value 값 표출하기 ======");
        System.out.println(prop2.getProperty("driver"));
        System.out.println(prop2.getProperty("url"));
        System.out.println(prop2.getProperty("user"));
        System.out.println(prop2.getProperty("password"));

    }
}
