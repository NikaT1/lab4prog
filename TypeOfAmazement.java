package lab4;
enum TypeOfAmazement {
	SINCERELY("искренне"),
	NOTSINCERELY("не искренне"),
	ALITTLE("немного");
    private String typeOfAmazement;
    TypeOfAmazement(String typeOfAmazement){
        this.typeOfAmazement = typeOfAmazement;
    }
    public String getType(){ 
		return typeOfAmazement;
	}
}