package co.vinod.mait.programs;

import org.hibernate.Session;

import co.vinod.mait.entity.Book;
import co.vinod.mait.util.HibernateUtil;
import co.vinod.mait.util.KeyboardUtil;

public class P04_UpdatePersonData {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		int id = KeyboardUtil.getInt("Enter id: ");
		session.beginTransaction();
		Book p1 = (Book) session.get(Book.class, id);

		if (p1 == null) {
			System.out.println("No data found!");
		} else {
			String input;

			input = KeyboardUtil.getString("First name : (" + p1.getBookName() + ") ");
			if (!input.equals("")) {
				p1.setBookName(input);
			}

			input = KeyboardUtil.getString("Last name : (" + p1.getAuthorName() + ") ");
			if (!input.equals("")) {
				p1.setAuthorName(input);
			}

			input = KeyboardUtil.getString("Phone : (" + p1.getPrice() + ") ");
			if (!input.equals("")) {
				p1.setPrice(input);
			}

			input = KeyboardUtil.getString("Email : (" + p1.getPublishDate() + ") ");
			if (!input.equals("")) {
				p1.setPublishDate(input);
			}

			session.getTransaction().commit();
			System.out.println("Data updated back to the db.");

		}

	}
}
