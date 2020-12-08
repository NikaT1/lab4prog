package lab4;
enum DescriptionOfWater {
    FADED("блеклые"),
	ORDINARY("обычные");
    private String water;
    DescriptionOfWater(String water){
        this.water = water;
    }
    public String getDescription(){ 
		return water;
	}
}