package com.dhc.community.entity.DTO;

import lombok.Data;

@Data
public class EntityDTO {
    /**
     * 实体的id 实体包括 帖子，评论等
     * */
    private int id;
    /**
     * 发布实体的用户的id
     * */
    private int userId;
    /**
     * 实体的类型
     */
    private int type;
}
