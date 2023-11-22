package builder.withoutBuilder;

public class CustomerNoBuilder {

  private String id;
  private String firstName;
  private String latsName;
  private String email;
  private String phone;
  private String address;
  private int age;

  public CustomerNoBuilder(String id, String firstName, String latsName, String email, String phone, String address, int age) {
    this.id = id;
    this.firstName = firstName;
    this.latsName = latsName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLatsName() {
    return latsName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  public int getAge() {
    return age;
  }
}
