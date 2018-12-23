
public class PRU03E07_Ivan_Cabellos {

    private String codi = "LLIURE";
    private String descripcio;
    private double preuDeCompra;
    private double preuDeVenta;
    private int stock;

    public PRU03E07_Ivan_Cabellos(){
        //VOID CONSTRUCTOR
    }

    public PRU03E07_Ivan_Cabellos(String codi, String desc, double preuDeCompra, double preuDeVenta, int stock) throws Exception {
        try{
            setCodi(codi);
            setDescripcio(desc);
            setPreuDeCompra(preuDeCompra);
            setPreuDeVenta(preuDeVenta);
            setStock(stock);
        } catch (Exception e){
            throw new Exception("Intentaste poner un valor no válido");
        }
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) throws Exception {
        if (Integer.parseInt(codi) > 0){
            this.codi = codi;
        } else throw new Exception("The codi must be a positive number");
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getPreuDeCompra() {
        return preuDeCompra;
    }

    public void setPreuDeCompra(double preuDeCompra) throws Exception {

        if (preuDeCompra > 0){
            this.preuDeCompra = preuDeCompra;
        } else throw new Exception("The price must be positive");
    }

    public double getPreuDeVenta() {
        return preuDeVenta;
    }

    public void setPreuDeVenta(double preuDeVenta) throws Exception {
        if (preuDeVenta > 0){
            this.preuDeVenta = preuDeVenta;
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
        String cadena = "--------------------------------------";
        cadena += "\nCodi = " + this.codi;
        cadena += "\nDescripcio = " + this.descripcio;
        cadena += "\nPreu de compra = " + this.preuDeCompra;
        cadena += "\nPreu de venta = " + this.preuDeVenta;
        cadena += "\nStock = " + this.stock;

        return cadena;
    }
}
