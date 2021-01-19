package promTickets;
import java.util.Random;
import java.util.Scanner;

public class PromTickets {
	
public String ConfirmNum, name, TicketType, grade;
public int Price, people, Grade;

public PromTickets() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter your name.");
	name = scanner.nextLine();
	
	
	System.out.println("Please select a grade.");
	System.out.println("1 = Senior");
	System.out.println("2 = Junior");
	System.out.println("3 = Sophomore");
	System.out.println("4 = Freshman");
	Grade = scanner.nextInt();
	
	System.out.println("Please enter number of people(1-4)");
	people = scanner.nextInt();
	
	scanner.close();
	
	Price = 0;

	
	if(Grade==1) {
		grade = "senior";
	}
	if(Grade==2) {
		grade = "junior";
	}
	if(Grade==3) {
		grade = "sophomore";
	}
	if(Grade==4) {
		grade = "freshman";
	}
	
	

	if(people==2) {
	TicketType = "couple";
	}
	
	if(people==3||people==4) {
	TicketType = "group";
	}
	
	if(people==1) {
	TicketType = "solo";
	}
	
	
	if(Grade==1)

		if(Grade==1&&TicketType=="solo") {
			Price = 40;
		}
		if(Grade==1&&TicketType=="couple") {
			Price = 60;
		}
		if(Grade==1&&TicketType=="group") {
			Price = 100;
		}
		
		
		if(Grade==2&&TicketType=="solo") {
			Price = 45;
		}
		if(Grade==2&&TicketType=="couple") {
			Price = 68;
		}
		if(Grade==2&&TicketType=="group") {
			Price = 113;
		}
		
		
		if(Grade==3&&TicketType=="solo") {
			Price = 55;
		}
		if(Grade==3&&TicketType=="couple") {
			Price = 83;
		}
		if(Grade==3&&TicketType=="group") {
			Price = 138;
		}

		
		if(Grade==4&&TicketType=="solo") {
			Price = 65;
		}
		if(Grade==4&&TicketType=="couple") {
			Price = 98;
		}
		if(Grade==4&&TicketType=="group") {
			Price = 163;
		}
		Confirm();
	}

	public void Confirm() {
		String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCase = UpperCase.toLowerCase();
        String digits = "1234567890";
        String Chars = UpperCase + LowerCase + digits;
        int length = 6;
        String randomString = generateRandomString(length, Chars);
 
        System.out.println(name+" purchased a "+grade+" "+TicketType+" ticket for $"+Price+".00."
        		+ " The Confirmation number for this purchase is "+randomString);
 
    }
 
    private static String generateRandomString(int length, String seedChars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Random rand = new Random();
        while (i < length) {
            sb.append(seedChars.charAt(rand.nextInt(seedChars.length())));
            i++;
        }
        return sb.toString();
        
    }
}