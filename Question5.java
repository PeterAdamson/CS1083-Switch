public class Question5{

	private String stmt1 = "The quick brown bear jumps over the lazy dog.";
	private String stmt2 = "The grizzly fox.";

	public void Switch_Animal_Names(){
		stmt1 = stmt1.replace("bear", "fox");
		stmt2 = stmt2.replace("fox", "bear");
		System.out.println(stmt1);
		System.out.println(stmt2);
	}	
}
