package lab4;
import java.util.Objects;
public class Place extends Entity implements Placeable{
	public Place(Territory city) {
		super(city.getName() + " в незаданном доме в незаданном месте");
		this.city = city;
		this.house = new House("незаданный дом");
		this.specificPlace = "в незаданном месте";
	}
	public Place(Territory city, House house) {
		super(city.getName() + " " + house + " в незаданном месте");
		this.city = city;
		this.house = house;
		this.specificPlace = "в незаданном месте";
	}
	public Place(Territory city, House house, String specificPlace) {
		super(city.getName() + " " + house + " " + specificPlace);
		this.city = city;
		this.house = house;
		this.specificPlace = specificPlace;
	}
	private Territory city;
	private House house;
	private String specificPlace;
	public void setCity(Territory city) {
		this.city = city;
	}
	public Territory getCity() {
		return city;
	}
	public void setHouse(House house){
		this.house = house;
	}
	public House getHouse() {
		return house;
	}
	public void setSpecificPlace(String specificPlace){
		this.specificPlace = specificPlace;
	}
	public String getSpecificPlace() {
		return specificPlace;
	}
	public String getInformation() {
		return city.getName() + " " + house.getName() + " " + specificPlace;
	}
}