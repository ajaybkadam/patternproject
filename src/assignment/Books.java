package assignment;

public class Books {

	int id ;
	private String name;
	private String author;
	private String catagory;
	private float price;
	private int pubyear;
	

	public Books(int id, String name, String author, String catagory, float price, int pubyear) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.catagory = catagory;
		this.price = price;
		this.pubyear = pubyear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPubyear() {
		return pubyear;
	}

	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}


	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", catagory=" + catagory + ", price="
				+ price + ", pubyear=" + pubyear + "]";
	}
	
	

		
	}


