package player;

public class Midfielder extends Player{
	
	public Midfielder(String name, int at_stat, int md_stat, int df_stat) {
		this.name = name;
		this.at_stat = at_stat;
		this.md_stat = md_stat;
		this.df_stat = df_stat;
		this.position = "�̵��ʴ�";
	}
	
	// �г�Ƽű
	public void md_event1(String player) {
		System.out.println("�ֽ��� ���Ƽű�� �����մϴ�");
	}
	
	// ����ű
	public int md_event2(String player, int team) {
		int goal=0;
		if (team == 1) {
			System.out.println("�ֽ��� ����ű�� �����մϴ�. " + player + "������ �� �غ� �ϰ��־��.");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("��~~! " + player + "������ ���� ����ű ���� �������ϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("��... ����ű�� ��븦 ��¦ �������׿�..");
				return goal;
			}
		} else {
			System.out.println("�ֽ��� ����ű�� �����մϴ�. " + player + "������ �� �غ� �ϰ��־��.");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print(
						"                                                                                                                          ");
				System.out.println("��~~! " + player + "������ ���� ����ű ���� �������ϴ�!!");
				goal++;
				return goal;
			} else {
				System.out.print(
						"                                                                                                                          ");
				System.out.println("��... ����ű�� ��븦 ��¦ �������׿�..");
				return goal;
			}
		}
	}
	
	// �������̵�
	public void md_event3(String player) {
		System.out.println(player + "������ �н��� �������̵忡 �ɸ��� ���׿�.");
	}
}
