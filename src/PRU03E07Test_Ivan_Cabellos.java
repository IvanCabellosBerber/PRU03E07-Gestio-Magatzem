import java.util.ArrayList;
import java.util.Scanner;

public class PRU03E07Test_Ivan_Cabellos {

    public static void main(String[] args) {
        //Creamos la lista de productos
        ArrayList<PRU03E07_Ivan_Cabellos> products = new ArrayList<>();

        //Instanciamos tres productos
        PRU03E07_Ivan_Cabellos keyborad = new PRU03E07_Ivan_Cabellos(1, "A gaming keyboard", 39.99, 69.99, 100);
        PRU03E07_Ivan_Cabellos mouse = new PRU03E07_Ivan_Cabellos(2, "Gaming mouse for pro players", 29.99, 59.99, 60);
        PRU03E07_Ivan_Cabellos gamingDisplay = new PRU03E07_Ivan_Cabellos(3, "A gaming display for playing", 149.99, 229.99, 45);

        //Añadimos las instancias a la lista
        products.add(keyborad);
        products.add(mouse);
        products.add(gamingDisplay);

        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        int menuControler = 0;

        /* MENU */
        while (menuControler != 7){
            System.out.println("What do you want to do:");
            System.out.println("1. List " +
                    "\n2. Add " +
                    "\n3. Delete " +
                    "\n4. Modify " +
                    "\n5. Update product stock enter " +
                    "\n6. Update product stock out " +
                    "\n7. Exit");
            menuControler = sc.nextInt();

            switch (menuControler){
                case 1:
                    //Imprimimos la lista por consola
                    System.out.println("List: ");
                    System.out.println(products.toString() + "\n");

                    System.out.println("Press 7 to exit to menu");
                    int exitFromList = sc.nextInt();
                    if (exitFromList == 7) continue;

                    break;
                case 2:
                    //Instanciamos el producto
                    PRU03E07_Ivan_Cabellos newProduct = new PRU03E07_Ivan_Cabellos();
                    newProduct.setId(products.size() + 1);

                    //Añadimos la descripcion
                    System.out.println("What do you want to add? Enter a description");
                    String description = sc.next();
                    newProduct.setDesc(description);

                    //Entramos el precio al por mayor
                    System.out.println("Enter the wholesale price");
                    double wholesalePrice = sc.nextDouble();
                    newProduct.setArticlePrice(wholesalePrice);

                    //Ponemos el precio al por menor
                    System.out.println("Set the price to retail");
                    double retailPrice = sc.nextDouble();
                    newProduct.setSalePrice(retailPrice);

                    //Ponemos el stock del producto
                    System.out.println("Set the stock of the product");
                    int stock = sc.nextInt();
                    newProduct.setStock(stock);

                    //Añadimos el producto a la lista
                    products.add(newProduct);
                    break;

                case 3:
                    System.out.println("What do you want to delete?");
                    System.out.print("Enter the product id: ");
                    int productDrop = sc.nextInt();

                    products.remove(productDrop - 1); break;

                case 4:
                    System.out.println("What do you want to update?");
                    System.out.print("Enter the product id: ");
                    int productID = sc.nextInt();
                    //Instanciamos una copia del producto de la arrayList
                    PRU03E07_Ivan_Cabellos modifyProduct = products.get(productID - 1);

                    /* MODIFY MENU */
                    System.out.println("What do you want to update: ");
                    System.out.println("1. Description" +
                            "\n2. Wholesale price" +
                            "\n3. Retail price" +
                            "\n4. Stock number");

                    int modifyControler = sc.nextInt();

                    switch (modifyControler){
                        case 1:
                            System.out.print("Enter the new description: ");
                            String newDescription = sc.next(); modifyProduct.setDesc(newDescription);
                            break;
                        case 2:
                            System.out.print("Enter the new wholesale price: ");
                            double newWholesalePrice = sc.nextDouble(); modifyProduct.setArticlePrice(newWholesalePrice);
                            break;
                        case 3:
                            System.out.print("Enter the new retail price: ");
                            double newRetailPrice = sc.nextDouble(); modifyProduct.setArticlePrice(newRetailPrice);
                            break;
                        case 4:
                            System.out.print("Enter the new stock number: ");
                            int newStock = sc.nextInt(); modifyProduct.setStock(newStock);
                            break;
                    }
                    //Lo asignamos una vez modificado
                    products.set(productID - 1, modifyProduct); break;

                case 5:
                    System.out.print("Which product do you want to modify: ");
                    int productModifyID = sc.nextInt();
                    PRU03E07_Ivan_Cabellos modifyStockEnterProduct = products.get(productModifyID - 1);

                    System.out.println("Enter how many products has entered");
                    int newStock = sc.nextInt(); modifyStockEnterProduct.setStock(newStock);
                    products.set(productModifyID - 1, modifyStockEnterProduct);
                    break;

                case 6:
                    System.out.print("Which product do you want to modify: ");
                    int productModifyOutID = sc.nextInt();
                    PRU03E07_Ivan_Cabellos modifyStockOutProduct = products.get(productModifyOutID - 1);

                    System.out.println("Enter how many products has sold");
                    int newOutStock = sc.nextInt(); modifyStockOutProduct.setStock(newOutStock);
                    products.set(productModifyOutID - 1, modifyStockOutProduct);
                    break;
            }
        }
        /* - MENU - */
    }


}
