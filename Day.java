package lab4;
enum Day {
	SOMETIME("неопределенное время дня"),
    MORNING("утро"),
	DAYTIME("день"),
	EVENING("вечер"),
	NIGHT("ночь");
    private String day;
    Day (String day){
        this.day = day;
    }
    public String getTimeOfDay() { 
		return day;
	}
}