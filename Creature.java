package lab4;
import java.util.Objects;
public class Creature {
	private String name;
	private int age;
	private Place location;
	private Facts fact;
	private boolean wantToAdmire;
    public Creature(){
        name = "Безымянный";
		age = 10;	
    }
	public Creature(String name){
        this.name = name;
		age = 10;
    }
	public Creature(String name, int age){
         this.name = name;
		 this.age = age;
    }
	public boolean getWantToAdmire() { 
		return wantToAdmire; 
	}
	public void setWantToAdmire(boolean wantToAdmire) { 
		this.wantToAdmire = wantToAdmire;
	}
	public Place getLocation() { 
		return location; 
	}
	public void setLocation(Place location) { 
		this.location = location;
		System.out.println(getName() + " находится на территории " + location.getInformation() + ".");
	}
	public Facts getFact() { 
		return fact; 
	}
	public String showFact() { 
		return fact.getThesis(); 
	}
	public void setFact(String object1, String object2, String relation) { 
		fact = new Facts(object1, object2, relation);
	}
	public void setFact(Entity object1, Entity object2, String relation) { 
		fact = new Facts(object1, object2, relation);
	}
    public String getName() { 
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge () {
		return age;
	}
	public String sit() {
		String s = getName() + " сидит";
		return s;
	}
	public String realizeRelation() {
		String s = getName() + " понимает, что " + getFact();
		return s;
	}
	public String eat(FoodAndDrinks food) {
		String s = getName() + " ест " + food.getInformation() + " " + this.getLocation().getSpecificPlace();
		return s;
	}
	public String drink(FoodAndDrinks drink) {
		String s = getName() + " пьет " + drink.getInformation() + " " + this.getLocation().getSpecificPlace();
		return s;
	}
	public String say(String line) {
		String s = getName() + " сказал " + line;
		return s;
	}
	public int hashCode() {
		int r = Objects.hashCode(getName());
		return r;
	}
	public boolean equals(Object hero1) {
		if (hero1 == this) {
			return true;
		}
		if (hero1 == null || getClass() != hero1.getClass()) {
			return false;
		}
		Creature hero2 = (Creature) hero1;
		return getName() == hero2.getName();
	}
	public String toString() {
		return getName();
	}
	public String admire(String object) {
		String s = getName() + " любуется тем, что " + object;
		return s;
	}
	public String disregard(String object) {
		String s = getName() + " не обращает никакого внимания на то, что " + object;
		return s;
	}
}