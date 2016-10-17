package lib_1;

public class book  {
	private String ISBN;
	private String title;
	private String authorid;
	private String publisher;
	private String publishdate;
	private String price;
	public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
	public void settitle(String title) {
        this.title = title;
    }
	public void setauthorid(String authorid) {
        this.authorid = authorid;
    }
	public void setpublisher(String publisher) {
        this.publisher = publisher;
    }
	public void publishdate(String publishdate) {
        this.publishdate = publishdate;
    }
	public void price(String price) {
        this.price = price;
    }
	public String getISBN()
	{
		return ISBN;
	}
	public String gettitle()
	{
		return title;
	}
	public String authorid()
	{
		return authorid;
	}
	public String publisher()
	{
		return publisher;
	}
	public String publishdate()
	{
		return publishdate;
	}
	public String price()
	{
		return price;
	}
	public book(String ISBN,String title,String authorid,String publisher,String publishdate,String price)
	{
		this.ISBN=ISBN;
		this.title=title;
		this.authorid=authorid;
		this.publisher=publisher;
		this.publishdate=publishdate;
		this.price=price;
	}
}
