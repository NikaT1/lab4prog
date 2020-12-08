package lab4;
enum TypeOfWaterObject {
	LAKE("озеро"),
	RIVER("река"),
    BAY("залив");
    private String waterObject;
    TypeOfWaterObject(String waterObject){
        this.waterObject = waterObject;
    }
    public String getType(){ 
		return waterObject;
	}
}