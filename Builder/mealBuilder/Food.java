package systemDesign.Builder.mealBuilder;

public class Food {
    String mainCourse;
    String sideDish;

    public void setMainCouse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String toString() {
        return "MainCourse :: " + this.mainCourse + "Side Dish::" + this.sideDish;
    }
}
