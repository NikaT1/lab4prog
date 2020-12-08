package lab4;
import java.util.ArrayList;
public class House extends Entity{
	private String name;
	private ArrayList<Things> things = new ArrayList<>(); 
	protected TypeOfHouse typeOfHouse;
	private String viewAround;
    public House(String name) {
		this.name = name;
		if (name == "дом Карлсона") {
			typeOfHouse = TypeOfHouse.SPECIAL;
		} else {
			typeOfHouse = TypeOfHouse.ORDINARY;
		}
    }
	public String getInformation() {
		String s = name + " (тип: " + typeOfHouse.getType() + ")" ;
		return s;
	}
    public String getName() {
		return name;
	}
	public Things getThings(int index) {
		return things.get(index);
	}
	public void showDescriptionOfThings(int index) {
		System.out.println("В таком доме, как " + House.this.getName() + ", " + things.get(index).getInformation() + "(" + House.this.typeOfHouse.getType() + ").");
	}
	public void addThings(Things things) {
		this.things.add(things);
		System.out.println("В дом добавлено: " + things.getName() + ".");
	}
	public void setViewAround(String viewAround) {
		this.viewAround = viewAround;
	}
	public void showViewAround() {
		System.out.println("В таком доме, как " + House.this.getName() + ", " + viewAround + " вид вокруг (" + House.this.typeOfHouse.getType() + ").");
	}
	public class Walls {
		private String name;
		private ArrayList<Things> thingsOnTheWalls = new ArrayList<>(); 
        public Walls(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void hangOnTheWalls(int index, int number, TypeOfReason typeOfReason) throws NotEnoughThingsException {
			if (number <= House.this.getThings(index).getNumber()) {
				Things thing = new Things(House.this.getThings(index).getType(), House.this.getThings(index).getCollector(), number, House.this.getThings(index).getDescriptionOfThings());
				thingsOnTheWalls.add(thing);
				System.out.println("В таком доме, как " + House.this.getName() + ", чтобы " + typeOfReason.getType() + " на " + name + " повешены " + thing.getInformation() +  ".");
			} else {
				throw new NotEnoughThingsException("В доме " + number +" вещей, чтобы повесить их на стену");
			}
		}
    }
	public class Porch {
		private String name;
        public Porch(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void getInformation() {
			System.out.println("В таком доме, как " + House.this.getName() + ", есть " + name + " (" + House.this.typeOfHouse.getType() + ").");
		}
    }
    public class Floor {
		private String name;
        public Floor(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
    }
    public class Room {
		private String name;
		private String characteristic;
        public Room(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setCharacteristics(String s) {
			characteristic = s;
		}
		public void getInformation() {
			System.out.println("В таком доме, как " + House.this.getName() + ", " + characteristic + " " + name + " (" + House.this.typeOfHouse.getType() + ").");
		}
    }
	public class Roof {
		private String name;
        public Roof(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
    }
}