package lab4;
import java.util.Objects;
public class Time {
	private Months month;
	private Day timeOfDay;
	public Time (Months month) {
		this.month = month;
		timeOfDay = Day.SOMETIME;
	}
	public Time (Months month, Day timeOfDay) {
		this.month = month;
		this.timeOfDay = timeOfDay;
	}
	public String getMonth() {
		return month.getMonth();
	}
	public String getTime() {
		return timeOfDay.getTimeOfDay() + " (месяц: " + month.getMonth() + ")";
	}
	public String getTimeOfDay() {
		return timeOfDay.getTimeOfDay();
	}
	public int hashCode() {
		int r = Objects.hashCode(getTime());
		return r;
	}
	public boolean equals(Object time1) {
		if (time1 == this) {
			return true;
		}
		if (time1 == null || getClass() != time1.getClass()) {
			return false;
		}
		Time time2 = (Time) time1;
		return getTime() == time2.getTime();
	}
	public String toString() {
		return getTime();
	}
}