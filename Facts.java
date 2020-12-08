package lab4;
import java.util.Objects;
public class Facts {
	private Entity object1;
	private Entity object2; 
	private String object3;
	private String object4; 
	private String relation;
	public Facts(Entity entity1, Entity entity2, String relation) {
		object1 = entity1;
		object2 = entity2; 
		this.relation = relation;
	}
	public Facts(String object3, String object4, String relation) {
		this.object3 = object3;
		this.object4 = object4; 
		this.relation = relation;
	}
	public String getThesis() {
		String s;
		if (object1 != null) {
			s = object1.getInformation() + " " + relation + " " + object2.getInformation();
		} else {
			s = object3 + " " + relation + " " + object4;
		}
		return s;
	}
	public int hashCode() {
		int r = Objects.hashCode(getThesis());
		return r;
	}
	public boolean equals(Object fact1) {
		if (fact1 == this) {
			return true;
		}
		if (fact1 == null || getClass() != fact1.getClass()) {
			return false;
		}
		Facts fact2 = (Facts) fact1;
		return getThesis() == fact2.getThesis();
	}
	public String toString() {
		return getThesis();
	}
}