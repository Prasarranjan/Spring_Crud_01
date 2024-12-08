package com.prasar.s1.project01_spring_cs.Service;


import com.prasar.s1.project01_spring_cs.Entity.Library;
import com.prasar.s1.project01_spring_cs.Repository.LibraryRepo;
import org.apache.el.util.ReflectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

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

    public Library updatebook(int id, Library library) {
        libraryRepo.save(library);
        return libraryRepo.save(library);
    }

    public void deletebook(int id) {
        libraryRepo.deleteById(id);
    }


    public Library patch(int id, Map<String, Object> updates) {
        Library library = libraryRepo.findById(id).get();
        updates.forEach((field,value) -> {
            Field fieldtobeupdated= ReflectionUtils.findField(Library.class ,field);
            fieldtobeupdated.setAccessible(true);
            ReflectionUtils.setField(fieldtobeupdated,library,value);


        });
           return libraryRepo.save(library);
    }
}
