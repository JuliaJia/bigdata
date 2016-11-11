package job.job01.biz;

import java.io.IOException;
import java.util.List;

import job.job01.dao.IContact;
import job.job01.daoImpl.ContactService;
import job.job01.entity.Contact;

public class ContactManager {
	private IContact dao = null;
	public ContactManager() throws IOException{
		dao = new ContactService();
	}
	
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return dao.getContactById(id);
	}

	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
	}

	public void AddContact(Contact contact) {
		dao.AddContact(contact);

	}
}
