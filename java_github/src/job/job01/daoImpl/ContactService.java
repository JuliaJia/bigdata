package job.job01.daoImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import job.job01.dao.IContact;
import job.job01.entity.Contact;
import job.job01.tool.FileUtil;

public class ContactService implements IContact {
	private FileUtil fileUtil = null;
	private static final String fileName = "F:/study/code/bigdata_github/java_github/xml/JavaXml2.xml";
	public ContactService() {
		try {
			//fileUtil = new FileUtil(fileName);
			fileUtil = new FileUtil(fileName);
			fileUtil.writeLine("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	@Override
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddContact(Contact contact) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<contacts>");
		stringBuilder.append(String.format("<contacts id=\"%s\">", contact.getId()));
		stringBuilder.append(String.format("<name>%s</name>", contact.getRealName()));
		stringBuilder.append(String.format("<mobile>%s</mobile>", contact.getMobile()));
		String groups = String.format("<group><id>%s</id><name>%s</name></group>", contact.getGroup().getId(),contact.getGroup().getGroupName());
		stringBuilder.append(groups);
		stringBuilder.append("</contact>");
		stringBuilder.append("</contacts>");
		try {
			fileUtil.writeLine(stringBuilder.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
