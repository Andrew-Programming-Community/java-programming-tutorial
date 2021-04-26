package xml.jackson;

import java.io.FileInputStream;
import java.io.InputStream;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		JacksonXmlModule module = new JacksonXmlModule();
		XmlMapper mapper = new XmlMapper(module);
		Book book = mapper.readValue(new FileInputStream("book.xml"), Book.class);
		System.out.println(book.id);
		System.out.println(book.name);
		System.out.println(book.author);
		System.out.println(book.isbn);
		System.out.println(book.tags);
		System.out.println(book.pubDate);
	}
}
