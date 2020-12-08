package lab4;
enum DescriptionOfReflection {
    ORDINARY("обычное"),
    SPECIAL("сказочное");
    private String reflection;
    DescriptionOfReflection(String reflection){
        this.reflection = reflection;
    }
    public String getDescription(){ 
		return reflection;
	}
}