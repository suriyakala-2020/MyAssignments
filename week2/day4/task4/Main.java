package week2.day4.task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasePage bp=new BasePage();
LoginPage lp =new LoginPage();
bp.findElement();
bp.clickElement();
bp.enterText();
bp.performCommonTasks();
System.out.println("===============================================");
lp.findElement();
lp.clickElement();
lp.enterText();
lp.performCommonTasks();
	}

}
