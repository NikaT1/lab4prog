package lab4;
import java.util.ArrayList;
public class Adult extends Creature {
	private ArrayList<Child> children = new ArrayList<>();
	private boolean isMale;
	private String typeOfParent;
    public Adult() {
        super();
		isMale = false;		
    }
	public Adult(String name) {
        super (name);
		isMale = false;
    }
	public Adult(String name, int age, boolean isMale) {
        super (name, age);
		this.isMale = isMale;
    }
	public void setChildren(Child child) {
		children.add(child);
		if (isMale) {
			child.setFather(this);
			typeOfParent = "папа";
		} else {
			child.setMother(this);
			typeOfParent = "мама";
		}
	}
	public Child getChild(int index) {
		Child child;
		child = children.get(index);
		return child;
	}
	public void allow(int index, TypeOfAction action, String object, Creature creature, String condition) {
		Instructions.Permission permission = new Instructions.Permission(action, object, creature, condition);
		children.get(index).setPermission(permission);
		System.out.println(typeOfParent + " человека по имени " + children.get(index).getName() + " разрешил(а) ему \"" + action.getType() + "\", существо - " + creature + ", объект - " + object + ", при следующем условии: " + condition + ".");  	
	}
	public void prohibit(int index, TypeOfAction action, String object, Creature creature, String condition) {
		Instructions.Prohibition prohibition = new Instructions.Prohibition(action, object, creature, condition);
		children.get(index).setProhibition(prohibition);
		System.out.println(typeOfParent + " человека по имени " + children.get(index).getName() + " не разрешил(а) ему \"" + action.getType() + "\", существо - " + creature + ", объект - " + object + ", при следующем условии: " + condition + "."); 
	}
}