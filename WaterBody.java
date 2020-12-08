package lab4;
class WaterObject extends Entity {
	private TypeOfWaterObject type;
	private DescriptionOfWater description;
    public WaterObject(TypeOfWaterObject type, Area areaType, String name){
		super(type.getType() + " на территории " + areaType.getArea() + " " + name);
		this.type = type;
		if ((name == "Стокгольм") && (areaType == Area.CITY)) {
			description = DescriptionOfWater.FADED;
		} else {
			description = DescriptionOfWater.ORDINARY;
		}
    }
	public WaterObject(Area areaType, String name){
		super(TypeOfWaterObject.BAY.getType() + " на территории " + areaType.getArea() + " " + name);
		type = TypeOfWaterObject.BAY;
		description = DescriptionOfWater.ORDINARY;
    }
	public String getInformation() {
		return getName() + " (воды данного водоема обладают характеристикой: " + description.getDescription() + ")";
	}
}