package json;

import java.io.FileInputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Main {

	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());

		//反序列化
		Book book = mapper.readValue(new FileInputStream("book.json"), Book.class);
		System.out.println(book.id);
		System.out.println(book.name);
		System.out.println(book.author);
		System.out.println(book.isbn);
		System.out.println(book.tags);
		System.out.println(book.pubDate);
		System.out.println(book.price);
		// 序列化为JSON:
		String json = mapper.writeValueAsString(book);
		System.out.println(json);
	}
}
