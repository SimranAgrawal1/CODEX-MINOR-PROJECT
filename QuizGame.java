package practice;
import java.util.Scanner;
public class minor
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int RESULT=0;
		System.out.println("ROUND-1:");
		System.out.println();
		int score=general();
		System.out.println("Score:"+score);
		System.out.println();
		if(score<5)
			RESULT=easy();
		else if(score>5 && score<8)
			RESULT=medium();
		else
			RESULT=tough();
		System.out.println("RESULT IS:"+RESULT);
	}
	public static int general()
	{
		int point=0;
		String[] gen=new String[10];
		gen[0]="In internet terminology IP means";
		gen[1]="The first page of a website is called the?";
		gen[2]="What is the full form of ALU";
		gen[3]="Who is the Father of the Java programming language?";
		gen[4]=" Which IT company got name from Sanfrancisco?";
		gen[5]="What is NIC?";
		gen[6]="Which Indian state implemented 'Cyber Grameen' ?";
		gen[7]=" 'Do no evil' is tag line of ......";
		gen[8]=" What is the expansion of SMS?";
		gen[9]="Which famous web site was found by Jeffry Bezos?";
		String[] solution={"INTERNET PROTOCOL","HOME PAGE","ARITHMETIC LOGIC UNIT","JAMES GOSLING","CISCO","NETWORK INTERFACE CARD","ANDHRA PRADESH","GOOGLE","SHORT MESSAGE SERVICE","AMAZON"};
		for(int i=0;i<=9;i++)
		{
			System.out.println(i+1+"."+gen[i]);
			String s=sc.nextLine();
			if(solution[i].equals(s.toUpperCase()))
			{
				point++;
			}
		}
		return point;
	}
	public static int easy()
	{
		int point=0;
		System.out.println("ROUND-2:");
		System.out.println();
		String[] easy=new String[10];
		easy[0]=" a small piece of text stored on a user's computer by a web browser for maintaining the state. ";
		easy[1]="In computer world,trojan refer to?";
		easy[2]=" Which  company is nicknamed BIG BLUE";
		easy[3]=" The standard protocol of the Internet is";
		easy[4]="What is the full form of ACL?";
		easy[5]="Connecting people is the tagline of ....";
		easy[6]="Whose motto is wisdom of mass principle?";
		easy[7]=" Difference engine was developed by.....";
		easy[8]=" World's first microprocessor is .....";
		easy[9]="What is SQL?";
		String[] solution={"COOKIE","MALWARE","IBM","TCP/IP","ACCESS CONTROL LIST","NOKIA","WIKIPEDIA","CHARLES BABBAGE","INTEL","STRUCTURED QUERY LANGUAGE"};
		for(int i=0;i<=9;i++)
		{
			System.out.println(i+1+"."+easy[i]);
			String s=sc.nextLine();
			if(solution[i].equals(s.toUpperCase()))
			{
				point++;
			}
		}
		return point;

	}
	public static int medium()
	{
		int point=0;
		System.out.println("ROUND-2:");
		System.out.println();
		String[] med=new String[10];
		med[0]=" Which software application is used for accessing sites or information on a network ( as the world wide web)?";
		med[1]=" The infection of AIDS occurs through the contamination of";
		med[2]="What is cotton fiber made of?";
		med[3]="The fathers of the Internet";
		med[4]=" The first web based e-mail sevice? ";
		med[5]="What is the full form of API?";
		med[6]="What is e-zine?";
		med[7]="Who is known as the Human Computer of India?";
		med[8]=" Orkut.com is now owned by ......";
		med[9]=" Green dam is .....";
		String[] solution={"WEB BROWSER","BLOOD","CELLULOSE","VINT CERF"," Hot mail","APPLICATION PROGRAM INTERFACE","ELECTRONIC MAGAZINES","SHAKUNTHALA DEVI","GOOGLE","WEB FILTER"};
		for(int i=0;i<=9;i++)
		{
			System.out.println(i+1+"."+med[i]);
			String s=sc.nextLine();
			if(solution[i].equals(s.toUpperCase()))
			{
				point++;
			}
		}
		return point;

	}
	public static int tough()
	{
		int point=0;
		System.out.println("ROUND-2:");
		System.out.println();
		String[] hard=new String[10];
		hard[0]="Which one is the first fully supported 64-bit operating system?";
		hard[1]="Which protocol is used to send e-mail?";
		hard[2]="The inventor of the World Wide Web?";
		hard[3]="What is the full form of ADC?";
		hard[4]="Who developed first portable computer?";
		hard[5]="Who is the father of computer ethics?";
		hard[6]="Who invented Compact Disc?";
		hard[7]="Longhorn was the code name of ?";
		hard[8]=" Who developed COBOL?";
		hard[9]="What is the 1st graphical game?";
		String[] solution={"LINUX","SMTP","TIM BERNERS LEE","ANALOG TO DIGITAL CONVERTER","ADAM OSBORNE","NORBETWEINER","JAMES T RUSSEL","WINDOWS VISTA","GRACE MURRY HOPPER","TIC TAC TOE"};
		for(int i=0;i<=9;i++)
		{
			System.out.println(i+1+"."+hard[i]);
			String s=sc.nextLine();
			if(solution[i].equals(s.toUpperCase()))
			{
				point++;
			}
		}
		return point;

	}
}
