package job.job01.biz;

import java.security.acl.Group;
import java.util.List;

import job.job01.dao.IGroup;
import job.job01.daoImpl.GroupService;

public class GrouopManager {
	private IGroup dao = null;
	public GrouopManager(){
		dao = new GroupService();
	}
	public Group getGroupById(int id) {
		return dao.getGroupById(id);
	}

	public List<Group> getAllGroups() {
		// TODO Auto-generated method stub
		return dao.getAllGroups();
	}
}
