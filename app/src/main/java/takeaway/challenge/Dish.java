package takeaway.challenge;

public class Dish {

  private String name;
  private Double price;

  public Dish(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

}