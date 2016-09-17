package State;

public class MM {
	private String name;
    private MMState  mstate =new MHappyState();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  void cry(){
		mstate.cry();
	}
	public  void say(){
		mstate.say();
	}
	public  void smile(){
		mstate.smile();
	}
  
}
