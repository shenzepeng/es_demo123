package com.example.es_demo;

import com.example.es_demo.index.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@SpringBootTest
class EsDemoApplicationTests {
    @Autowired
    private ElasticsearchTemplate template;
    @Test
    void contextLoads() {
        template.createIndex(Item.class);
        template.putMapping(Item.class);
    }

}
