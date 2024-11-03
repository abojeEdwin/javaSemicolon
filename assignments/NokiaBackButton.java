import java.util.Scanner;
	public class NokiaBackButton{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter 0 to quit & 1 to proceed !");
int fexit = input.nextInt();

while (fexit != 0){

System.out.println("1.Phone book :");
System.out.println("2.Messages : ");
System.out.println("3.Chat :");
System.out.println("4.Call register :");
System.out.println("5.Tones :");
System.out.println("6.Settings :");
System.out.println("7.Call divert :");
System.out.println("8.Games : ");
System.out.println("9.Calculator :");
System.out.println("10.Reminders :");
System.out.println("11.Clock :");
System.out.println("12.Profiles :");
System.out.println("13.SIM services :");
System.out.println("0. Exit"); 
int menu = input.nextInt();


 if (menu == 0) {
                System.out.println("Bye");
                break;
            }
		
switch(menu){
	case 1:
		System.out.println("1.Search");
		System.out.println("2.Service Nos.");
		System.out.println("3.Add name");
		System.out.println("4.Erase");
		System.out.println("5.Edit");
		System.out.println("6.Assign tone");
		System.out.println("7.Send b' card");
		System.out.println("8.Options");
		System.out.println("9.Speed dail");
		System.out.println("10.Voice tags");
		System.out.println("0.Go back to main menu");
		int phonebook = input.nextInt();

		if(phonebook == 0){
		break;
		}
	switch(phonebook){
		case 1:
			System.out.println("Search");
			System.out.println("0.Go back to main menu");
			if(phonebook == 0){
			break;
			}
			break;
		case 2:
			System.out.println("Service Nos.");
			break;
		case 3:
			System.out.println("Add name");
			break;
		case 4:
			System.out.println("Erase");
			break;
		case 5:
			System.out.println("Edit");
			break;
		case 6:
			System.out.println("Assign tone");
			break;
		case 7:
			System.out.println("Send b' card");
			break;
		case 8:
			System.out.println("Options");
			int opt = input.nextInt();
	switch(opt){
		case 1:
			System.out.println("Type of view");
			break;
		case 2:
			System.out.println("Memory status");
			break;
		}
			break;
		case 9:
			System.out.println("Speed dail");
			break;
		case 10:
			System.out.println("Voice tags");
			break;
		}
			break;
	case 2: 
		System.out.println("1.Write message");
		System.out.println("2.Inbox");
		System.out.println("3.Outbox");
		System.out.println("4.Picture messages");
		System.out.println("5.Templates");
		System.out.println("6.Smileys");
		System.out.println("7.Message settings");
		System.out.println("8.Info service");
		System.out.println("9.Voice mailbox");
		System.out.println("10.Service command editor");
		System.out.println("0.Go back to main menu");
		int msg = input.nextInt();

		if(msg == 0){
			break;
		}
	switch(msg){
		case 1:
			System.out.println("Write message");
			break;
		case 2:
			System.out.println("Inbox");
			break;
		case 3:
			System.out.println("Outbox");	
			break;
		case 4:
			System.out.println("Picture messages");
			break;
		case 5:
			System.out.println("Templates");
			break;
		case 6:
			System.out.println("Smileys");
			break;
		case 7:
			System.out.println("Message settings");
			break;
		case 8:
			System.out.println("Info service");
			break;
		case 9:
			System.out.println("Voice mailbox number");
			break;
		case 10:
			System.out.print("Service command editor");
			break;	
		}
			break;

	case 3:
		System.out.println("Chat");
		System.out.println("0.Go back to main menu");
		int chat = input.nextInt();
	
		if(chat == 0){
			break;	
		}
	switch(chat){
			case 1:
				System.out.println("Chat");
				break;
		}
				break;

		case 4:
		System.out.println("1'Missed calls");
		System.out.println("2.Recieved calls");
		System.out.println("3.Dailled number");
		System.out.println("4.Erase recent call lists");
		System.out.println("5.Show call duration");
		System.out.println("6.Show call cost");
		System.out.println("7.Call cost settings");
		System.out.println("8.Prepaid credit");
		System.out.println("0.Go back to main menu");
		int Callregister = input.nextInt();
		
		if (Callregister == 0){
			break;
			}
		switch(Callregister){
			case 1:
				System.out.println("1.Missed calls");
				break;
			case 2:
				System.out.println("2.Recieved calls");
				break;
			case 3:
				System.out.println("3.Dailled number");
				break;
			case 4:
				System.out.println("4.Erase recent call lists");
				break;
			case 5:
				System.out.println("5.Show call duration");
				System.out.println("0.Go back to main menu");
				int calllog = input.nextInt();
				
				if(calllog == 0){
					break;
				}
			switch(calllog){
						case 1:
							System.out.println("1.Last call duration");
							break;
						case 2:
							System.out.println("2.All calls duration");
							break;
						case 3:
							System.out.println("3.Received calls duration");
							break;
						case 4:
							System.out.println("4.Dailed calls duration");
							break;
						case 5:
							System.out.println("5.Clear timers");
							break;
						}	
							break;			
			case 6:
				System.out.println("1.Show call cost");
				System.out.println("0.Go back to main menu");
				int callme = input.nextInt();
				
			if(callme == 0){
				break;
			}
			switch(callme){
						case 1:
							System.out.println("1.Last call cost");
							break;
						case 2:
							System.out.println("2.All calls cost");
							break;
						case 3:
							System.out.println("3.Clear counters");
							break;
							}
								break;
			case 7:
				System.out.println("1.Call cost settings");
				System.out.println("0.Go back to main menu");
				int callcost = input.nextInt();

				if(callcost == 0){
					break;
					}
					switch(callcost){
						case 1:
							System.out.println("1.Call cost limit");
							break;
						case 2:
							System.out.println("2.Show cost in");
							break;
						}
							break;
			case 8:
				System.out.println("1.Prepaid credit");
				break;
			}
				break;
	case 5:
		System.out.println("1.Ringing tone");
		System.out.println("2.Ringing volume");
		System.out.println("3.Incoming call alert");
		System.out.println("4.Composer");
		System.out.println("5.Message alert tone");
		System.out.println("6.Keypad tones");
		System.out.println("7.Warning and games tones");
		System.out.println("8.Vibrating alert");
		System.out.println("9.Screen saver");
		System.out.println("0.Go back to main menu");
		int tones = input.nextInt();
			
		if(tones == 0){
			break;
			}
switch(tones){
		case 1:
			System.out.println("1.Ringing tone");
			break;
		case 2:
			System.out.println("2.Ringing volume");
			break;
		case 3:
			System.out.println("3.incoming call alert");
			break;
		case 4:
			System.out.println("4.Composer");
			break;
		case 5:
			System.out.println("5.Message alert tone");
			break;
		case 6:
			System.out.println("6.Keypad tones");
			break;
		case 7:
			System.out.println("7.Warning and games tones");
			break;
		case 8:
			System.out.println("8.Vibrating alert");
			break;
		case 9:
			System.out.println("9.Screen saver");
			break;
		}
			break;
	case 6:
	System.out.println("1.Call settings");
	System.out.println("2.Phone settings");
	System.out.println("3.Security settings");
	System.out.println("4.Restore factory settings");
	System.out.println("0.Go back to main menu");
	int settings = input.nextInt();

	if(settings == 0){
		break;
		}
switch(settings){
			case 1:
				System.out.println("1.Automatic redail");
				System.out.println("2.Speed dailing");
				System.out.println("3.Call waiting options");
				System.out.println("4.Own number sending");
				System.out.println("5.Phone line in use");
				System.out.println("6.Automatic answer");
				System.out.println("0.Go back to main menu");
				int callsettings = input.nextInt();

				if(callsettings == 0){
					break;
				}
			switch(callsettings){
						case 1:
							System.out.println("Automatic redail");
							break;
						case 2:
							System.out.println("Speed dailing");
							break;
						case 3:
							System.out.println("Call waiting options");
							break;
						case 4:
							System.out.println("Own number sending");
							break;
						case 5:
							System.out.println("Phone line in use");
							break;
						case 6:
							System.out.println("Automatic answer");
							break;		
						}
							break;
					case 2:
							System.out.println("1.Language");
							System.out.println("2.Cell info display");
							System.out.println("3.Welcome note");
							System.out.println("4.Network selection");
							System.out.println("5.Lights");
							System.out.println("6.Confirm Sim service actions");
							System.out.println("0.Go back to main menu");
							int phonesettings = input.nextInt();

							if(phonesettings == 0){
								break;
								}
					switch(phonesettings){
							case 1:
								System.out.println("1.Language");
								break;
							case 2:
								System.out.println("2.Cell info display");
								break;
							case 3:
								System.out.println("3.Welcome note");
								break;
							case 4:
								System.out.println("4.Network selection");
								break;
							case 5:
								System.out.println("5.Lights");
								break;
							case 6:
								System.out.println("6.Confirm sim service actions");
								break;
								}
									break;
					case 3:
						System.out.println("1.Pin code request");
						System.out.println("2.Call barring service");
						System.out.println("3.Fixed dailing");
						System.out.println("4.Closed user group");
						System.out.println("5.Phone security");
						System.out.println("6.Change access codes");
						System.out.println("0.Go back to main menu");
						int securitysettings = input.nextInt();

						if(securitysettings == 0){
								break;
							}
					switch(securitysettings){
							case 1:
								System.out.println("1.Pin code request");
								break;
							case 2:
								System.out.println("2.Call barring sevice");
								break;
							case 3:
								System.out.println("3.Fixed dailing");
								break;
							case 4:
								System.out.println("4.Closed user group");
								break;
							case 5:
								System.out.println("5.Phone security");
								break;
							case 6:
								System.out.println("Change access codes");
								break;
								}
									break;
					case 4:
						System.out.println("Restore factory settings");
						System.out.println("0.Go back to main menu");
						break;
					}
	case 7:
			System.out.println("1.Call divert");
			System.out.println("0.Go back to main menu");
			break;
	case 8:
			System.out.println("1.Games");
			System.out.println("0.Go back to main menu");
			break;
	case 9:
			System.out.println("1.Calculator");
			System.out.println("0.Go back to main menu");
			break;
	case 10:
			System.out.println("1.Reminders");
			System.out.println("0.Go back to main menu");

			break;
	case 11 :
			System.out.println("1.Alarm clock");
			System.out.println("2.Clock settings");
			System.out.println("3.Date settings");
			System.out.println("4.Stop settings");
			System.out.println("5.Stopwatch");
			System.out.println("6.Countdown timer");
			System.out.println("7.Auto update of date");
			System.out.println("0.Go back to main menu");
			int clock = input.nextInt();
			

			if(clock == 0){
				break;
			}
			switch(clock){
				case 1:
					System.out.println("1.Alarm clock");
					break;
				case 2:
					System.out.println("2.Clock settings");
					break;
				case 3:
					System.out.println("3.Date settings");
					break;
				case 4:
					System.out.println("4.Stop settings");
					break;
				case 5:
					System.out.println("5.Stopwatch");
					break;
				case 6:
					System.out.println("Countdown timer");
					break;
				case 7:
					System.out.println("Auto update of date");
					break;
				}
		case 12:
			System.out.println("Profile");
			System.out.println("0.Go back to main menu");
			break;

		case 13:
			System.out.println("SIM services");
			System.out.println("0.Go back to main menu");
			break;
			}
			





	}
}
}	

















