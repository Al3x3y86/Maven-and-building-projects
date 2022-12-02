package my.example.webrecipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String HelloWord(){
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String info(){
        String studentName = "Иван Иванович";
        String projectName = "Веб рецепты";
        String projectCreationDate = "2022-12-01";
        String descriptionProject = "Рецепты WEB 3.0";
        return studentName+" "+projectName+" "+projectCreationDate+" "+ descriptionProject;
    }

}
