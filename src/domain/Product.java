package domain;

public class Product {
    private  int id;
    private int productprice;
    private int inventory;
    private int categoryid;
    private  String productname;

    public int getId() {
        return id;
    }

    public int getProductprice() {
        return productprice;
    }

    public int getInventory() {
        return inventory;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public String getProductname() {
        return productname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
