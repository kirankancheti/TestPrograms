public class Human implements Comparable<Human> {
    private int age;
    private String name;
    
    public Human(String givenName, int age) {
        this.name = givenName;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String introduce() {
        return "Hey! I'm " + name + " and I'm " + age + " years old.";
    }

	@Override
	public int compareTo(Human arg0) {
		// TODO Auto-generated method stub
		
		return this.age-arg0.age;
	}
    
    // Hint: Implement the method required by the Comparable Interface 
    // using age as the differentiator
}