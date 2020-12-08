package lab4;
import java.util.Objects;
abstract class Instructions {
	private TypeOfAction action;
	private String object; 
	private Creature creature; 
	private String condition;
	public Instructions(TypeOfAction action, String object, Creature creature, String condition) {
		this.action = action;
		this.object = object; 
		this.creature = creature;
		this.condition = condition;
	}
	public TypeOfAction getAction() {
		return action;
	}
	public String getObject() {
		return object;
	}
	public Creature getCreature() {
		return creature;
	}
	public String getCondition() {
		return condition;
	}
	public int hashCode() {
		int r = Objects.hashCode(getInformation());
		return r;
	}
	public boolean equals(Object instruction1) {
		if (instruction1 == this) {
			return true;
		}
		if (instruction1 == null || getClass() != instruction1.getClass()) {
			return false;
		}
		Instructions instruction2 = (Instructions) instruction1;
		return getInformation() == instruction2.getInformation();
	}
	public String toString() {
		return getInformation();
	}
	abstract String getInformation();
	public static class Prohibition extends Instructions {
		public Prohibition(TypeOfAction action, String object, Creature creature, String condition) {
			super(action, object, creature, condition);
		}
		public String getInformation() {
			String s;
			s = "запрет на действие \"" + getAction().getType() + "\", существо - " + getCreature().getName() + ", объект - " + getObject() + ", условие:  " + getCondition();
			return s;
		}
	}
	public static class Permission extends Instructions {
		public Permission(TypeOfAction action, String object, Creature creature, String condition) {
			super(action, object, creature, condition);
		}
		public String getInformation() {
			String s;
			s = "разрешение на действие \"" + getAction().getType() + "\", существо - " + getCreature().getName() + ", объект - " + getObject() + ", условие: " + getCondition();
			return s;
		}
	} 
}