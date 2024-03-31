package com.dhc.community.service.impl;

import com.dhc.community.dao.elasticsearch.DiscussPostRepository;
import com.dhc.community.entity.DTO.DiscussPostDTO;
import com.dhc.community.entity.DiscussPost;
import com.dhc.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class DiscussPostServiceImpl implements DiscussPostService {
    @Autowired
    private DiscussPostRepository discussPostRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Override
    public Boolean saveDiscussPost(DiscussPostDTO discussPostDTO) {
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

        return null;
    }
}
