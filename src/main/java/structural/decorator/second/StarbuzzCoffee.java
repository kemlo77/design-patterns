package structural.decorator.second;

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage1 = new Espresso();
    beverage1 = new SteamedMilk(beverage1);
    printBeverage(beverage1);


    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    printBeverage(beverage2);

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    printBeverage(beverage3);

  }

  private static void printBeverage(Beverage beverage1) {
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
  }


}
