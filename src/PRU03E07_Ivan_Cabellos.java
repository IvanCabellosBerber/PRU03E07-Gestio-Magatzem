
public class PRU03E07_Ivan_Cabellos {

    private int id;
    private String desc;
    private double articlePrice;
    private double salePrice;
    private int stock;

    public PRU03E07_Ivan_Cabellos(){
        //VOID CONSTRUCTOR
    }

    public PRU03E07_Ivan_Cabellos(int id, String desc, double articlePrice, double salePrice, int stock) {
        this.id = id;
        this.desc = desc;
        this.articlePrice = articlePrice;
        this.salePrice = salePrice;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(double articlePrice) {
        this.articlePrice = articlePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return  "\nID = " + id +
                "\nDESCRIPTION = '" + desc + '\'' +
                "\nWHOLESALE PRICE = " + articlePrice +
                "\nRETAIL PRICE = " + salePrice +
                "\nSTOCK = " + stock + "\n";
    }
}
