package week2.day4;

public class Loading {
	
public void reportStep(String msg, String status){
	System.out.println("First Version Running");
	System.out.println(msg+" "+status);
}

public void reportStep(String msg, String status,boolean snap){
	System.out.println("Second Version Running");
	System.out.println(msg+" "+status);
	if (snap) 
		System.out.println("Snapshot taken");
	else
		System.out.println("no Snapshot taken");
}


public static void main(String[] args) {
	Loading load=new Loading();
	load.reportStep("process", "completed");
	System.out.println("============================");
	load.reportStep("process", "Still Running", true);
}
}
