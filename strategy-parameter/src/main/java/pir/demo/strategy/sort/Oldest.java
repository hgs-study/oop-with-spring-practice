package pir.demo.strategy.sort;

import org.springframework.stereotype.Component;

@Component
public class Oldest implements SortStrategy {

    @Override
    public String getNews() {
        return "오래된 순으로 뉴스 정렬";
    }
}
