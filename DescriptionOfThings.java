package lab4;
enum DescriptionOfThings {
    ORDINARY("обычные и неудивительные"),
    SPECIAL("удивительные и на первый взгляд бессмысленные");
    private String descriptionOfThings;
    DescriptionOfThings(String descriptionOfThings){
        this.descriptionOfThings = descriptionOfThings;
    }
    public String getDescription(){ 
		return descriptionOfThings;
	}
}