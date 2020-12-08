package lab4;
enum TypeOfHolder {
	NECK("обхватить руками шею"),
	STOMACH("обхватить руками живот"),
    LEGS("обхватить руками ноги");
    private String typeOfHolder;
    TypeOfHolder(String typeOfHolder){
        this.typeOfHolder = typeOfHolder;
    }
    public String getType(){ 
		return typeOfHolder;
	}
}