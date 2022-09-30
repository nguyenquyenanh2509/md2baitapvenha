package quyenanh;

import java.util.Scanner;

public class product {
    private String productId;
    private String productName;
    private String title;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private String descriptions;
    private boolean productStatus;

    public product() {
    }

    public product (String productId, String productName, String title, float importPrice, float exportPrice, int quantity, String descriptions, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        this.productId = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        this.productName = sc.nextLine();
        System.out.println("Nhap tieu de cua san pham: ");
        this.title = sc.nextLine();
        System.out.println("Nhap gia nhap cua san pham: ");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap gia ban cua san pham: ");
        this.exportPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap so luong con lai cua san pham: ");
        this.quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Mo ta san pham: ");
        this.descriptions = sc.nextLine();
        System.out.println("Trang thai san pham: ");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());
    }
    public void displayData(){
        System.out.printf("Ma sp: %s - Ten sp: %s - Tieu de sp: %s - Gia nhap: %f - Gia ban: %f\n",this.productId,this.productName,this.title,this.importPrice,this.exportPrice);
        System.out.printf("So luong con lai: %d - Mo ta: %s - Trang thai: %d\n",this.quantity,this.productStatus);
    }
        public void  calExportPrice(){
        this.importPrice=(float) (this.importPrice*1.2);
    }
}
