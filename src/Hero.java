class Hero {
	private String name;
	private String GName;
	private String Power;
	private String speak;

	void setName(String newName) {
		name = newName;
		System.out.println(newName);
	}

	String getName() {
		// return name;
		//GName = getName;
		//System.out.println(GName);
		return name;
	}

	String getPower(String WPower) {
		
		return Power;
	}
	String setPower(String setPower) {
		Power = setPower;
		System.out.println(setPower);
		return setPower;
	}
	void Speak() {
	
		System.out.println("Hello "+name +" What is your power?"+ " "+ Power);
	}
}
