package job.job01.view;

import java.io.IOException;


import job.job01.biz.ContactManager;
import job.job01.entity.Contact;
import job.job01.entity.Group;

public class Test {
	public static void main(String[] args) throws IOException {
		ContactManager biz = new ContactManager();
		Group group1 = new Group(1,"逗逼长老");
		Group group2 = new Group(2,"逗逼门徒");
		Group group3 = new Group(3,"逗逼神兽");
		
		Contact contact1 = new Contact(1,"碎心印","sbsbsbsbsb",group1);
		Contact contact2 = new Contact(2,"张三","18888888",group2);
		Contact contact3 = new Contact(3,"李四","16666666",group3);
		System.out.println("开始逗逼...");
		biz.AddContact(contact1);
		biz.AddContact(contact2);
		biz.AddContact(contact3);
		System.out.println("逗逼结束...");
		
	}

}
