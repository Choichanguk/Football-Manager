package player;

public class Attacker extends Player{
//	String name;
//	String position;
//	int at_stat;
//	int md_stat;
//	int df_stat;
// 	public Attacker() {}
	
	public Attacker(String name, int at_stat, int md_stat, int df_stat) {
		this.name = name;
		this.at_stat = at_stat;
		this.md_stat = md_stat;
		this.df_stat = df_stat;
		this.position = "���ݼ�";
	}
	
	
	// 1:1 ����
	public int at_event1(String player, int team) {
		int goal = 0;
		if (team == 1) {
			System.out.println(player + "���� 1:1 �����Դϴ�!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("��~~! " + player + "������ ���� ���� �������ϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("��.." + player + "����, 1:1 ������ �ƽ��� ��ġ�׿�.");
				return goal;
			}
		} else {
			System.out.println(player + "���� 1:1 �����Դϴ�!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                                                                                                                          ");
				System.out.println("��~~! " + player + "������ ���� ���� �������ϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                                                                                                                          ");
				System.out.println("��.." + player + "����, 1:1 ������ �ƽ��� ��ġ�׿�.");
				return goal;
			}
		}
	}
	
	// ����
	public int at_event2(String player, int team) {
		int goal = 0;
		if (team == 1) {
			System.out.println(player + "���� ��ī�ο� ��!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("��~~! " + player + "������ ���� ���� �������ϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("��.." + player + "������ ������ ��븦 �ƽ��ƽ��ϰ� �������ϴ�.");
				return goal;
			}
		} else {
			System.out.println(player + "���� ��ī�ο� ��!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                                                                                                                          ");
				System.out.println("��~~! " + player + "������ ���� ���� �������ϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                                                                                                                          ");
				System.out.println("��.." + player + "������ ������ ��븦 �ƽ��ƽ��ϰ� �������ϴ�.");
				return goal;
			}
		}
	}
	
	
	// ����
	public int at_event3(String player, int team) {
		int goal = 0;
		if (team == 1) {
			
			System.out.println(player + "���� ������ �����Դϴ�!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("��~~! " + player + "������ ������� ��ġ�� ���� ����մϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("��.." + player + "������ ���İ� ��� ������ ��Ŭ�� �����׿�..");
				return goal;
			}
		}
		else {
			System.out.println(player + "���� ������ �����Դϴ�!!");
			double percent = Math.random();
			if (percent < 0.2) {
				System.out.print("                                                                                                                          ");
				System.out.println("��~~! " + player + "������ ������� ��ġ�� ���� ����մϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                                                                                                                          ");
				System.out.println("��.." + player + "������ ���İ� ��� ������ ��Ŭ�� �����׿�..");
				return goal;
			}
		}
	}
}
