package lab4;
class Habit extends Entity {
	private TypeOfAction typeOfAction;
	private Creature сreature;
    public Habit(TypeOfAction typeOfAction, Creature сreature){
		super("привычка \"" + typeOfAction.getType() + "\", существо - " + сreature);
		this.typeOfAction = typeOfAction;
		this.сreature = сreature;
    }
	public String getInformation() {
		return getName();
	}
}