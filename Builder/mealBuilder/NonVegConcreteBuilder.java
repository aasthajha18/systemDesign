package systemDesign.Builder.mealBuilder;

public class NonVegConcreteBuilder implements FoodBuilder {

    private Food food;

    public NonVegConcreteBuilder() {
        this.food = new Food();
    }

    @Override
    public void buildMainCourse() {
        food.setMainCouse("Non Veg Main Course");
    }

    @Override
    public void buildSideDish() {
        food.setSideDish("Non Veg Side Dish");
    }

    @Override
    public Food getFood() {
        return food;
    }

}
