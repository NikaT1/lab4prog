package lab4;
enum TypeOfAction {
	FLY("летать с существом на объект"),
	GIVE("давать существу объект"),
    GO("идти с существом"),
	TAKE("собирать объект");
    private String typeOfAction;
    TypeOfAction(String typeOfAction){
        this.typeOfAction = typeOfAction;
    }
    public String getType(){ 
		return typeOfAction;
	}
}