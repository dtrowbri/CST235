/*
 * Author: Donald Trowbridge
 * Date: 11/13/2020
 * Class: CST235-O500
 * Statement: This work is my own.
 */

package beans;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="User")
@ViewScoped
public class User{

	protected String firstName, lastName;
	
	public User() {
		firstName = "Donald";
		lastName = "Trowbridge";
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() { 
		return this.lastName;
	}
	
	public void setFirstName(String firstname) {
		firstName = firstname;
	}
	
	public void setLastName(String lastname) {
		lastName = lastname;
	}
}
