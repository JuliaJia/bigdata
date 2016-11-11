package job;





import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.stream.XMLOutputFactory;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.adapters.XML4JDOMAdapter;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Job1 {
	private static final String FILEPATH = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		Book[] books = new Book[]{
				new Book("1","���Ʊ���"),
				new Book("2","����ʥ��"),
				new Book("3","�������������ɵ�")
				
		};
		Job1 j2x = new Job1();
		System.out.println("����ͼ������ڴ�����...");
		j2x.buildXmlDoc(books);
		System.out.println("����ͼ����ѽ��ɣ�");

	}
	private void buildXmlDoc(Book[] books) throws  IOException{
		Element root = new Element("books").setAttribute("count","4");
		Document doc = new Document(root);
		for(int i = 0;i < books.length;i++){
			Element element = new Element("book");
			element.addContent(new Element("id").setText(books[i].getBook_id()));
			element.addContent(new Element("name").setText(books[i].getBook_name()));
			root.addContent(element);
			
		}
		Format format = Format.getPrettyFormat();
		XMLOutputter xmlOut = new XMLOutputter(format);
		xmlOut.output(doc, new FileOutputStream(FILEPATH + "/txt/test.xml"));
		
		
	}

}

class Book{
	String name;
	String ID;
	public Book(){}
	public Book(String name,String ID){
		this.name = name;
		this.ID = ID;
	}
	public String getBook_name() {
		// TODO Auto-generated method stub
		return ID;
	}
	public String getBook_id() {
		// TODO Auto-generated method stub
		return name;
	}
}
