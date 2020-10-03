package OUT_system;

import IN_system.Stock;

import IN_system.Order;

import IN_system.Payment;

import IN_system.Product;

import java.util.Scanner; 


public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		Scanner add=new Scanner(System.in);
		int OP = 0;
		
		do {
			
		
			System.out.println("Please select class to test ");
			System.out.println("1 coustomer");
			System.out.println("2 Supplier");
			System.out.println("3 Admin");
			System.out.println("4 stock");
			System.out.println("5 order");
			System.out.println("6 Payment");
			System.out.println("7 Product");
		
			System.out.println("8 exit ");
			OP = myObj.nextInt();
			
			
			switch(OP) {
			case 1:
				
				Customer cc = new Customer();
				System.out.println("Welcome coustomer");
				
				long ID = 0;
				int op = 0;
				
				do {
				System.out.println("Please select one option ");
				System.out.println("1 Add details");
				System.out.println("2 Edit details");
				System.out.println("3 Delete details");
				System.out.println("4 exit ");
				op = myObj.nextInt();
				
				switch(op){
				case 1:
					System.out.println("please enter your details ");
					
					System.out.println("Name ");
					String name = myObj.next();
					
					System.out.println("\n");
					
					System.out.println("Phone no");
					Long phoneNo = Long.parseLong(myObj.next());
					
					
					System.out.println("\n");
					
					System.out.println("Address ");
					String Address = myObj.next();
					
					
					ID = phoneNo*54/100 ;
					
			 
					
					cc.AddCustomer(ID, name, Address, phoneNo);
					
					break;
				case 2:
					System.out.println("please enter your details ");
					
					System.out.println("Name ");
					String Mname = myObj.next();
					
					System.out.println("\n");
					
					System.out.println("Phone no");
					Long MphoneNo = Long.parseLong(myObj.next());
					
					
					System.out.println("\n");
					
					System.out.println("Address ");
					String MAddress = myObj.next();
					
				 
					
					cc.EditCustomer(ID, Mname, MAddress, MphoneNo);
					System.out.println("\n\n Modified  !!!\n\n ");
					
					break;
					
				case 3:
					cc.DeleteCustomer(ID);
					System.out.println("\n\n Deleted !!!\n\n ");
					break;
				case 4:
					break;
					
				}
		}while(op!=4);
				
		break;
		
		case 2:
			
			Supplier ss = new Supplier();
			System.out.println("Welcome Supplier");
			
			long ID1 = 0;
			int op1 = 0;
			
			do {
			System.out.println("Please select one option ");
			System.out.println("1 Add details");
			System.out.println("2 Edit details");
			System.out.println("3 Delete details");
			System.out.println("4 exit ");
			op1 = myObj.nextInt();
			
			switch(op1){
			case 1:
				System.out.println("please enter your details ");
				
				System.out.println("Name ");
				String name = myObj.next();
				
				System.out.println("\n");
				
				System.out.println("Phone no");
				Long phoneNo = Long.parseLong(myObj.next());
				
				
				System.out.println("\n");
				
				System.out.println("Address ");
				String Address = myObj.next();
				
				
				ID1 = phoneNo*54/100 ;
				
		 
				
				ss.AddSupplier(ID1, name, Address, phoneNo);
				
				break;
			case 2:
				System.out.println("please enter your details ");
				
				System.out.println("Name ");
				String Mname = myObj.next();
				
				System.out.println("\n");
				
				System.out.println("Phone no");
				Long MphoneNo = Long.parseLong(myObj.next());
				
				
				System.out.println("\n");
				
				System.out.println("Address ");
				String MAddress = myObj.next();
				
			 
				
				ss.EditSupplier(ID1, Mname, MAddress, MphoneNo);
				System.out.println("\n\n Modified  !!!\n\n ");
				
				break;
				
			case 3:
				ss.DeleteSupplier(ID1);
				System.out.println("\n\n Deleted !!!\n\n ");
				break;
			case 4:
				break;
				
				}
		}while(op1!=4);
			
		break;
		
		case 3:
			System.out.println("not activated !!!");
			System.out.println(" \n NOTE : Admin has eccess to entire system "
					+ "\nand requirs stable database connection to perform admin operation ");
			
		case 4:
			int Product_Id;
			int Quantity;
			int Supplier_Id;
			int a=0;
			int choice;
			Stock[] obj = new Stock[10];
			
			
			
			do{
			System.out.print("Enter your choice\t1)Add Stock\t2)Display Stock\t3)Exit\n");
			choice=add.nextInt();
			
			switch(choice){
				case 1:
					System.out.print("\n\nEnter your supplier Id\t");
					Supplier_Id=add.nextInt();
			
					System.out.print("Enter Product Id whose stock you want to add\t");
					Product_Id=add.nextInt();
			
					System.out.print("Enter Quantity of product\t");
					Quantity=add.nextInt();

					obj[a] = new Stock(Product_Id,Quantity,Supplier_Id);
					a=a+1;
					
					break;
				
				case 2:
					for (int i=0;i<a;i++){
						System.out.print("Product Id \t\t Quantity");
						obj[i].showData();
					}
					break;
			}
			}while(choice!=3);
			
		case 5:
			
			int Order_ID=0;
			int Customer_ID;
			String Customer_name;
			float ammount;
			String Order_date;
			int choice1;
			
			Order obj1 = new Order();
			
		 
			
			do{
			System.out.print("Enter your choice\t1)Add order\t2)delete order\t3)Exit\n");
			choice1=add.nextInt();
			
			switch(choice1){
				case 1:
					System.out.print("\n\nEnter your Customer Id\t");
					Customer_ID=add.nextInt();
					
					System.out.print("\n\nEnter your orderId\t");
					Order_ID = add.nextInt();
					
					System.out.print("\n\nEnter your Customer Name\t");
					Customer_name = add.next();
					
					System.out.print("\n\nEnter your amount\t");
					ammount = add.nextFloat();
					
			
					
					System.out.print("\n\nEnter your  Order date\t");
					Order_date = add.next();
					
					obj1.Add_order(Order_ID ,Customer_ID ,Customer_name ,ammount,Order_date);
					
					break;
				
				case 2:
					
					obj1.Cancel_order(Order_ID);
					
					 
			}
			}while(choice1!=3);
			break;
			
		case 6:
			int Paymant_Id;
			int Payment_Amount;
			int Paymant_Customer_Id;
			int a1=0;
			int choice2;
			Payment[] obj3 = new Payment[10];
			
	
			do{
			System.out.print("Enter your choice\t1)Add payment\t2)Display payment\t3)Search Payment\t4)Exit\n");
			choice2=add.nextInt();
			
			switch(choice2){
				case 1:
					System.out.print("\n\nEnter payment Id\t");
					Paymant_Id=add.nextInt();
			
					System.out.print("Enter Payment amount\t");
					Payment_Amount=add.nextInt();
			
					System.out.print("Enter your customer Id\t");
					Paymant_Customer_Id=add.nextInt();

					obj3[a1] = new Payment(Paymant_Id,Payment_Amount,Paymant_Customer_Id);
					a1=a1+1;
					
					break;
				
				case 2:
					System.out.print("Payment Id \t\t Amount \t\t Customer Id");
					for (int i=0;i<a1;i++){
						obj3[i].Display();
					}
					break;
					
				case 3:
					System.out.print("In Progress");
					
			}
			}while(choice2!=4);
			
				
			
		case 7:
			int Product_Id1;
			int Supplier_Id1;
			int a2=0;
			int choice3;
			Product[] obj4 = new Product[10];
			
			 
			
			do{
			System.out.print("\nEnter your choice\t1)Add Product\t2)Display Product\t3)Delete Product\t4)Exit\n");
			choice3=add.nextInt();
			
			switch(choice3){
				case 1:
					System.out.print("\n\nEnter your supplier Id\t");
					Supplier_Id1=add.nextInt();
			
					System.out.print("Enter Product Id of product you want to add\t");
					Product_Id1=add.nextInt();

					obj4[a2] = new Product(Product_Id1,Supplier_Id1);
					a2=a2+1;
					
					break;
				
				case 2:
					for (int i=0;i<a2;i++){
						System.out.print("Product Id \t\t Supplier");
						obj4[i].showData();
					}
					break;
				
				case 3:
					System.out.print("\nIn Progress.............\n");
			}
			}while(choice3!=4);
					
		}
		
		}while(OP!=8);
 
		
	 
			
		
		
	
		
 
		
		
	}

}
