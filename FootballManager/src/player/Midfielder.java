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
	public void event1() {}
	
	// ����ű
	public void event2() {}
	
	// �������̵�
	public void event3() {}
}
