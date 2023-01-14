package pro.sky.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/")
    public String appStarting() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String page() {
        return """
                Имя : Хаитов Александр,
                Название проекта :тестовое домашнее задание
                14.01.2023
                Описание проекат : учимся разрабатывать Web-приложения""";
    }
}
