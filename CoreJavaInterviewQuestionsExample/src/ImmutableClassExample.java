
public final class  ImmutableClassExample {

	private  String name;
	private  Integer age;
	private  Long number;
	private  String Address;
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public Long getNumber() {
		return number;
	}
	
	public String getAddress() {
		return Address;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ImmutableClassExample() {}
	public ImmutableClassExample(String name, Integer age, Long number, String address) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		Address = address;
	}
	
	
	
	

}
