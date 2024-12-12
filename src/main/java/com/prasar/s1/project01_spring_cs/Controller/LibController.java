package com.prasar.s1.project01_spring_cs.Controller;
import com.prasar.s1.project01_spring_cs.Entity.Library;
import com.prasar.s1.project01_spring_cs.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/lib")
public class LibController {

    @Autowired
    LibraryService libraryService;


    @PostMapping("/enterbook")
    public Library enterbook(@RequestBody Library library) {
        return libraryService.enterbook(library);
    }

    @GetMapping("/getbook")
    public List<Library> getbook() {
        return libraryService.getbook();
    }

    @GetMapping("/getbookbyid/{id}")
    public ResponseEntity<Library> getbookbyid(@PathVariable int id) {
        Optional<Library> resp= libraryService.getbookbyid(id);
        return  ResponseEntity.ok(resp.get()) ;

    }


    @PutMapping("/{id}")
    public Library updatebook(@PathVariable int id, @RequestBody Library library) {
        return libraryService.updatebook(id,library);
    }

    @DeleteMapping("/delete/{id}")
    public void deletebook(@PathVariable int id) {
        libraryService.deletebook(id);
    }

    @PatchMapping("/patch/{id}")
    public Library patch(@PathVariable int id, @RequestBody Map<String, Object> updates) {
        return libraryService.patch(id,updates);
    }

}

