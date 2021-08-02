package domain;

public class Order {
    private int userid;
    private int productid;
    private  int orderid;
    private int ispaid;

    public int getUserid() {
        return userid;
    }

    public int getProductid() {
        return productid;
    }

    public int getOrderid() {
        return orderid;
    }

    public int getIspaid() {
        return ispaid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public void setIspaid(int ispaid) {
        this.ispaid = ispaid;
    }
}
