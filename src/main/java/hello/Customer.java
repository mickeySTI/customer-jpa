package hello;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // table
public class Customer {
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id; // Row
	  private String firstName; // Column
	  private String lastName; // Column

	  protected Customer() {} //JPA requires a default constructor

	  public Customer(String firstName, String lastName) { // Constructor
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }

}
