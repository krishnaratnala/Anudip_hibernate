package co.vinod.mait.programs;
import org.hibernate.Session;

import co.vinod.mait.entity.Book;
import co.vinod.mait.util.HibernateUtil;

public class P01_GetOnePerson {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();

		int id = 101;
		Book p1 = (Book) session.get(Book.class, id);

		if (p1 == null) {
			System.out.println("No data found!");
		} else {
			System.out.println("Name  = " + p1.getBookName() + " "
					+ p1.getAuthorName());
			System.out.println("Phone = " + p1.getPrice());
			System.out.println("Email = " + p1.getPublishDate());
		}

	}

}
