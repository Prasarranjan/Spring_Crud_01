package com.prasar.s1.project01_spring_cs.Controller;

import com.prasar.s1.project01_spring_cs.Entity.Library;
import com.prasar.s1.project01_spring_cs.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Library getbookbyid(@PathVariable int id) {
        return libraryService.getbookbyid(id);
    }


}

