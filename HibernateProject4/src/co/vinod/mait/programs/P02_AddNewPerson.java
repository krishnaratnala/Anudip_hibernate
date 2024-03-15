package co.vinod.mait.programs;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import co.vinod.mait.entity.Book;
import co.vinod.mait.util.HibernateUtil;
import co.vinod.mait.util.KeyboardUtil;

public class P02_AddNewPerson {

	public static void main(String[] args) {

		int id;
		String bookName,authorName,price,publishDate;

		id = KeyboardUtil.getInt("Enter id: ");
		bookName = KeyboardUtil.getString("Enter Bookname: ");
		authorName = KeyboardUtil.getString("Enter Author name: ");
		price = KeyboardUtil.getString("Enter price: ");
		publishDate = KeyboardUtil.getString("Enter PublishDate: ");

		Book p1 = new Book(id,bookName,authorName,price,publishDate);
		
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(p1);
			tx.commit();
			System.out.println("Data saved to db.");
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println("There was an error while trying to save data.");
			System.out.println(e.getMessage());
		}
		
		session.close();
		

	}
}
