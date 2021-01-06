import java.util.Random;

public class PromTicket {
	
public String Grade, ConfirmNum, NameFirst, NameLast, TicketType;
public int Price;

public PromTicket(String firstName, String lastName, String grade, int people) {
	NameFirst = firstName;
	NameLast = lastName;
	Grade = grade;
	Price = 0;
	if(people==2) {
	TicketType = "couple";
	}
	
	if(people==3||people==4) {
	TicketType = "group";
	}
	
	if(people==1) {
	TicketType = "solo";
	}

		if(Grade.toLowerCase().startsWith("s")&&Grade.toLowerCase().endsWith("r")&&TicketType=="solo") {
			Price = 40;
			return;
		}
		if(Grade.toLowerCase().startsWith("s")&&Grade.toLowerCase().endsWith("r")&&TicketType=="couple") {
			Price = 60;
			return;
		}
		if(Grade.toLowerCase().startsWith("s")&&Grade.toLowerCase().endsWith("r")&&TicketType=="group") {
			Price = 100;
			return;
		}
		
		
		if(Grade.toLowerCase().startsWith("j")&&TicketType=="solo") {
			Price = 45;
			return;
		}
		if(Grade.toLowerCase().startsWith("j")&&TicketType=="couple") {
			Price = 68;
			return;
		}
		if(Grade.toLowerCase().startsWith("j")&&TicketType=="group") {
			Price = 113;
			return;
		}
		
		
		if(Grade.toLowerCase().startsWith("s")&&TicketType=="solo") {
			Price = 55;
			return;
		}
		if(Grade.toLowerCase().startsWith("s")&&TicketType=="couple") {
			Price = 83;
			return;
		}
		if(Grade.toLowerCase().startsWith("s")&&TicketType=="group") {
			Price = 138;
			return;
		}

		
		if(Grade.toLowerCase().startsWith("f")&&TicketType=="solo") {
			Price = 65;
			return;
		}
		if(Grade.toLowerCase().startsWith("f")&&TicketType=="couple") {
			Price = 98;
			return;
		}
		if(Grade.toLowerCase().startsWith("f")&&TicketType=="group") {
			Price = 163;
			return;
		}
	}




    public void Confirmation() {
		String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCase = UpperCase.toLowerCase();
        String digits = "1234567890";
        String Chars = UpperCase + LowerCase + digits;
        int length = 6;
        String randomString = generateRandomString(length, Chars);
        System.out.print(NameFirst+" "+NameLast+" purchased a "+Grade+" "+TicketType+" ticket for $"+Price+".00. The confirmation number for this sale is ");
        System.out.print(randomString);    
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