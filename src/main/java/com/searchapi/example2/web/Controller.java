package com.searchapi.example2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private BlogService blogService;

    @Autowired
    private NewsService newsService;


    @GetMapping("/blog")
    public List<BlogDto> searchBlogByQuery(@RequestParam(name = "query", required=false) String query){

        return blogService.findByQuery("스프링부트");
    }

    @GetMapping("/news")
    public List<BlogDto> searchNewsByQuery(){
        return newsService.findByQuery("카카오");
    }

}
