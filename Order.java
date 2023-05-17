/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_TH;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Order {

    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems = new ArrayList<OrderDetail>();
    private int count;
    Scanner sc = new Scanner(System.in);

    public Order() {

    }
    public Order(int orderID, LocalDate orderDate, List<OrderDetail> lineItems, int count) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
        this.count = count;
    }
    public Order(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
    public void addLineItem(Product p, int quatity) {
        lineItems.add(new OrderDetail(quatity, p));
    }

    public double calcTotalCharge() {
        double tongtienhoadon=0;
        for (OrderDetail o : lineItems) {
            tongtienhoadon += o.calcTotalPrice();
        }
        return tongtienhoadon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ma order: ").append(orderID).append("Ngay mua: ").append(orderDate).append("\n");
        sb.append(String.format("|%-15s|%-25s|%-20s|%-20s|%-20s|%-20s|%n", "STT", "MaSP", "Mo ta", "Don gia", "So luong", "Thanh tien"));

        for (int i = 0; i < lineItems.size(); i++) {
            OrderDetail o = lineItems.get(i);
            Product p = o.getProduct();
            sb.append(String.format("|%-15s|%-25s|%-20s|%-20s|%-20s|%-20s|%n", i + 1, p.getProductID(),
                    p.getDescription(), p.getPrice(), o.getQuality(), o.calcTotalPrice()));
        }
        sb.append("Tong tien: ").append(calcTotalCharge());
        return sb.toString();
    }
}
