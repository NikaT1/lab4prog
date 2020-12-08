package lab4;
import java.util.ArrayList;
public class Child extends Creature {
	private ArrayList<Instructions.Permission> permissions = new ArrayList<>();
	private ArrayList<Instructions.Prohibition> prohibitions = new ArrayList<>();
	private ArrayList<Entity> takenItems = new ArrayList<>();
	private ArrayList<Forgettable> forgottenInstructions = new ArrayList<>();
	private Creature mother;
	private Creature father;
	private ArrayList<Habit> habits = new ArrayList<>(); 
	private Heart heart;
	private String previousPlace;
    public Child(){
        super();	
		heart = new Heart();
    }
	public Child(String name){
        super(name);
		heart = new Heart();
    }
	public Child(String name, int age){
        super(name, age);
		heart = new Heart();
    }
	public Heart getHeart(){
		return heart;
	}
	public void setProhibition(Instructions.Prohibition prohibition) {
		prohibitions.add(prohibition);
	}
	public void setPermission(Instructions.Permission permission) {
		permissions.add(permission);
	}
	public Instructions getProhibition(int index) {
		return prohibitions.get(index);
	}
	public class Heart {
		private String name;
		private Heart() {
			name = "Сердце";
		}
		public void skipABeat(String time) {
			System.out.println(name + " екнуло, когда " + time + ".");
		}
		public void notSkipABeat(Entity reason, String time) {
			System.out.println(name + " человека по имени " + Child.this.getName() + " не екнуло, когда " + time + ", так как есть " + reason.getInformation() + ".");
		}
	}
	public void addHabit(Habit habit) {
		habits.add(habit);
		System.out.println("У человека по имени " + getName() + " есть " + habit.getInformation() + ".");
	}
	public Instructions getPermission(int index) {
		return permissions.get(index);
	}
	public void setMother(Creature mother) {
		this.mother = mother;
	}
	public void setFather(Creature father) {
		this.father = father;
	}
	public void sneak(String object) {
		previousPlace = getLocation().getSpecificPlace();
		getLocation().setSpecificPlace(object);
		System.out.println(getName() + " прокрался в обьект " + object + ".");
	}
	public void take(Entity object) {
		takenItems.add(object);
		System.out.println(getName() + " взял объект " + object.getInformation());
	}
	public void returnFromSomePlace() {
		String s = getLocation().getSpecificPlace();
		getLocation().setSpecificPlace(previousPlace);
		previousPlace = s;
		System.out.println(getName() + " вернулся назад и оказался " + getLocation().getSpecificPlace() + ".");
	}
	public void reactionToTheProhibition(int index, Boolean conditions) {
		boolean flag = false;
		for (int i = 0; i < forgottenInstructions.size(); i++) {
			if ((!forgottenInstructions.get(i).getIsPermission()) &&  (forgottenInstructions.get(i).getIndex() == index)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println(getName() + " будет игнорировать " + prohibitions.get(index).getInformation() + ", так как " + getName() + " забыл о нем.");
		} else {
			if (conditions) {
				System.out.println(getName() + " не может игнорировать " + prohibitions.get(index).getInformation() + ", так как условие \"" + prohibitions.get(index).getCondition() + "\" выполнено.");
			} else {
				System.out.println(getName() + " может игнорировать " + prohibitions.get(index).getInformation() + ", так как условие \"" + prohibitions.get(index).getCondition() + "\" не выполнено.");
			}
		}
	}
	public void reactionToThePermission(int index, Boolean conditions) {
		boolean flag = false;
		for (int i = 0; i < forgottenInstructions.size(); i++) {
			if ((forgottenInstructions.get(i).getIsPermission()) &&  (forgottenInstructions.get(i).getIndex() == index)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println(getName() + " будет использовать " + permissions.get(index).getInformation() + ", так как " + getName() + " забыл об условии.");
		} else {
			if (conditions) {
				System.out.println(getName() + " будет использовать " + permissions.get(index).getInformation() + ", так как условие \"" + permissions.get(index).getCondition() + "\" выполнено.");
			} else {
				System.out.println(getName() + " не будет использовать " + permissions.get(index).getInformation() + ", так как условие \"" + permissions.get(index).getCondition() + "\" не выполнено.");
			}
		}
	}
	private interface Forgettable {
		boolean getIsPermission();
		int getIndex();
	}
	public void forgetInstruction(int index, boolean isPermission) {
		class ForgottenInstruction implements Forgettable {
			private boolean isPermission;
			private int index;
			public ForgottenInstruction(int index, boolean isPermission) {
				this.isPermission = isPermission;
				this.index = index;
			}
			public boolean getIsPermission() {
				return isPermission;
			}
			public int getIndex() {
				return index;
			}
		}
		ForgottenInstruction forgottenInstruction = new ForgottenInstruction(index, isPermission);
		forgottenInstructions.add(forgottenInstruction);
	}
	public void beSurprisedIf(Entity reason, TypeOfAmazement type) {
		System.out.println(getName() + " " + type.getType() + " удивится, если " + reason.getInformation());
	}
	public void doNotKnowAboutRelation(Facts fact, String question) {
		System.out.println(getName() + " не знает, " + question + " " + fact.getThesis());
	}
	
}