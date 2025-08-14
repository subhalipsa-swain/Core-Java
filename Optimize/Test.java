package Optimize;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		LaptopOperation lop=new LaptopOperation();

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
				
				Laptop l=new Laptop();
				l.setBrandName(brandName);
				l.setRam(ram);
				l.setPrice(price);
				l.setEmail(email);
				l.setPass(pass);
				
				int res1=lop.addLaptop(l);
				if (res1>0) {
					System.out.println("Laptop Added Successfully!\n");
				} else {
					System.out.println("Laptop Added Failed!\n");
				}
				break;
			}
			case 2:{
				List<Laptop> list=lop.viewLaptop();
				for(Laptop laptop:list) {
					System.out.println(laptop);
				}
				break;
			}
			case 3:{
				System.out.println("Enter Laptop ID :");
				int id=sc.nextInt();
				
				System.out.println("Enter Brand Name :");
				String newBrandName=sc.next();
				
				System.out.println("Enter RAM :");
				String newRam=sc.next();
				
				System.out.println("Enter Price :");
				float newPrice=sc.nextFloat();
				
				System.out.println("Enter email :");
				String newEmail=sc.next();
				
				System.out.println("Enter pass:");
				String newPass=sc.next();
				
				Laptop l=new Laptop();
				l.setBrandName(newBrandName);
				l.setRam(newRam);
				l.setPrice(newPrice);
				l.setEmail(newEmail);
				l.setPass(newPass);
				
				int res2=lop.updateLaptop(l);
				
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
				
				int res3=lop.deleteLaptop(id);
				
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
				
				int res4=lop.login(email, pass);
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

