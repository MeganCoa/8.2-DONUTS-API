package co.grandcircus.APIOne;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("One")

public class One {
	@Id
	private String id;
}
