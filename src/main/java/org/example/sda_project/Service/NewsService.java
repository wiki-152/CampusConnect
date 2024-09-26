package org.example.sda_project.Service;

import org.example.sda_project.Bean.News;
import org.example.sda_project.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News getNewsById(Integer id) {
        return newsRepository.findById(id).orElse(null);
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    public void deleteNews(Integer id) {
        newsRepository.deleteById(id);
    }

    public News updateNews(News news) {
        return newsRepository.save(news);
    }
}
