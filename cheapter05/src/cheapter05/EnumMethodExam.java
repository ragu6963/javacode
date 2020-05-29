package cheapter05;

public class EnumMethodExam {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);

		int ordinal = today.ordinal();
		System.out.println(ordinal);

		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int res1 = day1.compareTo(day2);
		int res2 = day2.compareTo(day1);
		System.out.println(res1);
		System.out.println(res2);

		Week weekday = Week.valueOf("SUNDAY");
		if (weekday == Week.SUNDAY || weekday == Week.SATURDAY)
			System.out.println("주말이다!");
		else
			System.out.println("평일이다!");
		
		
		Week[] days = Week.values();
		for (Week week : days) {
			System.out.println(week);
		}
		
	}
}
