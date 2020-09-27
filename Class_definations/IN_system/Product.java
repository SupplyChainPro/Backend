package IN_system;

public class Product {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class product{
    int product_ID;
    String product_name;
    float price;
    int quantity;

    product(){
        product_ID=0;
        product_name="";
        price=0;
        quantity=0;
    }

    product(int p_ID; String p_name; float p; int q){
        product_ID=p_ID;
        product_name=p_name;
        price=p;
        quantity=q;
    }

    public void Add_product(){
        //get product details and add to the database.
    }

    public void Search_product(){
        //search given product
    }

    public void Modify_product(){
        //get product from database to edit.update database with modified data
    }

    public void Delete_product(){
        //delete given product
    }
}
