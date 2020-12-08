package lab4;
class Reflection extends Entity {
	private String object;
	private String reflectingObject;
	private Boolean isSpecial;
	
    public Reflection(String object, WaterObject reflectingObject, Twilight twilight){
		super("Oтражение объекта " + object + " в объекте " + reflectingObject.getInformation());
		if (twilight.getStartTwilight()) {
			isSpecial = twilight.getIsSpecial();
		} else {
			isSpecial = false;
		}
    }
	public boolean getIsSpecial() {
		return isSpecial;
	}
	public void showReflection() {
		String s;
		if (isSpecial) {
			s = getInformation() + " обладает характеристикой: " + DescriptionOfReflection.SPECIAL.getDescription() + ".";
		} else {
			s = getInformation() + " обладает характеристикой: " + DescriptionOfReflection.ORDINARY.getDescription() + ".";
		}
		System.out.println(s);
	}
	public String getInformation() {
		return getName();
	}
}