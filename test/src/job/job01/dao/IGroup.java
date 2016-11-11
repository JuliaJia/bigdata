package job.job01.dao;

import java.util.List;
import java.security.acl.Group;

public interface IGroup {
	public Group getGroupById(int id);
	public List<Group> getAllGroups();

}
