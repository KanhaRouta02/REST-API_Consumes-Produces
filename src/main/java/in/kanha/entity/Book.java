package in.kanha.entity;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Book {

	private Integer id;
	private String name;
	private String author;
}
