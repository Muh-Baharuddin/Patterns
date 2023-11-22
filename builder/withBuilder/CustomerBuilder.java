package builder.withBuilder;

public class CustomerBuilder {
  private String id;
  private String firstName;

  // default value
  private String latsName = "";
  private String email = "";
  private String phone = "";
  private String address = "";
  private int age = 0;
  
  // field baru
  private String hobby = "";

  // setter
  public CustomerBuilder setId(String id) {
    this.id = id;
    return this;
  }
  public CustomerBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  public CustomerBuilder setLatsName(String latsName) {
    this.latsName = latsName;
    return this;
  }
  public CustomerBuilder setEmail(String email) {
    this.email = email;
    return this;
  }
  public CustomerBuilder setPhone(String phone) {
    this.phone = phone;
    return this;
  }
  public CustomerBuilder setAddress(String address) {
    this.address = address;
    return this;
  }
  public CustomerBuilder setAge(int age) {
    this.age = age;
    return this;
  }
  public CustomerBuilder setHobby(String hobby) {
    this.hobby = hobby;
    return this;
  } 

  // create method build
  public Customer build() {
    return new Customer(
      this.id, 
      this.firstName, 
      this.latsName, 
      this.email, 
      this.phone, 
      this.address, 
      this.age,
      this.hobby
    );
  }
}
