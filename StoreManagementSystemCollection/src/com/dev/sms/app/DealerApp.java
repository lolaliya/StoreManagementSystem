package com.dev.sms.app;

import java.util.Scanner;

import com.dev.sms.beans.Orders;
import com.dev.sms.services.DealerServices;
import com.dev.sms.services.DealerServicesImpl;

public class DealerApp {
	public static void main(String[] args) {
		DealerServices services = new DealerServicesImpl();
		boolean state;
		int choice;

		while(true) {
			System.out.println("1. Add Orders");
			System.out.println("2. Delete Orders");
			System.out.println("3. Update Order Price");
			System.out.println("4. Update Order Quantity");
			System.out.println("5. Search Order");
			System.out.println("********************");
			System.out.println("Enter your choice: ");

			Scanner sc = new Scanner(System.in);
			choice = Integer.parseInt(sc.nextLine());

			switch(choice) {

			case 1 : 
				System.out.println("Enter Order id: ");
				int orderId = Integer.parseInt(sc.next());
				System.out.println("Enter Order price: ");
				float orderPrice = Float.parseFloat(sc.next());
				System.out.println("Enter Order quantity: ");
				int orderQuantity = Integer.parseInt(sc.next());

				Orders order = new Orders();
				order.setOrderId(orderId);
				order.setOrderPrice(orderPrice);
				order.setOrderQuantiy(orderQuantity);
				Orders order1 = services.addOrder(orderId, order);
				if(order1 != null) {
					System.out.println("Order added successfully");
				}else {
					System.out.println("Order not added");
				}
				break;

			case 2 :
				System.out.println("Enter Order id: ");
				int orderId1 = Integer.parseInt(sc.next()); 
				state = services.removeOrder(orderId1);
				if(state) {
					System.out.println("Order deleted successfully");
				}else {
					System.out.println("Order not deleted");
				}
				break;

			case 3 : 
				System.out.println("Enter Order id: ");
				int orderId2 = Integer.parseInt(sc.next()); 
				Orders order2 = services.searchOrder(orderId2);
				System.out.println(order2);
				System.out.println("Enter Old Order price: ");
				float oldOrderPrice = Float.parseFloat(sc.next());
				System.out.println("Enter New Order price: ");
				float newOrderPrice = Float.parseFloat(sc.next());

				state = services.updateOrderPrice(orderId2, oldOrderPrice, newOrderPrice);
				if(state) {
					System.out.println("Order price modification done");
					System.out.println(services.searchOrder(orderId2));
				}else {
					System.out.println("Order price modification not done");
				}
				break;

			case 4 :
				System.out.println("Enter Order id: ");
				int orderId3 = Integer.parseInt(sc.next()); 
				Orders order3 = services.searchOrder(orderId3);
				System.out.println(order3);
				System.out.println("Enter Old Order quantity: ");
				int oldOrderQuantity= Integer.parseInt(sc.next());
				System.out.println("Enter New Order quantity: ");
				int newOrderQuantity = Integer.parseInt(sc.next());

				state = services.updateOrderQuantity(orderId3, oldOrderQuantity, newOrderQuantity);
				System.out.println(state);
				if(state) {
					System.out.println("Order modification done");
					System.out.println(services.searchOrder(orderId3));
				}else {
					System.out.println("Order modification not done");
				}
				break;

			case 5 : 
				System.out.println("Enter Order id: ");
				int orderId4 = Integer.parseInt(sc.next());
				Orders order4 = services.searchOrder(orderId4);
				if(order4 != null) {
					System.out.println("Search successful");
					System.out.println(services.searchOrder(orderId4));
				}else {
					System.out.println("Search failed");
				}
				sc.close();
				break;

			default : System.out.println("Invalid Option!!!");
			}
		}
	}
}


