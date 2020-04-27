/*
 * LOGOS It Academy
 * 
 * */

package Task1;

import java.util.Scanner;

/**
 * @since java 1.8
 * @author Igor Boikov
 * @version 1.0.1
 */

public class Application {

	static void menu() {
		System.out.println("Ќатисн≥ть 1, щоб перев≥рити чи Ї такий м≥с€ць");
		System.out.println("Ќатисн≥ть 2, щоб вивести вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println("Ќатисн≥ть 3, щоб вивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 4, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 5, щлб вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 6, щоб вивести на екран наступну пору року");
		System.out.println("Ќатисн≥ть 7, щоб вивести на екран попередню пору року");
		System.out.println("Ќатисн≥ть 8, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 9, щоб вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 10, щоб вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");
	}

	static boolean isMonth(String str) {
		boolean isMonth = false;
		for (Month month : Month.values()) {
			if (str.equalsIgnoreCase(month.name())) {
				isMonth = true;
				break;
			}
		}
		return isMonth;

	}

	static boolean isSeason(String str) {
		boolean isSeason = false;
		for (Seasons seasons : Seasons.values()) {
			if (str.equalsIgnoreCase(seasons.name())) {
				isSeason = true;
				break;
			}
		}
		return isSeason;

	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Scanner scanner = new Scanner(System.in);
		String str;

		Month[] months = Month.values();

		while (true) {
			menu();
			str = scanner.nextLine();
			switch (str) {

			case "1": { // ѕерев≥рка на на€вн≥сть м≥с€ц€

				System.out.println("¬вед≥ть м≥с€ць");
				str = scanner.nextLine();

				if (isMonth(str))
					System.out.println("“акий м≥с€ць ≥снуЇ");
				else
					throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ");

				System.out.println(" ");
				break;
			}

			case "2": { // ¬иведенн€ вс≥х м≥с€ц≥в з однаковою порою року

				System.out.println("¬вед≥ть пору року");
				str = scanner.nextLine();

				if (isSeason(str)) {
					for (Month month : Month.values()) {
						if (month.getSeason().name().equalsIgnoreCase(str))
							System.out.println(month);
					}
				} else
					throw new WrongInputConsoleParametersException("“акоњ пори не ≥снуЇ");
				System.out.println(" ");
				break;
			}

			case "3": { // ¬иведенн€ м≥с€ц≥в з однаковою к≥льк≥стю дн≥в

				System.out.println("¬вед≥ть м≥с€ць");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("ћ≥с€ц≥ з такою ж самою к≥льк≥стю дн≥в: ");
					Month month = Month.valueOf(str.toUpperCase());
					for (Month m : Month.values()) {
						if (m.getDays() == month.getDays())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ");
				System.out.println(" ");
				break;
			}

			case "4": { // ¬иведенн€ м≥с€ц≥в з меншою к≥льк≥стю дн≥в

				System.out.println("¬вед≥ть м≥с€ць");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("ћ≥с€ц≥ з меншою к≥льк≥стю дн≥в: ");
					Month month = Month.valueOf(str.toUpperCase());
					for (Month m : Month.values()) {
						if (m.getDays() < month.getDays())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ");
				System.out.println(" ");
				break;
			}

			case "5": { // ¬иведенн€ м≥с€ц≥в з б≥льшою к≥льк≥стю дн≥в

				System.out.println("¬вед≥ть м≥с€ць");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("ћ≥с€ц≥ з б≥льшою к≥льк≥стю дн≥в: ");
					Month month = Month.valueOf(str.toUpperCase());
					for (Month m : Month.values()) {
						if (m.getDays() > month.getDays())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ");
				System.out.println(" ");
				break;
			}

			case "6": { // ¬иведенн€ наступноњ пори року

				System.out.println("¬вед≥ть пору року");
				str = scanner.nextLine();

				if (isSeason(str)) {
					System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
				} else
					throw new WrongInputConsoleParametersException("“акоњ пори не ≥снуЇ");
				System.out.println(" ");
				break;
			}

			case "7": { // ¬иведенн€ нпопередньоњ пори року

				System.out.println("¬вед≥ть пору року");
				str = scanner.nextLine();

				if (isSeason(str)) {
					int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
					System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
				} else
					throw new WrongInputConsoleParametersException("“акоњ пори не ≥снуЇ");
				System.out.println(" ");
				break;
			}

			case "8": { // ¬иведенн€ м≥с€ц≥в з парною к≥льк≥стю дн≥в

				System.out.println("ћ≥с€ц≥ з парною к≥льк≥стю дн≥в:");
				for (Month month : months) {
					if (month.getDays() % 2 == 0)
						System.out.println(month);

				}
				System.out.println(" ");
				break;
			}

			case "9": { // ¬иведенн€ м≥с€ц≥в з непарною к≥льк≥стю дн≥в

				System.out.println("ћ≥с€ц≥ з непарною к≥льк≥стю дн≥в:");
				for (Month month : months) {
					if (month.getDays() % 2 != 0)
						System.out.println(month);

				}
				System.out.println(" ");
				break;
			}

			case "10": { // ѕерев≥рка м≥с€ц€ на к≥льк≥сть дн≥в

				System.out.println("¬вед≥ть м≥с€ць");
				str = scanner.nextLine();

				if (isMonth(str)) {
					Month month = Month.valueOf(str.toUpperCase());
					if (month.getDays() % 2 == 0)
						System.out.println("ƒаний м≥с€ць маЇ парну к≥льк≥сть дн≥в");
					else
						System.out.println("ƒаний м≥с€ць маЇ парну к≥льк≥сть дн≥в");

				} else
					throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ");
				System.out.println(" ");
				break;
			}
			}

		}

	}
}