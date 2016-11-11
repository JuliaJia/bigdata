package job.job01.entity;

import job.job01.entity.Group;

public class Contact {
	
	private int id;
	private String realName;
	private String mobile;
	private Group group;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Contact(int id, String realName, String mobile,Group group) {
		super();
		this.id = id;
		this.realName = realName;
		this.mobile = mobile;
		this.group = group;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Contact [id=" + id + ", realName=" + realName + ", mobile=" + mobile + ", group=" + group + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
