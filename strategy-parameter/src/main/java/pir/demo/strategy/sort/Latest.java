package pir.demo.strategy.sort;

import org.springframework.stereotype.Component;

@Component
public class Latest implements SortStrategy {

    @Override
    public String getNews() {
        return "최신순으로 뉴스 정렬";
    }
}
