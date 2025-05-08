package exceptionHandling.throwthrows;

import java.io.IOException;

public class throw1 {
	void m1(String browser) throws IOException, customeException  {
		if (browser.equals("Chrome")){
		System.out.println("Chrome Browser started");
	}else if(browser.equals("Edge")) {
		System.out.println("Chrome Browser started");
	}else if(browser.equals("FF"))
	{
		System.out.println("Firefox started");
	}else
	{
		throw new customeException("Incorrect browser "+browser+"");
	}
	}
	public static void main(String[] args) throws customeException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Start");
		throw1 t = new throw1();
		try {
		t.m1("ccc");
		}
		catch(IOException ee){
			t.m1("Chrome");
			System.out.println("Handled " +ee.getMessage());
			
		}
	}

}
