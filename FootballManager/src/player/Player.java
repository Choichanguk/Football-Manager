package player;

public class Player {
	public String name;
	public String position;
	public int at_stat;
	public int md_stat;
	public int df_stat;
	public int stamina = 100;
	public int money;
	Player() {}
//	Player(String name, int at_stat, int md_stat, int df_stat) {
//		this.name = name;
//		this.at_stat = at_stat;
//		this.md_stat = md_stat;
//		this.df_stat = df_stat;
//	}
	
	// ����ī��
	public void event1(String player) {
		System.out.println(player + "����, ��ģ ��Ŭ�̿���. ����ī�尡 ����˴ϴ�.");
	}
	
	// ����ī��
	public void event2(String player) {
		System.out.println(player + "����, �ʹ� ���� ��Ŭ�̿���..������ ����ī�带 �����մϴ�.");
	}
	
	// VAR
	public void event3(String player) {
		System.out.println("������ VAR�� ��û�մϴ�. ����� ���� ���� �������ڴµ���.");
		
	}
	

}	
