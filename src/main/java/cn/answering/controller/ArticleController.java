package cn.answering.controller;

import cn.answering.domain.Article;
import cn.answering.domain.es.EsArticle;
import cn.answering.service.ArticleService;
import cn.answering.service.es.EsArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by HP on 2017/8/20.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private EsArticleService esArticleService;


    @GetMapping
    public ModelAndView getArticle(@RequestParam(value = "content",required = false,defaultValue = "")String content,
                                   @RequestParam(value = "pageIndex",required = false,defaultValue = "0")int pageIndex,
                                   @RequestParam(value = "pageSize",required = false,defaultValue = "10")int pageSize,
                                   Model model){
        Pageable pageable = new PageRequest(pageIndex,pageSize);
        if (content == null || content == "" || content.equals("")){
            Page<EsArticle> page = esArticleService.findAll(pageable);
            System.out.println(page.getContent().get(0).getTitle());
            model.addAttribute("articleList",page.getContent());
        }else {
            Page<EsArticle> page = esArticleService.queryArticle(content,pageable);
            model.addAttribute("articleList",page.getContent());
        }
        return new ModelAndView("index","articleModel",model);

    }

    @PostMapping
    public String addArticle(@RequestParam(value = "title",required = true,defaultValue = "标题")String title,
                             @RequestParam(value = "content",required = true,defaultValue = "内容")String content){
        Article article = new Article(title,content);
        articleService.saveOrUpdateArticle(article);
        return "redirect:article";
    }

}
