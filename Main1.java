/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_TH;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order currentOrder = null;
        int menu;
        do {
            System.out.println("1. Nhap:");
            System.out.println("2. In ra man hinh:");
            System.out.println("0.Thoat:");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nhap Ma SP:");
                    String productID = sc.nextLine();

                    System.out.println("Nhap mo ta:");
                    String description = sc.nextLine();

                    System.out.println("Nhap don gia:");
                    double price = sc.nextDouble();

                    System.out.println("Nhap so luong:");
                    int quatity = sc.nextInt();
                    Product p = new Product(description, productID, price);
                    if (currentOrder == null) {
                        currentOrder = new Order(LocalDate.now());
                    }

                    currentOrder.addLineItem(p, quatity);
                    System.out.println("Nhap thanh cong:");
                    break;
                case 2:
                    System.out.println(currentOrder.toString());
                    break;
                default:
                    if (menu == 0) {
                        System.out.println("Thoat ");
                    } else {
                        System.out.println("Vui long nhap lai lan nua");
                    }
                    if (currentOrder != null) {
                        currentOrder = new Order(LocalDate.now());
                    }
            }
        } while (menu != 0);
    }
}
