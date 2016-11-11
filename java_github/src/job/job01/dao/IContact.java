package job.job01.dao;

import java.util.List;


import job.job01.entity.Contact;

public interface IContact {
	public Contact getContactById(int id);
	public List<Contact> getAllContacts();
	public void AddContact(Contact contact);

}
