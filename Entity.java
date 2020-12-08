package lab4;
import java.util.Objects;
abstract class Entity {
	private String name;
    public Entity(){
        name = "Безымянный";
    }
	public Entity(String name){
        this.name = name;
    }
    public String getName() { 
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract String getInformation();
	
	public int hashCode() {
		int r = Objects.hashCode(getName());
		return r;
	}
	public boolean equals(Object entity1) {
		if (entity1 == this) {
			return true;
		}
		if (entity1 == null || getClass() != entity1.getClass()) {
			return false;
		}
		Entity entity2 = (Entity) entity1;
		return getName() == entity2.getName();
	}
	public String toString() {
		return getName();
	}
}