public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String zipcode;

    public Person(String firstName, String lastName, String streetAddress, String city, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipcode = zipcode;
    }

    public void PrintDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zipcode: " + zipcode);
    }
}
