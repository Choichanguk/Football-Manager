package player;

public class Defender extends Player{
	
	public Defender(String name, int at_stat, int md_stat, int df_stat) {
		super.name = name;
		super.at_stat = at_stat;
		super.md_stat = md_stat;
		super.df_stat = df_stat;
		this.position = "�����";
		
	}
	
	// ��Ŭ
	public void df_event1(String player) {
		System.out.println(player + "����, ��ī�ο� ��Ŭ�� ���� ������� ������ ���Ƴ��ϴ�!");
	}
	
}
