package lab4;
enum TypeOfHouse {
	SPECIAL("нигде в мире нет еще такого(ой)"),
	ORDINARY("в мире есть еще такой(ая)");
    private String typeOfHouse;
    TypeOfHouse(String typeOfHouse){
        this.typeOfHouse = typeOfHouse;
    }
    public String getType(){ 
		return typeOfHouse;
	}
}