package pir.demo.service;

import org.springframework.stereotype.Service;
import pir.demo.strategy.sort.SortStrategy;

@Service
public class NewsService {

    public String getNews(SortStrategy sortStrategy){
        return sortStrategy.getNews();
    }
}
