package com.ohgiraffers.section02.update;

import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 메뉴 번호 입력 : " );
        int menuCode = sc.nextInt();
        System.out.print("변경할 메뉴 이름 입력 : ");
        sc.nextLine();
        String menuName = sc.nextLine();
        System.out.print("변경할 메뉴 가격 입력 : ");
        int menuPrice = sc.nextInt();

        MenuDTO changeMenu = new MenuDTO();
        changeMenu.setCode(menuCode);
        changeMenu.setName(menuName);
        changeMenu.setPrice(menuPrice);

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;
        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("updateMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, changeMenu.getName());
            pstmt.setInt(2, changeMenu.getPrice());
            pstmt.setInt(3, changeMenu.getCode());

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }

        if(result > 0) {
            System.out.println("메뉴 변경 성공");
        } else {
            System.out.println("메뉴 변경 실패ㅠㅠ");
        }

    }
}
