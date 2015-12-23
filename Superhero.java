
public class Superhero extends Human{
	
	
	
	String alterEgo;
	
	  public Superhero(String givenName, int age,String alterEgo) {
	        super(givenName, age);
	        this.alterEgo=alterEgo;
	    }
	  
	  public String introduce() {
		  super.introduce();
		        return "Hey! I'm " + alterEgo;
	    }
	    
	    public String getAlterEgo() {
	        return alterEgo;
	    }

}
