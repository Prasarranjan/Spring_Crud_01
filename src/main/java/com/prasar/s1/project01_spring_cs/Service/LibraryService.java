package com.prasar.s1.project01_spring_cs.Service;


import com.prasar.s1.project01_spring_cs.Entity.Library;
import com.prasar.s1.project01_spring_cs.Repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    LibraryRepo libraryRepo;


    public Library enterbook(Library library) {
        return libraryRepo.save(library);
    }

    public List<Library> getbook() {
        return libraryRepo.findAll();
    }


    public Library getbookbyid(int id) {
        return libraryRepo.findById(id).get();
    }
}
