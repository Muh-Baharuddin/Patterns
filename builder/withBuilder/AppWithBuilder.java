package builder.withBuilder;

public class AppWithBuilder {
  public static void main(String[] args) {
    Customer customer1 = new CustomerBuilder()
      .setFirstName("dean")
      .setAge(21)
      .setAddress("jakarta")
      .build();

    System.out.println("customer1 " + customer1);

    Customer customer2 = new CustomerBuilder()
      .setFirstName("raka")
      .setEmail("raka@example.com")
      .setAddress("bandung")
      .setHobby("reading")
      .build();

    System.out.println("customer2 " + customer2);
  }
}
