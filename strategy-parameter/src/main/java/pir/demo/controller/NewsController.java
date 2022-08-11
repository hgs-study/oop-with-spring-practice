package pir.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pir.demo.strategy.sort.SortStrategy;
import pir.demo.service.NewsService;

@RestController
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public String getNews(@RequestParam SortStrategy sort){
        return newsService.getNews(sort);
    }
}
