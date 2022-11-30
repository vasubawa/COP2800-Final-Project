package AddressBook;
/*
 * EXAMPLE OF HOW ITS IN HERE:
 * public class Restaurant {                          // Info about a restaurant
   private String name;
   private int rating;

   public void setName(String restaurantName) {    // Sets the restaurant's name
	  name = restaurantName;
   }

   public void setRating(int userRating) {         // Sets the rating (1-5, with 5 best)
	  rating = userRating;
   }

   public void print() {                           // Prints name and rating on one line
	  System.out.println(name + " -- " + rating);
   }
}
 */
public class Person {

	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private String streetAddress;
	private String city;
	private String state;
	private int zipcode;
	//private String id;

	// Default Constructor
	public Person(/*user inputs here later*/) {
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.email = "Unknown";
		this.phoneNumber = -1;
		this.streetAddress = "Unknown";
		this.city = "Unknown";
		this.state = "Unknown";
		this.zipcode = -1;
		//this.id = "Unknown";
	}
	
	
}
