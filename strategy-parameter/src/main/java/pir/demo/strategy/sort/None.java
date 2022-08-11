package pir.demo.strategy.sort;

import org.springframework.stereotype.Component;

@Component
public class None implements SortStrategy {

    @Override
    public String getNews() {
        return "정렬하지 않을거야";
    }
}
