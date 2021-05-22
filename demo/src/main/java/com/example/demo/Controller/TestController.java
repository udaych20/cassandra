package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Uday;
import com.example.demo.repository.UdayRepo;

@RestController("uday")
public class TestController {

	@Autowired
	UdayRepo udayRepo;

	@PostMapping("save")
	public String saveData(@RequestBody Uday uday) {
		udayRepo.save(uday);
		return "success";
	}

	@PostMapping("getAllRecords")
	public List<Uday> getAllRecords() {
		return udayRepo.findAll();
	}

	@PostMapping("getRecordById")
	public Uday getRecordById(@RequestBody Long id) {
		Optional<Uday> uday = udayRepo.findById(id);
		return uday.get();
	}

	@PostMapping("deleteRecordById")
	public String deleteRecordById(@RequestBody Long id) {
		udayRepo.deleteById(id);
		return "deleted";
	}

}
