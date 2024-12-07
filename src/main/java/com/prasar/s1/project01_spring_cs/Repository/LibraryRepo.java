package com.prasar.s1.project01_spring_cs.Repository;

import com.prasar.s1.project01_spring_cs.Entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library, Integer> {

}
