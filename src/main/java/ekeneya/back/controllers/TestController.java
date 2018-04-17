package ekeneya.back.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Test>> getVilles() {
		List<Test> lists = new ArrayList<>();
		lists.add(new Test("2","nom 2zeze"));
		lists.add(new Test("1","nom 1zezee"));
		return ResponseEntity.ok(lists);
	}
	
}
