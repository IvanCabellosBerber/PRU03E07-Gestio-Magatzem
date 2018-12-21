
public class PRU03E07_Ivan_Cabellos {

    private int id;
    private String desc;
    private double articlePrice;
    private double salePrice;
    private int stock;

    public PRU03E07_Ivan_Cabellos(){
        //VOID CONSTRUCTOR
    }

    public PRU03E07_Ivan_Cabellos(int id, String desc, double articlePrice, double salePrice, int stock) throws Exception {
        try{
            setId(id);
            setDesc(desc);
            setArticlePrice(articlePrice);
            setSalePrice(salePrice);
            setStock(stock);
        } catch (Exception e){
            throw new Exception("Intentaste poner un valor no válido");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id > 0){
            this.id = id;
        } else throw new Exception("The id must be a positive number");
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

    public void setArticlePrice(double articlePrice) throws Exception {

        if (articlePrice > 0){
            this.articlePrice = articlePrice;
        } else throw new Exception("The price must be positive");
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) throws Exception {
        if (salePrice > 0){
            this.salePrice = salePrice;
        } else throw new Exception("The sale price must be positive");
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws Exception {
        if (stock > 0){
            this.stock = stock;
        } else throw new Exception("You have to put some stock");
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
