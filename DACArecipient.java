/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
			DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOf Origin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char

+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void 
+ setUscisNumber(uscisNumber : String)  : void 
+ setCountryOf Origin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex( sex : char) : void

+selAll(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String,
 birthday : int, validFromDate : int, expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	//if you put static in the beginning every daca recepient would have the same surname 

	public String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;



	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	
	//+ getSurname() : String

	public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getUscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public int getBirthday(){
		return this.birthday;
	}
	public int getValidFromDate(){
		return this.validFromDate;
	}
	public int getExpirationDate(){
		return this.expirationDate;
	}
	public char getSex(){
		return this.sex;
	}


	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.

	//+ getSurname (surname : String) : void
		public void setSurname(String surname)
	{
		this.surname = surname;
	}
		public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}
		public void setUscisNumber(String UscisNumber)
	{
		this.uscisNumber = UscisNumber;
	}
		public void setCountryOfOrigin(String CountryOfOrigin)
	{
		this.countryOfOrigin = CountryOfOrigin;
	}
		public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
		public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
		public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
		public void setSex(char sex)
	{
		this.sex = sex;
	}
	
	//TODO: Write the setAll method. Remember to include documentation.

	public void setAll(String surname,  String givenName, String uscisNumber, String countryOfOrigin, 
						int birthday, int validFromDate, int expirationDate, char sex) {
							this.setSurname(surname);
							this.setGivenName(givenName);
							this.setUscisNumber(uscisNumber);
							this.setCountryOfOrigin(countryOfOrigin);
							this.setBirthday(birthday);
							this.setValidFromDate(validFromDate);
							this.setExpirationDate(expirationDate);
							this.setSex(sex);
							
						}
}