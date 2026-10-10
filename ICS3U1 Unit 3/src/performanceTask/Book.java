package performanceTask;

public class Book {
	
	private String title;
	private String author;
	private int numberOfPages;
	private int publicationYear;
	private String iSBN;
	private double cost;

	public Book(String title, String author, int numberOfPages, int publicationYear, String iSBN, double cost) {
		super();
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publicationYear = publicationYear;
		this.iSBN = iSBN;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages + ", publicationYear="
				+ publicationYear + ", iSBN=" + iSBN + ", cost=" + cost + "]";
	}
	
}
