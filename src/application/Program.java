package application;

import java.util.Date;

import model.entities.*;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "uyds@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(obj);

		System.out.println(seller);
		
	}

}
