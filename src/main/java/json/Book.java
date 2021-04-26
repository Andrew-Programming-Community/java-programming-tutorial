package json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Book {
	public long id;
	public String name;
	public String author;

	public String isbn;

	public List<String> tags;
	public LocalDate pubDate;
	public BigDecimal price;
}
