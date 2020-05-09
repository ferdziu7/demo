package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.model.Word;
import com.example.demo.repositoris.UserRepository;
import com.example.demo.repositoris.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/api")

public class Controler {

@Autowired
private UserRepository userRepository;
@Autowired
private WordRepository wordRepository;

@GetMapping("/creatdata")
public List<Word> creatData(){
    Word word = new Word();
    word.wordpl = "kot";
    word.wordeng = "cat";
    wordRepository.save(word);
    word = new Word();
    word.wordpl = "auto";
    word.wordeng = "car";
    wordRepository.save(word);

    word = new Word();
    word.wordpl = "drzewo";
    word.wordeng = "tree";
    wordRepository.save(word);
    word = new Word();
    word.wordpl = "drzwi";
    word.wordeng = "door";
    wordRepository.save(word);

    return wordRepository.findAll();
}



@GetMapping("/creatuser")
    public User creatUser(){
    User user = new User();

//    Scanner scan = new Scanner(System.in);
//    System.out.println("Wpisz słowo jakie chesz przetłumaczyć:");
//    String Słowo = scan.nextLine();
//    System.out.println(Słowo);
//    user.name = "Słowo";
    userRepository.save(user);

    return user;
}

@PostMapping("/posttest")
    public Word addWord(@RequestBody Word w)
    {
        wordRepository.save(w);
        return w;
    }

    @DeleteMapping("/deleteword")
    public String deleteWord( long id)
    {
        wordRepository.deleteById(id);
        return "ok";
    }

}


