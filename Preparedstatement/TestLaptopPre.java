package Preparedstatement;

import java.util.Scanner;

public class TestLaptopPre {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b=true;

		while (b) {
			System.out.println("1- Add Laptop");
			System.out.println("2- View Laptop");
			System.out.println("3- Update Laptop");
			System.out.println("4- Delete Laptop");
			System.out.println("5- Login Laptop");
			System.out.println("6- Exit");
			System.out.println("Enter choice :");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter Brand Name :");
				String brandName=sc.next();
				
				System.out.println("Enter RAM :");
				String ram=sc.next();
				
				System.out.println("Enter Price :");
				float price=sc.nextFloat();
				
				System.out.println("Enter email :");
				String email=sc.next();
				
				System.out.println("Enter pass :");
				String pass=sc.next();
				
				int res1=LaptopOperationPre.addLaptop(brandName, ram, price,email,pass);
				if (res1>0) {
					System.out.println("Laptop Added Successfully!\n");
				} else {
					System.out.println("Laptop Added Failed!\n");
				}
				break;
			}
			case 2:{
				LaptopOperationPre.viewLaptop();
				break;
			}
			case 3:{
				System.out.println("Enter Laptop ID :");
				int id=sc.nextInt();
				
				System.out.println("Enter Brand Name :");
				String brandName=sc.next();
				
				System.out.println("Enter RAM :");
				String ram=sc.next();
				
				System.out.println("Enter Price :");
				float price=sc.nextFloat();
				
				System.out.println("Enter email :");
				String email=sc.next();
				
				System.out.println("Enter pass:");
				String pass=sc.next();
				
				int res2=LaptopOperationPre.updateLaptop(id, brandName, ram, price,email,pass);
				
				if(res2>0) {
					System.out.println("Laptop Update Successfully!");
				}else {
					System.out.println("Failed to Update!");
				}
				break;
			}
			case 4:{
				System.out.println("Enter Laptop ID :");
				int id=sc.nextInt();
				
				int res3=LaptopOperationPre.deleteLaptop(id);
				
				if(res3>0) {
					System.out.println("Laptop Deleted Successfully!");
				}else {
					System.out.println("Failed to Delete!");
				}
				break;
			}
			case 5:{
				System.out.println("Enter Laptop email :");
				String email=sc.next();
				
				System.out.println("Enter Laptop pass :");
				String pass=sc.next();
				
				int res4=LaptopOperationPre.login(email, pass);
				if(res4>0) {
					System.out.println("Login Successfull!");
				}else {
					System.out.println("Invalid Credential!");
				}
				break;
			}
			case 6:{
				b=false;
				break;
			}
			default:{
				System.out.println("Invalid choice!");
				break;
			}

			}
		}

	}
}
