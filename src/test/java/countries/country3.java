package countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class country3 {
  @Test
  public void ind()
  {
	  String name ="india";
	  Assert.assertEquals(name, "india");
	  System.out.println("the countey name is "+name);
	  
  }
  @Test
  public void ban()
  {
	  String name ="bangladesh";
	  Assert.assertEquals(name, "bangladesh");
	  System.out.println("the countey name is "+name);
	  
  }
  @Test
  public void sl()
  {
	  String name ="srilanka";
	  Assert.assertEquals(name, "srilanka");
	  System.out.println("the countey name is "+name);
	  
  }
  @Test
  public void aus()
  {
	  String name ="austrila";
	  Assert.assertEquals(name, "austrila");
	  System.out.println("the countey name is "+name);
	  
  }
  @Test
  public void wi()
  {
	  String name ="westindies";
	  Assert.assertEquals(name, "westindies");
	  System.out.println("the countey name is "+name);
	  
  }
  @Test
  public void pak()
  {
	  String name ="pakistan";
	  Assert.assertEquals(name, "pakistan");
	  System.out.println("the countey name is "+name);
	  
  }
  @Test
  public void nz()
  {
	  String name ="newzland";
	  Assert.assertEquals(name, "newzland");
	  System.out.println("the countey name is "+name);
	  
  }
}
