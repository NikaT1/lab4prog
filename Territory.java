package lab4;
import java.util.Objects;
import java.util.ArrayList;
public class Territory implements Describable{
	private String name;
	private Area type;
	private Sky sky;
	private Twilight twilight;
	private ArrayList<WaterObject> waterObjects = new ArrayList<>();
	private Creature hero1;
	private Creature hero2;
	public Territory () {
		name = "Безымянный";
		type = Area.CITY;
		sky = new Sky(type, name);
	}
	public Territory (Area type, String name, Creature hero1, Creature hero2) {
		this.type = type;
		this.name = name;
		this.hero1 = hero1;
		this.hero2 = hero2;
		sky = new Sky(type, name);
		twilight = new Twilight(type, name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getInformation() {
		return type.getArea() + " " + name;
	}
	public void addWaterObject (TypeOfWaterObject type) {
		WaterObject object = new WaterObject(type, this.type, name);
		waterObjects.add(object);
	}
	public WaterObject getWaterObject (int index) {
		WaterObject object;
		if (index < waterObjects.size()) {
			object = waterObjects.get(index);
		} else {
			object = new WaterObject(type, name);
		}
		return object;
	}
	public Sky getSky() {
		return sky;
	}
	public Twilight getTwilight() {
		return twilight;
	}
	public void describeTerritory(Time time) {
		System.out.println("На территории " + type.getArea() + " " + name + " " + time.getTime() + ".");
	}
	public void describeGlow() {
		if (sky.getGlow()) {
			if ((name == "Стокгольм") && (type == Area.CITY)) {
				System.out.println("На территории " + type.getArea() + " " + name + " " + sky.showGlow() + ".");
			} else {
				System.out.println("На территории " + type.getArea() + " " + name + " " + sky.showGlow() + ".");
			} 
		} else {
			System.out.println("На территории " + type.getArea() + " " + name + " " + sky.showGlow() + ".");
		}
	}
	public void describeTwilight() {
		if (twilight.getStartTwilight()) {
			if ((name == "Стокгольм") && (type == Area.CITY)) {
				System.out.println("На территории " + type.getArea() + " " + name + " " + twilight.showTwilight() + ".");
			} else {
				System.out.println("На территории " + type.getArea() + " " + name + " " + twilight.showTwilight() + ".");
			} 
		} else {
			System.out.println("На территории " + type.getArea() + " " + name + " " + twilight.showTwilight() + ".");
		} 
	}
	public int hashCode() {
		int r = Objects.hashCode(getInformation());
		return r;
	}
	public boolean equals(Object territory1) {
		if (territory1 == this) {
			return true;
		}
		if (territory1 == null || getClass() != territory1.getClass()) {
			return false;
		}
		Territory territory2 = (Territory) territory1;
		return getInformation() == territory2.getInformation();
	}
	public String toString() {
		return getInformation();
	}
}