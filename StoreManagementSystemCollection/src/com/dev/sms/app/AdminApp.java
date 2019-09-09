package com.dev.sms.app;
import java.util.Scanner;

import com.dev.sms.beans.Manufacturer;
import com.dev.sms.services.AdminServices;
import com.dev.sms.services.AdminServicesImpl;
import com.dev.sms.services.LoginServices;
import com.dev.sms.services.LoginServicesImpl;

public class AdminApp {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome to Stores Management System");
		System.out.println("***************************************************");
		System.out.println("Enter the Login id");
		int id = s.nextInt();
		System.out.println("Enter the Password");
		String pass = s.next();
		LoginServices service = new LoginServicesImpl();
		boolean state = service.login(id , pass);
		if(state)
		{
			System.out.println("Welcome Admin");
		}
		else
		{
			System.out.println("Admin Login Failed");
		}
		
		while(state)
		{
			Scanner sc = new Scanner(System.in);
			AdminServices services = new AdminServicesImpl();
			System.out.println("1. Create Manufacturer");
			System.out.println("2. Delete Manufacturer");
			System.out.println("3. Search Manufacturer");
			System.out.println("4. Modify Manufacturer Name");
			System.out.println("5. Modify Manufacturer password");
			System.out.println("6. Modify Manufacturer address");
			System.out.println("7. Modify Manufacturer phone number");
			System.out.println("8. Logout");
			System.out.println("Enter choice");
			int choice = sc.nextInt();	
			switch(choice) {
			case 1: 
				Manufacturer manufacturer = new Manufacturer();
				System.out.println("Enter Manufacturer id :");
				int manufacturerId = sc.nextInt();
				manufacturer.setId(manufacturerId);

				System.out.println("Enter Manufacturer Name");
				String manufacturerName = sc.next();
				manufacturer.setName(manufacturerName);

				System.out.println("Enter Password");
				String password = sc.next();
				manufacturer.setPassword(password);

				System.out.println("Enter Street Address");
				String address = sc.next();
				manufacturer.setAddress(address);

				System.out.println("Enter phoneNumber"); 
				String phoneNumber = sc.next();
				manufacturer.setPhoneNumber(Long.parseLong(phoneNumber));

				System.out.println("Enter Email");
				String email = sc.next();
				manufacturer.setEmail(email);
				services.addManufacturer(manufacturer.getId(), manufacturer);
				System.out.println("***************************************************");
				break;
			case 2:
				System.out.println("enter ManufacturerId to delete");
				int id1 = sc.nextInt();
				boolean s1=services.deleteManufacturer(id1);
				if(s1)
				{
					System.out.println("Deletion Successful:"+id1);
				
				}else
					{
					System.out.println("Deletion Failed");
					}
				System.out.println("***************************************************");
				break;
					
			case 3: 
				System.out.println("Enter ManufacturerId to Search ");
				int Id2 = sc.nextInt();
				services.searchManufacturer(Id2);
				System.out.println("***************************************************");
				break;
			case 4: 
				System.out.println("Enter Manufacturer ID to modify");
				int Id3 = sc.nextInt();
				Manufacturer manufacturer1  = services.searchManufacturer(Id3);

				System.out.println("Enter new Name");
				String newName = sc.next();
				manufacturer1.setName(newName);
				services.searchManufacturer(Id3);

				break;
			case 5:
				System.out.println("Enter Manufacturer ID to modify");
				int Id4 = sc.nextInt();
				Manufacturer manufacturer3 = services.searchManufacturer(Id4);

				System.out.println("enter new password");
				String password1 = sc.next(); 
				manufacturer3.setPassword(password1);
				services.searchManufacturer(Id4);
				break;

			case 6: 
				System.out.println("Enter Manufacturer ID to modify");
				int Id5 = sc.nextInt();
				Manufacturer manufacturer4 = services.searchManufacturer(Id5);
				System.out.println("Enter new address");
				String newAddress = sc.next();
				manufacturer4.setAddress(newAddress);
				services.searchManufacturer(Id5);
				break;

			case 7:
				System.out.println("Enter Manufacturer ID to modify");
				int Id6 = sc.nextInt();
				Manufacturer manufacturer5 = services.searchManufacturer(Id6);
				System.out.println("Enter new Phone number");
				long newPhoneNumber = sc.nextLong();
				manufacturer5.setPhoneNumber(newPhoneNumber);
				services.searchManufacturer(Id6);
				break;

			case 8: System.exit(0); 

			default: System.out.println("Enter correct Input");
			}
		}
	}
	}
