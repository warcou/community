package com.dhc.community;

import com.dhc.community.dao.elasticsearch.DiscussPostRepository;
import com.dhc.community.entity.DTO.DiscussPostDTO;
import com.dhc.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@SpringBootTest
public class DiscussPostTest {
    @Autowired
    private DiscussPostRepository discussPostRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Test
    public void saveDiscussPost() {
        //test
        DiscussPost discussPost = DiscussPost.builder()
                .id(new Random().nextInt())
                .commentCount(1)
                .content("this is the content of discussPost")
                .createdAt(new Date())
                .score((double) 10)
                .states(1)
                .title("Title")
                .type(1)
                .userId(-1)
                .build();
        discussPostRepository.save(discussPost);

    }
    @Test
    public void deleteDiscussPost() {
        //test
        discussPostRepository.deleteById(789616105);

    }
}
