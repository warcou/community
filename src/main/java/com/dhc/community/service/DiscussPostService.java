package com.dhc.community.service;

import com.dhc.community.dao.DiscussPostMapper;
import com.dhc.community.dao.elasticsearch.DiscussPostRepository;
import com.dhc.community.entity.DTO.DiscussPostDTO;
import com.dhc.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
