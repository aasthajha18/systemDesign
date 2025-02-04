package systemDesign.Builder.mealBuilder;

public class Main {
    public static void main(String[] args) {

        FoodBuilder foodBuilder = new VegFoodConcereteBuilder();
        FoodDirector foodDirector = new FoodDirector(foodBuilder);
        Food food = foodDirector.createFood();
        System.out.println(food);

        FoodBuilder nonvegBuilder = new NonVegConcreteBuilder();
        FoodDirector nonDirector = new FoodDirector(nonvegBuilder);
        Food nonVegFood = nonDirector.createFood();
        System.out.println(nonVegFood);
    }
}
