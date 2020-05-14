package player;

public class Defender extends Player{
	
	public Defender(String name, int at_stat, int md_stat, int df_stat) {
		super.name = name;
		super.at_stat = at_stat;
		super.md_stat = md_stat;
		super.df_stat = df_stat;
		this.position = "수비수";
		
	}
	
	// 태클
	public void df_event1(String player) {
		System.out.println(player + "선수, 날카로운 태클을 통해 상대팀의 역습을 막아냅니다!");
	}
	
}
