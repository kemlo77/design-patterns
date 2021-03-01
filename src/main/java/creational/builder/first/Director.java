package creational.builder.first;

public class Director {

  Builder builder;

  public void construct(Builder builder) {
    this.builder = builder;
    this.builder.startUpOperations();
    this.builder.buildBody();
    this.builder.insertWheels();
    this.builder.addHeadlights();
    this.builder.endOperations();
  }

}
