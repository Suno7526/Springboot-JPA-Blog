package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일)
// @Controller

//사용자가 요청 -> 응답(Data)

@RestController
public class HttpControllerTest {

	private static final String TAG="HttpControllerTest: ";
	// http://localhost:8000/blog/http/lombok
	//.username("ssar").password("1234").email("ssar@nate.com").build();
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
		System.out.println(TAG + "getter : " + m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG + "setter : "+m.getUsername());
		return "lombok test 완료";
	}
	
	@GetMapping("/temp/img")
	public String tempImg() {
		return "png";
	}
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		return "index";
	}
	
	// 인터넷 브라우저 요청은 get 요청 밖에 사용할 수 없다
	// http://localhost:8080/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		System.out.println(TAG + "getter : " + m.getId());
		m.setId(5000);
		System.out.println(TAG + "setter : "+m.getId());
		Member m1 = new Member(1,"ssar", "1234","email");
		return "get 요청: "+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	// http://localhost:8080/http/post (insert)
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) {
		return "post 요청: "+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	// http://localhost:8080/http/put (update)
	@PutMapping("http/put")
	public String putTest() {
		return "put 요청";
	}
	// http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delet")
	public String deleteTest() {
		return "delete 요청";
	}
}
