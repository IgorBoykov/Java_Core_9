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
		System.out.println("�������� 1, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
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

			case "1": { // �������� �� �������� �����

				System.out.println("������ �����");
				str = scanner.nextLine();

				if (isMonth(str))
					System.out.println("����� ����� ����");
				else
					throw new WrongInputConsoleParametersException("������ ����� �� ����");

				System.out.println(" ");
				break;
			}

			case "2": { // ��������� ��� ������ � ��������� ����� ����

				System.out.println("������ ���� ����");
				str = scanner.nextLine();

				if (isSeason(str)) {
					for (Month month : Month.values()) {
						if (month.getSeason().name().equalsIgnoreCase(str))
							System.out.println(month);
					}
				} else
					throw new WrongInputConsoleParametersException("���� ���� �� ����");
				System.out.println(" ");
				break;
			}

			case "3": { // ��������� ������ � ��������� ������� ���

				System.out.println("������ �����");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("̳���� � ����� � ����� ������� ���: ");
					Month month = Month.valueOf(str.toUpperCase());
					for (Month m : Month.values()) {
						if (m.getDays() == month.getDays())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("������ ����� �� ����");
				System.out.println(" ");
				break;
			}

			case "4": { // ��������� ������ � ������ ������� ���

				System.out.println("������ �����");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("̳���� � ������ ������� ���: ");
					Month month = Month.valueOf(str.toUpperCase());
					for (Month m : Month.values()) {
						if (m.getDays() < month.getDays())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("������ ����� �� ����");
				System.out.println(" ");
				break;
			}

			case "5": { // ��������� ������ � ������ ������� ���

				System.out.println("������ �����");
				str = scanner.nextLine();

				if (isMonth(str)) {
					System.out.println("̳���� � ������ ������� ���: ");
					Month month = Month.valueOf(str.toUpperCase());
					for (Month m : Month.values()) {
						if (m.getDays() > month.getDays())
							System.out.println(m);
					}
				} else
					throw new WrongInputConsoleParametersException("������ ����� �� ����");
				System.out.println(" ");
				break;
			}

			case "6": { // ��������� �������� ���� ����

				System.out.println("������ ���� ����");
				str = scanner.nextLine();

				if (isSeason(str)) {
					System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal() + 1) % 4]);
				} else
					throw new WrongInputConsoleParametersException("���� ���� �� ����");
				System.out.println(" ");
				break;
			}

			case "7": { // ��������� ����������� ���� ����

				System.out.println("������ ���� ����");
				str = scanner.nextLine();

				if (isSeason(str)) {
					int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
					System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
				} else
					throw new WrongInputConsoleParametersException("���� ���� �� ����");
				System.out.println(" ");
				break;
			}

			case "8": { // ��������� ������ � ������ ������� ���

				System.out.println("̳���� � ������ ������� ���:");
				for (Month month : months) {
					if (month.getDays() % 2 == 0)
						System.out.println(month);

				}
				System.out.println(" ");
				break;
			}

			case "9": { // ��������� ������ � �������� ������� ���

				System.out.println("̳���� � �������� ������� ���:");
				for (Month month : months) {
					if (month.getDays() % 2 != 0)
						System.out.println(month);

				}
				System.out.println(" ");
				break;
			}

			case "10": { // �������� ����� �� ������� ���

				System.out.println("������ �����");
				str = scanner.nextLine();

				if (isMonth(str)) {
					Month month = Month.valueOf(str.toUpperCase());
					if (month.getDays() % 2 == 0)
						System.out.println("����� ����� �� ����� ������� ���");
					else
						System.out.println("����� ����� �� ����� ������� ���");

				} else
					throw new WrongInputConsoleParametersException("������ ����� �� ����");
				System.out.println(" ");
				break;
			}
			}

		}

	}
}