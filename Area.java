package lab4;
enum Area {
    COUNTRY("деревня"),
	CITY("город"),
	WATERBODY("водоем"),
    NATURALOBJECT("природный объект");
	
    private String area;
    Area(String area){
        this.area = area;
    }
    public String getArea() { 
		return area;
	}
}