package cn.answering.service;

import cn.answering.domain.Tag;

/**
 * Created by HP on 2017/8/20.
 */
public interface TagService{

    public Tag saveOrUpdateTag(Tag tag);

    public void deleteTag(String id);

    public Tag findTagById(String id);
}
