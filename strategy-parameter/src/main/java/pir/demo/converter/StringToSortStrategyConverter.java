package pir.demo.converter;


import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.converter.Converter;
import pir.demo.strategy.sort.SortStrategy;

public class StringToSortStrategyConverter implements Converter<String, SortStrategy> {

    private final ApplicationContext applicationContext;

    public StringToSortStrategyConverter(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public SortStrategy convert(String source) {
        return applicationContext.getBean(source, SortStrategy.class);
    }
}
