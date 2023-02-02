package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Lesson;
import com.example.MakeupClasses.pojo.input.LessonInput;
import com.example.MakeupClasses.repository.LessonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefLessonService implements LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public DefLessonService() {
    }

    @Override
    public List<Lesson> findAll() {
        return this.lessonRepository.findAll();
    }

    @Override
    public Lesson save(LessonInput lessonInput) {
        String name = lessonInput.getName();
        String category = lessonInput.getCategory();
        Lesson lesson = new Lesson();
        lesson.setName(name);
        lesson.setCategory(category);
        return (Lesson)this.lessonRepository.save(lesson);
    }

    @Override
    public Lesson update(String name, LessonInput lessonInput) {
        Lesson lesson = this.lessonRepository.findLessonByName(name);
        if (lesson == null) {
            return null;
        } else {
            String updatedName = lessonInput.getName();
            String updatedCategory = lessonInput.getCategory();
            lesson.setName(updatedName);
            lesson.setCategory(updatedCategory);
            return (Lesson)this.lessonRepository.save(lesson);
        }
    }

    @Override
    public void delete(String name) {
        Lesson lesson = this.lessonRepository.findLessonByName(name);
        if (lesson != null) {
            this.lessonRepository.delete(lesson);
        }
    }

    @Override
    public Lesson findLessonByName(String name) {
        return null;
    }
    @Override
    public List<Lesson> findBookedLessons() {
        return this.lessonRepository.findBookedLessons();
    }
}
