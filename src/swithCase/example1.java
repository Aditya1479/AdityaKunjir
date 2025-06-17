package swithCase;

public class example1 {

	void start(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome Browser");
		}
		if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Firefox browser");
		}
		if (browser.equalsIgnoreCase("edge")) {
			System.out.println("edge browser");
		}

		switch (browser) {
		case "Chrome":
			System.out.println("Launch chrome Browser");
			break;

		case "Firefox":
			System.out.println("Launch Firefox Browser");
			break;

		case "Edge":
			System.out.println("Launch Edge Browser");

		default:
			System.out.println("invalid browser");
			break;
		}

		int num = 0;
		switch (num) {
		case 0:
			System.out.println("it is 0 number");
			break;

		case 1:
			System.out.println("it is 1 number");
			break;
		case 2:
			System.out.println("it is 2 number");
			break;
		case 3:
			System.out.println("it is 3 number");
			break;
		}

		int percentage = 95;
		switch(percentage) {
		
		case 0 :
			System.out.println("Grade: A");
			break;
		}
		
		
		
		
	}
	int testYourKnowledge (String name) {
		switch(name) {
		case"techno":
		return 10;
		
		case "Credits":
		return 0;
		
		default:
		return -1;
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1 e = new example1();
		e.start("Firefox");
		int testYourKnowledgeoutput= e.testYourKnowledge("techno");
		System.out.println(testYourKnowledgeoutput);
	
	}

}
