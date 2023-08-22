package hibernatepack2;
import javax.persistence.*;

@Entity
@Table(name="proddemo")
public class Product {
	
	@Id @GeneratedValue(generator = "increment")
	private int pcode;
	
	@Column(name="prodname")	
	private String pname;
	
	@Column(name="prodrate")
	private int prate;

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrate() {
		return prate;
	}

	public void setPrate(int prate) {
		this.prate = prate;
	}

	
	
	
	
}
