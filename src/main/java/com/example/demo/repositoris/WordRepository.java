package com.example.demo.repositoris;

import com.example.demo.model.User;
import com.example.demo.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {

}
