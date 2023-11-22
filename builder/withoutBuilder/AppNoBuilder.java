package builder.withoutBuilder;

public class AppNoBuilder {

  public static void main(String[] args) {
    CustomerNoBuilder customerNoBuilder1 = new CustomerNoBuilder("1", "dean", "kurnia", "dean@gmail.com", "0851", "jakarta", 20);

    CustomerNoBuilder customerNoBuilder2 = new CustomerNoBuilder("2", "dodi", "limbong", "dodi@gmail.com", "0853", "bandung", 32);

    System.out.println("customerNoBuilder1 " + customerNoBuilder1);
    System.out.println("customerNoBuilder2 " + customerNoBuilder2);
  }
}
