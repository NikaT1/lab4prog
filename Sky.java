package lab4;
class Sky extends Entity {
	private Glowing glowing;
	private boolean isGlow = false;
	private boolean isChangeColor = false;
    public Sky(Area type, String name){
		super("небо над территорией " + type.getArea() + " " + name);
		if ((name == "Стокгольм") && (type == Area.CITY)) {
			glowing = Glowing.SPECIAL;
		} else {
			glowing = Glowing.ORDINARY;
		}
    }
	public void glow() {
		isGlow = true;
	}
	public boolean getGlow() {
		return isGlow;
	}
	public String showGlow() {
		String s;
		if (isGlow) {
			s = "небо светится " + glowing.getGlowing() + " светом";
		} else {
			s = "небо не светится " + glowing.getGlowing() + " светом";
		}
		return s;
	}
	public void changeColor() {
		isChangeColor = true;
	}
	public String showChangeColor() {
		String s;
		if (isChangeColor) {
			s = "небо меняет цвет";
		} else {
			s = "небо не меняет цвет";
		}
		return s;
	}
	public String getInformation() {
		return getName();
	}
}