/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03_TH;

/**
 *
 * @author LENOVO
 */
public class OrderDetail {

   private int quality;
   private Product product;

    public OrderDetail(int quality, Product product) {
        this.quality = quality;
        this.product = product;
    }
    
  public double calcTotalPrice(){
       double thanhtien = product.getPrice()*quality ;
       return thanhtien;
   }

    @Override
    public String toString() {
        return "OrderDetail{" + "quality=" + quality + ", product=" + product + '}';
    }
   public int getQuality(){
       return quality;
   }
   public void setQuality(int quality){
    this.quality =quality;       
   }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
