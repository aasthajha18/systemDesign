package systemDesign.Builder.mealBuilder;

public class VegFoodConcereteBuilder implements FoodBuilder {

    private Food food;

    public VegFoodConcereteBuilder() {
        this.food = new Food();
    }

    @Override
    public void buildMainCourse() {
        food.setMainCouse("Veg Main course");
    }

    @Override
    public void buildSideDish() {
        food.setSideDish("Veg Side Dish");
    }

    @Override
    public Food getFood() {
        return food;
    }

}
