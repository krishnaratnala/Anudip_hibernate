package co.vinod.mait.entity;

public class Book {

	private int id;
	private String BookName;
	private String AuthorName;
	private String price;
	private String PublishDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public Book(int id, String bookName, String authorName, String price, String publishDate) {
		super();
		this.id = id;
		BookName = bookName;
		AuthorName = authorName;
		this.price = price;
		PublishDate = publishDate;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", price=" + price
				+ ", PublishDate=" + PublishDate + "]";
	}
	
	
	
}