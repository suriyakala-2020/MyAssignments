package week2.day4.task4;

public class LoginPage extends BasePage{
LoginPage(){
	this.page="LoginPage";
}
void performCommonTasks() {
	System.out.println("Perform Task in "+page);
}
}
