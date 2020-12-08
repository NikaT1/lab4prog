package lab4;
public class FairytaleCharacter extends Creature {
	private boolean isFlying = false;
	private Entity purpose;
	public FairytaleCharacter(){
        super();	
    }
	public FairytaleCharacter(String name){
        super(name);
    }
	public FairytaleCharacter(String name, int age){
        super(name, age);
    }
	public void flyWithSomebody(Creature creature, TypeOfHolder typeOfHolder, Entity purpose) {
		isFlying = true;
		this.purpose = purpose;
		System.out.println(getName() + " летит с человеком по имени " + creature.getName() + ", способ крепления: " + typeOfHolder.getType() + ", цель полета: " + purpose.getInformation() + ".");
	}
	public void stopFlying() {
		isFlying = false;
		System.out.println(getName() + " закончил лететь, достигнув цели: " + purpose.getInformation() + ".");
	}
	public void canDoSomethingLikeAnimal(String animal, TypeOfAction typeOfAction, Entity object) {
		isFlying = false;
		System.out.println(getName() + " может " + typeOfAction.getType() + " (объект - " + object.getName() + ") как " + animal + ".");
	}
}