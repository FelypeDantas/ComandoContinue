
public class TesteContinue {
  public static void main(String args[]) {
	  int i,vt[] = {1,2,3,4,5};
	  
	  for(i=0; i<5; i++) {
		  if(i % 2 != 0) {
			  continue;
		  }
		  else {
			  System.out.println("Os valores são: " + vt[i]);
		  }
	  }
  }
}
