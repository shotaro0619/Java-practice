package polymorphism.human;

public class Human {
	private String name;
	protected int age;
	protected int score;
	

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	final public String getName () {
		return this.name;
	}
	
	public int getAge () {
		return this.age;
	};
	
	public int getScore () {
		return this.score;
	};
	
	public String getProfile() {
		return "名前は" + this.name + "年齢は" + this.age + "です。";
	}

}
