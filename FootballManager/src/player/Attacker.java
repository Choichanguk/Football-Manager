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
	public void event1() {

	}
	
	// ����
	public void event2() {}
	
	// ����
	public void event3() {}
}
