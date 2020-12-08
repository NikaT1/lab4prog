package lab4;
enum TypeOfThings {
	FURNITURE("мебель"),
	CLOTHES("одежда"),
    DIFFERENT("разнообразные вещи");
    private String typeOfThings;
    TypeOfThings(String typeOfThings){
        this.typeOfThings = typeOfThings;
    }
    public String getType(){ 
		return typeOfThings;
	}
}