

public class Main{
    static Bottle bottle = new Bottle(200,"Plastic","Coca-Cola","Black"); //Food Dishes
    static Container container = new Container(500,"Plastic","Grey"); // Dishes
    static ContainerCap containerCap = new ContainerCap(750,"Plastic","Blue"); // Dishes
    static Cup cup = new Cup(300,"Ceramic","Red"); // Dishes
    static Milk milk = new Milk(150,"Paper","Domik v Derevne","Grey"); //Food dishes
    static Pot pot = new Pot(1000,"Iron","Black"); // Dishes

    public static void main(String[] args){
        String formForDishes = "Material: %s, weight in grams: %s, Color is: %s, ";
        String formForFoodDishes = "Material: %s, weight in grams: %s, Company: %s, Color is: %s ";
        System.out.println("Bottle");
        System.out.println(String.format(formForFoodDishes, bottle.material, bottle.weight, bottle.company, bottle.color) + String.format("Print on the bottle: %s",bottle.printOnBottle));
        System.out.println("Container");
        System.out.println(String.format(formForDishes, container.material, container.weight, container.color) + String.format("This container %s", container.withCapOrNot));
        System.out.println("Container with Cap");
        System.out.println(String.format(formForDishes, containerCap.material, containerCap.weight, containerCap.color) + String.format("This container %s",containerCap.withCapOrNot));
        System.out.println("Cup");
        System.out.println(String.format(formForDishes, cup.material, cup.weight, cup.color) + String.format("This cup has print: %s", cup.printOnCup));
        System.out.println("Milk Pocket");
        System.out.println(String.format(formForFoodDishes, milk.material, milk.weight, milk.company, milk.color) + String.format("This milk has precent of fat: ", milk.percent));
        System.out.println("Pot");
        System.out.println(String.format(formForDishes, pot.material, pot.weight, pot.color) + String.format("This pot %s", pot.lidOrNot));   
      }
}