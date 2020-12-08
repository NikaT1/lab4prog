package lab4;
class Things extends Entity {
	private Creature collector;
	private TypeOfThings type;
	private int number;
	private DescriptionOfThings descriptionOfThings;
	public Things(TypeOfThings type, Creature collector, int number, DescriptionOfThings descriptionOfThings){
		super(type.getType() + " (количество: " + number + ", сборщик: " + collector.getName() + ")");
		this.collector = collector;
	    this.type = type;
	    this.number = number;
		this.descriptionOfThings = descriptionOfThings;
    }
	public String getInformation() {
		String s =  getName() + " обладают(ет) характеристикой " + descriptionOfThings.getDescription() ;
		return s;
	}
	public int getNumber() {
		return number;
	}
	public Creature getCollector() {
		return collector;
	}
	public TypeOfThings getType() {
		return type;
	}
	public DescriptionOfThings getDescriptionOfThings() {
		return descriptionOfThings;
	}
}