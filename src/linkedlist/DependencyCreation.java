package linkedlist;

public class DependencyCreation {
	
	Task task1=new Task("A","A1");
	
	Task task2=new Task("B","B1");
	
	Task task3=new Task("C","C1");
	
	public void injectDependency(Task task1, Task task2){
		
		task1.dependency[task1.link]=task2;
		task1.link+=1;
	}

	public boolean isThereALoop(Task A){
		
		
		if(A.started==true){
			A.finished=true;
			return true;
		}
		else{
		
		 //A.started=true;
		
		Task temp=A;
		int i=0;
		while(i<temp.dependency.length){
			isThereALoop(temp.dependency[i]);
		}
		
		return false;
		}
	}
	
	
	public void isLoop ( ){
		
		
		isLoopVisited( task1);
		
		 
	}
	
	private boolean isLoopVisited( Task temp){
		
		if( temp.finished == true){
			
			return true;
		}else{
			
			temp.finished = true;
			
			return false;
		}
	}
}
