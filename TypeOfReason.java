package lab4;
enum TypeOfReason {
	FIND("легко найти в нужный момент"),
	NOTTOLOSE("одежда"),
    FORBEAUTY("разнообразные вещи");
    private String typeOfReason;
    TypeOfReason(String typeOfReason){
        this.typeOfReason = typeOfReason;
    }
    public String getType(){ 
		return typeOfReason;
	}
}