package main;

import java.util.Scanner;

import player.Player;
// 진행상황 - 1부리그까지 대략적인 틀 완성.
// 추가 항목 - 유저 스탯 증가 메소드 만들기, 스태미너 소모 로직 넣기, 스태미너 자동 회복 스레드 적용, 선수 훈련 스레드 적용, 페널티킥 스레드 적용  
//         --> 그리고 마지막으로 후반전 만들기 --> 테스트 후 영상 찍기
public class Main {

	public static void main(String[] args) {
		Process process = new Process();
		process.StartText();
		GameProcess gamestart = new GameProcess();
		League league = new League();
		Trade trade = new Trade();
		process.Explain();
		Scanner scan = new Scanner(System.in);
		System.out.println("감독 이름을 정해주세요.");
		String manager_name = scan.nextLine();
		System.out.println("팀 이름을 정해주세요.");
		String team_name = scan.nextLine();
		Team team = new Team(manager_name, team_name);
		team.TeamInfo();
		System.out.println("3부리그가 시작되었습니다!!");
		league.LeagueInfo(team, 3);
		Scanner sc = new Scanner(System.in);
		int choicetrade;
		
		int loop_menu;
		int loop_league;
		int choice;
		int remain;
		int victory=0;
		// 3부 1경기
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
				System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
				trade.ViewList();
			} else {
				System.out.println("1~5번 중에 선택해주세요.");
			}
		}
		league.LeagueInfo(team, 3);
		
		
		// 3부 2경기
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
						System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
						trade.ViewList();
					} else {
						System.out.println("1~5번 중에 선택해주세요.");
					}
				}
				league.LeagueInfo(team, 3);
				//3부 3경기
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
						System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
						trade.ViewList();
					} else {
						System.out.println("1~5번 중에 선택해주세요.");
					}
				}
				System.out.println("리그가 종료되었습니다.");
				league.LeagueInfo(team, 3);
				int league_result = league.Result(3);
				if(league_result == 1) {
					System.out.println("당신의 팀이 3부리그에서 우승을 했습니다!! 당신의 팀은 2부리그로 승격하게 됩니다.");
					loop_league++;
				}
				else if(league_result == 0) {
					remain--;
					if(remain<0) {
						System.out.println("당신은 경질되었습니다...");
						break loop_entire;
					}
					else{
						System.out.println("당신의 팀이 리그에서 우승하지 못했습니다...    남은 잔류 횟수: " + remain + "번");
					}
				}
				
				System.out.println("시즌이 끝나 이적시장이 열렸습니다. 이적시장에 참여하시겠습니까?");
				System.out.println("1)참여한다  2)참여하지 않는다");
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
					System.out.println("이적시장에 참여하지 않습니다.");
				}
				
		}
		
		// 2부리그 시작
		
		System.out.println("2부리그가 시작되었습니다!!");
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
				System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
				trade.ViewList();
			} else {
				System.out.println("1~5번 중에 선택해주세요.");
			}
		}
		league.LeagueInfo(team, 3);
		
		
		// 3부 2경기
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
						System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
						trade.ViewList();
					} else {
						System.out.println("1~5번 중에 선택해주세요.");
					}
				}
				league.LeagueInfo(team, 3);
				//3부 3경기
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
						System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
						trade.ViewList();
					} else {
						System.out.println("1~5번 중에 선택해주세요.");
					}
				}
				System.out.println("리그가 종료되었습니다.");
				league.LeagueInfo(team, 2);
				int league_result = league.Result(2);
				if(league_result == 1) {
					System.out.println("당신의 팀이 2부리그에서 우승을 했습니다!! 당신의 팀은 1부리그로 승격하게 됩니다.");
					loop_league++;
				}
				else if(league_result == 0) {
					remain--;
					if(remain<0) {
						System.out.println("당신은 경질되었습니다...");
						break loop_entire;
					}
					else{
						System.out.println("당신의 팀이 리그에서 우승하지 못했습니다...    남은 잔류 횟수: " + remain + "번");
					}
				}
				
				System.out.println("시즌이 끝나 이적시장이 열렸습니다. 이적시장에 참여하시겠습니까?");
				System.out.println("1)참여한다  2)참여하지 않는다");
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
					System.out.println("이적시장에 참여하지 않습니다.");
				}
				
		}
		
		// 1부리그 시작
		
				System.out.println("1부리그가 시작되었습니다!!");
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
						System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
						trade.ViewList();
					} else {
						System.out.println("1~5번 중에 선택해주세요.");
					}
				}
				league.LeagueInfo(team, 3);
				
				
				// 3부 2경기
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
								System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
								trade.ViewList();
							} else {
								System.out.println("1~5번 중에 선택해주세요.");
							}
						}
						league.LeagueInfo(team, 3);
						//3부 3경기
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
								System.out.println("시즌이 끝나지 않아 이적시장 명단만 확인할 수 있습니다.");
								trade.ViewList();
							} else {
								System.out.println("1~5번 중에 선택해주세요.");
							}
						}
						System.out.println("리그가 종료되었습니다.");
						league.LeagueInfo(team, 2);
						int league_result = league.Result(2);
						if(league_result == 1) {
							System.out.println("당신의 팀이 1부리그에서 우승을 했습니다!! 당신은 이 시대의 진정한 감독이 되었습니다.");
							loop_league++;
						}
						else if(league_result == 0) {
							remain--;
							if(remain<0) {
								System.out.println("당신은 경질되었습니다...");
								break loop_entire;
							}
							else{
								System.out.println("당신의 팀이 리그에서 우승하지 못했습니다...    남은 잔류 횟수: " + remain + "번");
							}
						}
						
						System.out.println("시즌이 끝나 이적시장이 열렸습니다. 이적시장에 참여하시겠습니까?");
						System.out.println("1)참여한다  2)참여하지 않는다");
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
							System.out.println("이적시장에 참여하지 않습니다.");
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
