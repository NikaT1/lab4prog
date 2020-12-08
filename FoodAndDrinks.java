package lab4;
public class FoodAndDrinks extends Entity{
	private String maker;
	public FoodAndDrinks(String name) {
		super(name);
		maker = "неизвестный производитель";
	}
	public FoodAndDrinks(String name, String maker) {
		super(name);
		this.maker = maker;
	}
	public String getInformation() {
		return getName() + " (производитель: " + maker + ")";
	}
}