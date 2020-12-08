package lab4;
import java.util.Objects;
public class Celebration implements Celebratable {
    private Creature hero1;
    private Creature hero2;
    private House place;
    private boolean isSittingTogether = false;
    public Celebration(Creature hero1, Creature hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
        place = new House("незаданный дом");
    }
    public Celebration(Creature hero1, Creature hero2, House place) {
        this.hero1 = hero1;
        this.hero2 = hero2;
        this.place = place;
    }
    public void celebrateTogether(Time time) {
        Place place1 = new Place(hero1.getLocation().getCity(), place);
        hero1.setLocation(place1);
        Place place2 = new Place(hero2.getLocation().getCity(), place);
        hero2.setLocation(place2);
        hero2.setAge(hero2.getAge() + 1);
        System.out.println("Время " + time.getTime() + " на территории " + hero1.getLocation().getInformation() + " словно специально созданы для празднования дней рождения именинника по имени " + hero2.getName() + ", которому исполнилось " + hero2.getAge() +" лет.");
    }
    public void sitTogether(String specificPlace){
        isSittingTogether = true;
        Place place1 = new Place(hero1.getLocation().getCity(), place, specificPlace);
        hero1.setLocation(place1);
        Place place2 = new Place(hero2.getLocation().getCity(), place, specificPlace);
        hero2.setLocation(place2);
        System.out.println(hero1.sit() + " и " +  hero2.sit() + " рядышком " + specificPlace + ".");
    }
    public void eatTogether(FoodAndDrinks food){
        if (isSittingTogether) {
            System.out.println(hero1.eat(food) + " и " +  hero2.eat(food) + ".");
        } else {
            throw new DifferentLocation("герои не могут кушать вместе, так как не находятся рядом.");
        }
    }
    public void drinkTogether(FoodAndDrinks drink) {
        if (isSittingTogether) {
            System.out.println(hero1.drink(drink) + " и " +  hero2.drink(drink) + ".");
        } else {
            throw new DifferentLocation("герои не могут кушать вместе, так как не находятся рядом.");
        }
    }
    public void admireTogether(String object) {
        if (hero1.getWantToAdmire()) {
            System.out.println (hero1.admire(object) + ".");
        } else {
            System.out.println (hero1.disregard(object) + ".");
        }
        if (hero2.getWantToAdmire()) {
            System.out.println ("В то же время " + hero2.admire(object) + ".");
        } else {
            System.out.println ("В то же время " + hero2.disregard(object) + ".");
        }
    }
    public void realizeTogether() {
        System.out.println (hero1.realizeRelation() + " и " + hero2.realizeRelation() + ".");
    }
    public int hashCode() {
        int r = Objects.hashCode(hero2.getName());
        return r;
    }
    public boolean equals(Object celebration1) {
        if (celebration1 == this) {
            return true;
        }
        if (celebration1 == null || getClass() != celebration1.getClass()) {
            return false;
        }
        Celebration celebration2 = (Celebration) celebration1;
        return hero2.getName() == celebration2.hero2.getName();
    }
    public String toString() {
        String s = "Именниник: " + hero2.getName() + ", гость: " + hero1.getName();
        return s;
    }
}