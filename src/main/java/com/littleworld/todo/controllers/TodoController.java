package com.littleworld.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.littleworld.todo.model.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

List<Todo> todoList = new ArrayList<>();

  @PostMapping("/create")
  public String create(Todo todo) {
    todoList.add(todo);
    return "redirect:/list";
  }
  
  @GetMapping("/list")
  public String findAll(Model model) {
    model.addAttribute("todos", todoList);
    return "todoList";
  }

}

