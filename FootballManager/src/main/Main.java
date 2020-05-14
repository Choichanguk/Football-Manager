package main;

import java.util.Scanner;

import player.Player;
// �����Ȳ - 1�θ��ױ��� �뷫���� Ʋ �ϼ�.
// �߰� �׸� - ���� ���� ���� �޼ҵ� �����, ���¹̳� �Ҹ� ���� �ֱ�, ���¹̳� �ڵ� ȸ�� ������ ����, ���� �Ʒ� ������ ����, ���Ƽű ������ ����  
//         --> �׸��� ���������� �Ĺ��� ����� --> �׽�Ʈ �� ���� ���
public class Main {

	public static void main(String[] args) {
		Process process = new Process();
		process.StartText();
		GameProcess gamestart = new GameProcess();
		League league = new League();
		Trade trade = new Trade();
		process.Explain();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸��� �����ּ���.");
		String manager_name = scan.nextLine();
		System.out.println("�� �̸��� �����ּ���.");
		String team_name = scan.nextLine();
		Team team = new Team(manager_name, team_name);
		team.TeamInfo();
		System.out.println("3�θ��װ� ���۵Ǿ����ϴ�!!");
		league.LeagueInfo(team, 3);
		Scanner sc = new Scanner(System.in);
		int choicetrade;
		
		int loop_menu;
		int loop_league;
		int choice;
		int remain;
		int victory=0;
		// 3�� 1���
		remain = 3;
		loop_league=0;
		loop_entire: while(victory==0) {
		loop: while (loop_league==0) {
			loop_menu = 0;
		while (loop_menu == 0) {
			choice = process.Menu();
			if (choice == 1) {
				team.ChangePlayer();
				int result;
				result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team2_list, team.team1, team.team2), team.team1, team.team2);
				if(result==2) {
					league.RenewLeague(3, result, 0, 1, 1);
					team.Plus(2);
				}
				else if(result==1) {
					league.RenewLeague(3, result, 1, 1, 1);
					team.Plus(1);
				}
				else if(result==0) {
					league.RenewLeague(3, result, 2, 1, 1);
				}
				loop_menu++;
			} else if (choice == 2) {
				team.TeamInfo();
				
			} else if (choice == 3) {
				league.LeagueInfo(team, 3);
				
			} else if (choice == 4) {
				team.Training();
			} else if (choice == 5) {
				System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
				trade.ViewList();
			} else {
				System.out.println("1~5�� �߿� �������ּ���.");
			}
		}
		league.LeagueInfo(team, 3);
		
		
		// 3�� 2���
		loop_menu = 0;
				while (loop_menu == 0) {
					choice = process.Menu();
					if (choice == 1) {
						team.ChangePlayer();
						int result;
						result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team3_list, team.team1, team.team3), team.team1, team.team3);
						if(result==2) {
							league.RenewLeague(3, result, 1, 0, 1);
							team.Plus(2);
						}
						else if(result==1) {
							league.RenewLeague(3, result, 0, 1, 2);
							team.Plus(1);
						}
						else if(result==0) {
							league.RenewLeague(3, result, 2, 2, 0);
						}
						loop_menu++;
					} else if (choice == 2) {
						team.TeamInfo();
						
					} else if (choice == 3) {
						league.LeagueInfo(team, 3);
						
					} else if (choice == 4) {
						team.Training();
					} else if (choice == 5) {
						System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
						trade.ViewList();
					} else {
						System.out.println("1~5�� �߿� �������ּ���.");
					}
				}
				league.LeagueInfo(team, 3);
				//3�� 3���
				loop_menu = 0;
				while (loop_menu == 0) {
					choice = process.Menu();
					if (choice == 1) {
						team.ChangePlayer();
						int result;
						result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team4_list, team.team1, team.team4), team.team1, team.team4);
						if(result==2) {
							league.RenewLeague(3, result, 1, 1, 0);
							team.Plus(2);
						}
						else if(result==1) {
							league.RenewLeague(3, result, 0, 2, 1);
							team.Plus(1);
						}
						else if(result==0) {
							league.RenewLeague(3, result, 2, 0, 2);
						}
						loop_menu++;
					} else if (choice == 2) {
						team.TeamInfo();
						
					} else if (choice == 3) {
						league.LeagueInfo(team, 3);
						
					} else if (choice == 4) {
						team.Training();
					} else if (choice == 5) {
						System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
						trade.ViewList();
					} else {
						System.out.println("1~5�� �߿� �������ּ���.");
					}
				}
				System.out.println("���װ� ����Ǿ����ϴ�.");
				league.LeagueInfo(team, 3);
				int league_result = league.Result(3);
				if(league_result == 1) {
					System.out.println("����� ���� 3�θ��׿��� ����� �߽��ϴ�!! ����� ���� 2�θ��׷� �°��ϰ� �˴ϴ�.");
					loop_league++;
				}
				else if(league_result == 0) {
					remain--;
					if(remain<0) {
						System.out.println("����� �����Ǿ����ϴ�...");
						break loop_entire;
					}
					else{
						System.out.println("����� ���� ���׿��� ������� ���߽��ϴ�...    ���� �ܷ� Ƚ��: " + remain + "��");
					}
				}
				
				System.out.println("������ ���� ���������� ���Ƚ��ϴ�. �������忡 �����Ͻðڽ��ϱ�?");
				System.out.println("1)�����Ѵ�  2)�������� �ʴ´�");
				choicetrade = sc.nextInt();
				if(choicetrade==1) {
					Player player;
					int result = trade.Trade(team.money);
					if(result != 0) {
						player = trade.legend_list.get(result-1);
						trade.legend_list.remove(result-1);
						team.team1_list.add(player);
						team.money = team.money - player.money;
						team.TeamInfo();
					}
				}
				else if(choicetrade==2) {
					System.out.println("�������忡 �������� �ʽ��ϴ�.");
				}
				
		}
		
		// 2�θ��� ����
		
		System.out.println("2�θ��װ� ���۵Ǿ����ϴ�!!");
		league.LeagueInfo(team, 2);
		remain = 3;
		loop_league=0;
		loop: while (loop_league==0) {
			loop_menu = 0;
		while (loop_menu == 0) {
			choice = process.Menu();
			if (choice == 1) {
				team.ChangePlayer();
				int result;
				result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team5_list, team.team1, team.team5), team.team1, team.team5);
				if(result==2) {
					league.RenewLeague(2, result, 0, 1, 1);
					team.Plus(2);
				}
				else if(result==1) {
					league.RenewLeague(2, result, 1, 1, 1);
					team.Plus(1);
				}
				else if(result==0) {
					league.RenewLeague(2, result, 2, 1, 1);
				}
				loop_menu++;
			} else if (choice == 2) {
				team.TeamInfo();
				
			} else if (choice == 3) {
				league.LeagueInfo(team, 2);
				
			} else if (choice == 4) {
				team.Training();
			} else if (choice == 5) {
				System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
				trade.ViewList();
			} else {
				System.out.println("1~5�� �߿� �������ּ���.");
			}
		}
		league.LeagueInfo(team, 3);
		
		
		// 3�� 2���
		loop_menu = 0;
				while (loop_menu == 0) {
					choice = process.Menu();
					if (choice == 1) {
						team.ChangePlayer();
						int result;
						result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team6_list, team.team1, team.team6), team.team1, team.team6);
						if(result==2) {
							league.RenewLeague(2, result, 1, 0, 1);
							team.Plus(2);
						}
						else if(result==1) {
							league.RenewLeague(2, result, 0, 1, 2);
							team.Plus(1);
						}
						else if(result==0) {
							league.RenewLeague(2, result, 2, 2, 0);
						}
						loop_menu++;
					} else if (choice == 2) {
						team.TeamInfo();
						
					} else if (choice == 3) {
						league.LeagueInfo(team, 2);
						
					} else if (choice == 4) {
						team.Training();
					} else if (choice == 5) {
						System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
						trade.ViewList();
					} else {
						System.out.println("1~5�� �߿� �������ּ���.");
					}
				}
				league.LeagueInfo(team, 3);
				//3�� 3���
				loop_menu = 0;
				while (loop_menu == 0) {
					choice = process.Menu();
					if (choice == 1) {
						team.ChangePlayer();
						int result;
						result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team7_list, team.team1, team.team7), team.team1, team.team7);
						if(result==2) {
							league.RenewLeague(2, result, 1, 1, 0);
							team.Plus(2);
						}
						else if(result==1) {
							league.RenewLeague(2, result, 0, 2, 1);
							team.Plus(1);
						}
						else if(result==0) {
							league.RenewLeague(2, result, 2, 0, 2);
						}
						loop_menu++;
					} else if (choice == 2) {
						team.TeamInfo();
						
					} else if (choice == 3) {
						league.LeagueInfo(team, 2);
						
					} else if (choice == 4) {
						team.Training();
					} else if (choice == 5) {
						System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
						trade.ViewList();
					} else {
						System.out.println("1~5�� �߿� �������ּ���.");
					}
				}
				System.out.println("���װ� ����Ǿ����ϴ�.");
				league.LeagueInfo(team, 2);
				int league_result = league.Result(2);
				if(league_result == 1) {
					System.out.println("����� ���� 2�θ��׿��� ����� �߽��ϴ�!! ����� ���� 1�θ��׷� �°��ϰ� �˴ϴ�.");
					loop_league++;
				}
				else if(league_result == 0) {
					remain--;
					if(remain<0) {
						System.out.println("����� �����Ǿ����ϴ�...");
						break loop_entire;
					}
					else{
						System.out.println("����� ���� ���׿��� ������� ���߽��ϴ�...    ���� �ܷ� Ƚ��: " + remain + "��");
					}
				}
				
				System.out.println("������ ���� ���������� ���Ƚ��ϴ�. �������忡 �����Ͻðڽ��ϱ�?");
				System.out.println("1)�����Ѵ�  2)�������� �ʴ´�");
				choicetrade = sc.nextInt();
				if(choicetrade==1) {
					Player player;
					int result = trade.Trade(team.money);
					if(result != 0) {
						player = trade.legend_list.get(result-1);
						trade.legend_list.remove(result-1);
						team.team1_list.add(player);
						team.money = team.money - player.money;
						team.TeamInfo();
					}
				}
				else if(choicetrade==2) {
					System.out.println("�������忡 �������� �ʽ��ϴ�.");
				}
				
		}
		
		// 1�θ��� ����
		
				System.out.println("1�θ��װ� ���۵Ǿ����ϴ�!!");
				league.LeagueInfo(team, 1);
				remain = 3;
				loop_league=0;
				loop: while (loop_league==0) {
					loop_menu = 0;
				while (loop_menu == 0) {
					choice = process.Menu();
					if (choice == 1) {
						team.ChangePlayer();
						int result;
						result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team8_list, team.team1, team.team8), team.team1, team.team8);
						if(result==2) {
							league.RenewLeague(1, result, 0, 1, 1);
							team.Plus(2);
						}
						else if(result==1) {
							league.RenewLeague(1, result, 1, 1, 1);
							team.Plus(1);
						}
						else if(result==0) {
							league.RenewLeague(1, result, 2, 1, 1);
						}
						loop_menu++;
					} else if (choice == 2) {
						team.TeamInfo();
						
					} else if (choice == 3) {
						league.LeagueInfo(team, 1);
						
					} else if (choice == 4) {
						team.Training();
					} else if (choice == 5) {
						System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
						trade.ViewList();
					} else {
						System.out.println("1~5�� �߿� �������ּ���.");
					}
				}
				league.LeagueInfo(team, 3);
				
				
				// 3�� 2���
				loop_menu = 0;
						while (loop_menu == 0) {
							choice = process.Menu();
							if (choice == 1) {
								team.ChangePlayer();
								int result;
								result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team9_list, team.team1, team.team9), team.team1, team.team9);
								if(result==2) {
									league.RenewLeague(1, result, 1, 0, 1);
									team.Plus(2);
								}
								else if(result==1) {
									league.RenewLeague(1, result, 0, 1, 2);
									team.Plus(1);
								}
								else if(result==0) {
									league.RenewLeague(1, result, 2, 2, 0);
								}
								loop_menu++;
							} else if (choice == 2) {
								team.TeamInfo();
								
							} else if (choice == 3) {
								league.LeagueInfo(team, 1);
								
							} else if (choice == 4) {
								team.Training();
							} else if (choice == 5) {
								System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
								trade.ViewList();
							} else {
								System.out.println("1~5�� �߿� �������ּ���.");
							}
						}
						league.LeagueInfo(team, 3);
						//3�� 3���
						loop_menu = 0;
						while (loop_menu == 0) {
							choice = process.Menu();
							if (choice == 1) {
								team.ChangePlayer();
								int result;
								result = process.ViewResult(gamestart.GameStart(team.team1_list, team.team10_list, team.team1, team.team10), team.team1, team.team10);
								if(result==2) {
									league.RenewLeague(1, result, 1, 1, 0);
									team.Plus(2);
								}
								else if(result==1) {
									league.RenewLeague(1, result, 0, 2, 1);
									team.Plus(1);
								}
								else if(result==0) {
									league.RenewLeague(1, result, 2, 0, 2);
								}
								loop_menu++;
							} else if (choice == 2) {
								team.TeamInfo();
								
							} else if (choice == 3) {
								league.LeagueInfo(team, 1);
								
							} else if (choice == 4) {
								team.Training();
							} else if (choice == 5) {
								System.out.println("������ ������ �ʾ� �������� ��ܸ� Ȯ���� �� �ֽ��ϴ�.");
								trade.ViewList();
							} else {
								System.out.println("1~5�� �߿� �������ּ���.");
							}
						}
						System.out.println("���װ� ����Ǿ����ϴ�.");
						league.LeagueInfo(team, 2);
						int league_result = league.Result(2);
						if(league_result == 1) {
							System.out.println("����� ���� 1�θ��׿��� ����� �߽��ϴ�!! ����� �� �ô��� ������ ������ �Ǿ����ϴ�.");
							loop_league++;
						}
						else if(league_result == 0) {
							remain--;
							if(remain<0) {
								System.out.println("����� �����Ǿ����ϴ�...");
								break loop_entire;
							}
							else{
								System.out.println("����� ���� ���׿��� ������� ���߽��ϴ�...    ���� �ܷ� Ƚ��: " + remain + "��");
							}
						}
						
						System.out.println("������ ���� ���������� ���Ƚ��ϴ�. �������忡 �����Ͻðڽ��ϱ�?");
						System.out.println("1)�����Ѵ�  2)�������� �ʴ´�");
						choicetrade = sc.nextInt();
						if(choicetrade==1) {
							Player player;
							int result = trade.Trade(team.money);
							if(result != 0) {
								player = trade.legend_list.get(result-1);
								trade.legend_list.remove(result-1);
								team.team1_list.add(player);
								team.money = team.money - player.money;
								team.TeamInfo();
							}
						}
						else if(choicetrade==2) {
							System.out.println("�������忡 �������� �ʽ��ϴ�.");
						}
						
				}
		
		}
		
		if(victory == 1) {
			process.Ending();
		}
		else if(victory == 0) {
			process.GameOver();
		}
	}

}
