
public class testClass {

  protected int width;
  protected int high;
	 
  public testClass(int w, int h)
  {
	  width = w;
	  high = h;
  }
  
  public void draw()
  {
	  for(int i=width; i>0; i--)
	     System.out.println("#");
	  System.out.println();
	  
	  for(int i=high-2;i>0;i--)
	  {
		 System.out.println("#");
         for(int j=width-2;j>0;j--)
        	 System.out.println("#");
         System.out.println("#\n");
	  }
	  for(int i=width; i>0; i--)
		     System.out.printf("#");
	  System.out.println();
  }

}
