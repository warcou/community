package com.dhc.community.dao;

import com.dhc.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userid, int offset, int limit);

    int selectDiscussPostRows(@Param("userid") int userid);

}
