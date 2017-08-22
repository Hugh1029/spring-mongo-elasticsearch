package cn.answering.service.impl;

import cn.answering.domain.Tag;
import cn.answering.repository.TagRepository;
import cn.answering.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HP on 2017/8/20.
 */
@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagRepository tagRepository;


    @Transactional
    @Override
    public Tag saveOrUpdateTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public void deleteTag(String id) {
        tagRepository.delete(id);
    }

    @Override
    public Tag findTagById(String id) {
        return tagRepository.findOne(id);
    }
}
