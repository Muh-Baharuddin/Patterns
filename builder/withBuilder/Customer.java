package builder.withBuilder;

public class Customer {
  private String id;
  private String firstName;
  private String latsName;
  private String email;
  private String phone;
  private String address;
  private int age;

  //menambahkan field baru
  private String hobby;

  public Customer(String id, String firstName, String latsName, String email, String phone, String address, int age, String hobby) {
    this.id = id;
    this.firstName = firstName;
    this.latsName = latsName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.age = age;
    this.hobby = hobby;
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

  public String getHobby() {
    return hobby;
  }
}
