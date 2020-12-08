package lab4;
class ReminderFromSomeone extends Entity {
	private static Creature somebody;
    public ReminderFromSomeone(Instructions instruction){
		super("напоминание о следующем: " + instruction.getInformation());
    }
	{
		somebody = new Creature("кто-нибудь") {
			public String say(String reminder) {
				String s = getName() + " произнесет " + reminder + ".";
				return s;
			}
		};
	}
	public String getInformation() {
		return somebody.say(getName());
	}
}