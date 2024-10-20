
public class Main {
	public static String BirthdayWishes(String Name, int age) {
		return "Happy birthday "+ Name + ". Congrats for turning "+age+". YAYYYYY!!";
	}

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("Prathyusha");
		s.setAge(23);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(BirthdayWishes(s.getName(),s.getAge()));

	}

}
