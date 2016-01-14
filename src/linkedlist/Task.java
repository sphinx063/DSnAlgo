package linkedlist;
public class Task {

	private String taskName;
	private String taskID;
	public Task dependency[];
	public int link;
	public boolean started;
	public boolean finished;
	public Task(String name,String ID){
		taskName=name;
		taskID=ID;
	}
	
}
