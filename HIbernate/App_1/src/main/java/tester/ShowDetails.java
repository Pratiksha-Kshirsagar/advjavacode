package tester;

import org.hibernate.SessionFactory;

import DAL.CustomerOperations;
import pojo.Customer;

import static utils.HibernateUtils.getFactory;

import java.util.List;
public class ShowDetails {

	public static void main(String[] args) {
		List<Customer> list = null;
		try(SessionFactory sf = getFactory()) {
			
			CustomerOperations co = new CustomerOperations();
			 list = co.showDetails();
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
