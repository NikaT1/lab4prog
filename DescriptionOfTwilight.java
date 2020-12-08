package lab4;
enum DescriptionOfTwilight {
    CLEAR("ясные"),
	SPECIALCLEAR("по-особенному ясные"),
	BLUE("синие"),
	SPECIALBLUE("по-особенному синие"),
	TRANSPARENT("прозрачные"),
    SPECIALTRANSPARENT("по-особенному прозрачные");
    private String twilight;
    DescriptionOfTwilight(String twilight){
        this.twilight = twilight;
    }
    public String getTwilight(){ 
		return twilight;
	}
}