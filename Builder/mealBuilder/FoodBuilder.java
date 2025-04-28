package systemDesign.Builder.mealBuilder;

public interface FoodBuilder {
    void buildMainCourse();

    void buildSideDish();

    Food getFood();
}
