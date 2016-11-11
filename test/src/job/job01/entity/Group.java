package job.job01.entity;


public class Group {
	
	
	private int id;
	private String groupName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	

	public Group(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", groupName=" + groupName + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}