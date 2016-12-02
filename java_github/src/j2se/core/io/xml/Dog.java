package j2se.core.io.xml;

public class Dog {
	private String dogName;
	private int ID;
	private int health;
	private int love;
	private String strain;
	private String masterName;
	private int masterPhone;

	public String getMasterName() {
		return masterName;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public int getMasterPhone() {
		return masterPhone;
	}
	public void setMasterPhone(int masterPhone) {
		this.masterPhone = masterPhone;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", ID=" + ID + ", health=" + health + ", love=" + love + ", strain=" + strain
				+ ", masterName=" + masterName + ", masterPhone=" + masterPhone + "]";
	}



}
