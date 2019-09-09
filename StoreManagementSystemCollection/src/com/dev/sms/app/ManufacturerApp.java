package com.dev.sms.app;

import java.util.Scanner;
import com.dev.sms.beans.Dealer;
import com.dev.sms.services.ManufacturerServices;
import com.dev.sms.services.ManufacturerServicesImpl;

public class ManufacturerApp {
	public static void main(String[] args) {
		ManufacturerServices services = new ManufacturerServicesImpl();
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("1. Add Dealer");
			System.out.println("2. Delete Dealer");
			System.out.println("3. Update Dealer");
			System.out.println("4. Search Dealer");
			System.out.println("5. Add Product");
			System.out.println("6. Delete Product");
			System.out.println("7. Update Product");
			System.out.println("8. Search Product");
			System.out.println("9. Update Manufacture Details");
			System.out.println("10 Delete Manufacture");
			
			System.out.println("Enter your choice");
			
			int choice = Integer.parseInt(in.nextLine());
			
			Dealer dealer = new Dealer();
			switch(choice)
			{

			case 1:
				System.out.println("Enter Dealer ID");
				int dealerId = in.nextInt();
				dealer.setDealerId(dealerId);

				System.out.println("Enter Dealer Name");
				String name = in.next();
				dealer.setDealerName(name);
				
				System.out.println("Enter Dealer Password");
				String password = in.next();
				dealer.setPassword(password);
				
				System.out.println("Enter Dealer Address");
				String address = in.next();
				dealer.setAddress(address);
				
				System.out.println("Enter Dealer Contact Number");
				int number = in.nextInt();
				dealer.setPhoneNumber(number);
				
				System.out.println("Enter Dealer Email");
				String email = in.next();
				dealer.setEmail(email);

				Dealer result = services.addDealer(dealer.getDealerId(), dealer);
				if(result != null)
				{
					System.out.println("Dealer added successfully");
				}
				else {
					System.out.println("Dealer not added succesfully");
				}
				break;
				
				
			case 2: 
				System.out.println("Enter Dealer Id to delete");
				int dealerId1 = in.nextInt();
				boolean result1 = services.deleteDealer(dealerId1);
				if(result1)
				{
					System.out.println("Dealer deleted successfully");
				}
				else {
					System.out.println("Dealer not deleted successfully");
				}
				break;
				
				
			case 3:
				System.out.println("Enter Dealer ID");
				int dealerId2 = in.nextInt();
				dealer.setDealerId(dealerId2);

				System.out.println("Enter Dealer Name to be Updated");
				String name1 = in.next();
				dealer.setDealerName(name1);
				
				System.out.println("Enter Dealer Password to be Updated");
				String password1 = in.next();
				dealer.setPassword(password1);
				
				System.out.println("Enter Dealer Address to be Updated");
				String address1 = in.next();
				dealer.setAddress(address1);
				
				System.out.println("Enter Dealer Contact Number to be Updated");
				int number1 = in.nextInt();
				dealer.setPhoneNumber(number1);
				
				System.out.println("Enter Dealer Email to be Updated");
				String email1 = in.next();
				dealer.setEmail(email1);

				Dealer result3 = services.updateDealer(dealer.getDealerId(), dealer);
				if(result3!=null)
				{
					System.out.println("Dealer updated successfully");
					System.out.println(result3);
				}
				else {
					System.out.println("Dealer updation failed");
				}
				break;
				
				
			case 4:
				System.out.println("Enter Dealer Id to search");
				int dealerId3 = in.nextInt();
				boolean dealer1 = services.searchDealer(dealerId3);
				if(dealer1)
				{
					System.out.println("Dealer Found");
					System.out.println(dealer1);
				}
				else {
					System.out.println("Dealer details not found");
				}
				
				break;
				
				default: System.out.println("Invalid choice");

		}
	}	while(true);
	}
}
