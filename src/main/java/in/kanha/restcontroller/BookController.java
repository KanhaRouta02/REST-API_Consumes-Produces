package in.kanha.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.kanha.entity.Book;

@RestController
public class BookController {

	@PostMapping(value="/book",
			     consumes = "APPLICATION/JSON")
	public ResponseEntity<String> save(@RequestBody Book b)
	{
		System.out.println(b);
		return new ResponseEntity<String>("Saved", HttpStatus.CREATED); 
	}
	
	
	
	@GetMapping(value = "/book",
			    produces = {"application/xml" , "application/json"}     )
	                        
	public Book getBook()
	{
		Book b = new Book();
		b.setId(101);
		b.setName("java");
		b.setAuthor("Alok");
		
		return b;
	}
}
