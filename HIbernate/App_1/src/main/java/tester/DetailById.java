package tester;

import java.util.Scanner;
import static utils.HibernateUtils.getFactory;
import org.hibernate.SessionFactory;

import DAL.CustomerOperations;
import pojo.Customer;

public class DetailById {

	public static void main(String[] args) {
		
		try(SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)){
		CustomerOperations co = new CustomerOperations();
		System.out.println("Enter ID : ");
		Customer c = co.getById(sc.nextLong());
		if(c == null) {
			System.out.println("NO USER FOUND");
		}
		else
		System.out.println(c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
