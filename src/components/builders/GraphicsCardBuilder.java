//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components.builders;

import components.GraphicsCard;

public class GraphicsCardBuilder {
  private String model;
  private int memoryGB;
  private double price;

  public GraphicsCardBuilder(String model, int memoryGB, double price) {
    this.model = model;
    this.memoryGB = memoryGB;
    this.price = price;
  }

  public GraphicsCardBuilder memoryGB(int memoryGB) {
    this.memoryGB = memoryGB;
    return this;
  }

  public GraphicsCardBuilder(String model) {
    this.model = model;
  }

  public GraphicsCardBuilder price(double price) {
    this.price = price;
    return this;
  }

  public GraphicsCard build() {
    if (this.model != null && !this.model.isEmpty()) {
      return new GraphicsCard(this.model, this.memoryGB, this.price);
    } else {
      throw new RuntimeException("Model is a required field and cannot be null or empty");
    }
  }
}
