package objects;

// class
public class Invoice {
	
	// instance variable
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	// constructor method
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPrice(price);
	}
	
	// setters and getters
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0)
			quantity = 0;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0)
			price = 0.00;
		this.price = price;
	}
	
	// to string method
	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	// utility method
	public Double getInvoiceAmount(int quantity, double price) {
		return (double) quantity * price;
	}
	
}
