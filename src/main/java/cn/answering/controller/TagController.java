package cn.answering.controller;

import cn.answering.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HP on 2017/8/20.
 */
@Controller
@RequestMapping("/tags")
public class TagController {

    @Autowired
    private TagService tagService;
}
