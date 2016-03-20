package dz_1_5;

public class phone {
	private String contact;
	private long number;
	private Operator b;

	public phone(String contact, long number, Operator b) {
		super();
		this.contact = contact;
		this.number = (long) number;
		this.b = b;
	}

	public phone(String contact, long number) {
		this.contact = contact;
		this.number = (long) number;
	}
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public long getNumber() {
		return number;
	}
	
	public Operator getB() {
		return b;
	}

	public void registr(Operator b) {
		this.b = b;
		
	}

	public void calling (phone a){
		try {
		if (b.getContactList().contains(a.getNumber()) && b.getContactList().contains(this.getNumber())) System.out.println(this.getContact()+" calling to "+a.getContact()); 
		else System.out.println("This number is not valid");
		} catch(Exception e) { System.out.println("Сначала зарегестрируйтесь в сети");
		}
		
	}
}
