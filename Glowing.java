package lab4;
enum Glowing {
	SPECIAL("особым"),
	ORDINARY("обычным");
    private String glowing;
    Glowing (String glowing){
        this.glowing = glowing;
    }
    public String getGlowing(){ 
		return glowing;
	}
}