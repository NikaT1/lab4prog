package lab4;
class Twilight extends Entity {
	private DescriptionOfTwilight clearness;
	private DescriptionOfTwilight blueness;
	private DescriptionOfTwilight transparency;
	private boolean isSpecial;
	private boolean isStartTwilight = false;
    public Twilight(Area type, String name){
		super("сумерки на территории " + type.getArea() + " " + name);
		if ((name == "Стокгольм") && (type == Area.CITY)) {
			clearness = DescriptionOfTwilight.SPECIALCLEAR;
			blueness = DescriptionOfTwilight.SPECIALBLUE;
			transparency = DescriptionOfTwilight.SPECIALTRANSPARENT;
			isSpecial = true;
		} else {
			clearness = DescriptionOfTwilight.CLEAR;
			blueness = DescriptionOfTwilight.BLUE;
			transparency = DescriptionOfTwilight.TRANSPARENT;
			isSpecial = false;
		}
    }
	public void startTwilight() {
		isStartTwilight = true;
	}
	public boolean getStartTwilight() {
		return isStartTwilight;
	}
	public boolean getIsSpecial() {
		return isSpecial;
	}
	public String showTwilight() {
		String s;
		if (isStartTwilight) {
			s = "сумерки обладают следующими характеристиками: " + clearness.getTwilight() + ", " + blueness.getTwilight() + ", " + transparency.getTwilight();
		} else {
			s = "сумерки пока не наступили";
		}
		return s;
	}
	public String getInformation() {
		return getName();
	}
}