package swithCase;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class nestedSwitchCase {
	
	void bankOperation (String bank, String op) {
		
		switch(bank) {
		case "ICICI" :
			if(op.equals("Debit"))
				System.out.println("Debit Operation Performed");
			else if(op.equals("Credit"))
				System.out.println("Credit Operation Performed");
			break;
		case "HDFC" :
			switch(op) {
			case "debit":
				System.out.println("HDFC Debit Operation Performed");
				break;
			case "credit":
				System.out.println("HDFC Credit Operation Performed");
				break;
			}
		default :
			System.out.println("default ");
		}
	}
	
	public static void main(String[] args) {
		nestedSwitchCase ns = new nestedSwitchCase();
		ns.bankOperation("HDFC", "debit");
	}

}
