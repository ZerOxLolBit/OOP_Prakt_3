//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components.builders;

import components.Processor;

public class ProcessorBuilder {
  private final String model;
  private String typeClass;
  private double clockSpeed;
  private int cores;
  private double price;

  public ProcessorBuilder(String model) {
    this.model = model;
  }

  public ProcessorBuilder typeClass(String typeClass) {
    this.typeClass = typeClass;
    return this;
  }

  public ProcessorBuilder clockSpeed(double clockSpeed) {
    this.clockSpeed = clockSpeed;
    return this;
  }

  public ProcessorBuilder cores(int cores) {
    this.cores = cores;
    return this;
  }

  public ProcessorBuilder price(double price) {
    this.price = price;
    return this;
  }

  public Processor build() {
    if (this.model != null && !this.model.isEmpty()) {
      return new Processor(this.model, this.typeClass, this.clockSpeed, this.cores, this.price);
    } else {
      throw new RuntimeException("Model is a required field and cannot be null or empty");
    }
  }
}
