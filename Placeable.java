package lab4;
interface Placeable {
	void setCity(Territory city);
	Territory getCity();
	void setHouse(House house);
	House getHouse();
	void setSpecificPlace(String specificPlace);
	String getSpecificPlace();
}