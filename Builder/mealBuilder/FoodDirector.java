package systemDesign.Builder.mealBuilder;

public class FoodDirector {

    private FoodBuilder foodBuilder;

    public FoodDirector(FoodBuilder foodBuilder) {
        this.foodBuilder = foodBuilder;
    }

    public Food createFood() {
        foodBuilder.buildMainCourse();
        foodBuilder.buildSideDish();
        return foodBuilder.getFood();
    }
}
