package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Realization;
import com.example.MakeupClasses.pojo.input.RealizationInput;
import com.example.MakeupClasses.repository.RealizationRepository;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DefRealizationService implements RealizationService {
    @Autowired
    private RealizationRepository realizationRepository;

    public DefRealizationService() {
    }

    public List<Realization> findAll() {
        return this.realizationRepository.findAll();
    }

    public Realization findRealizationByDateAndTime(Date date, Time time) {
        return this.realizationRepository.findRealizationByDateAndTime(date, time);
    }

    @Override
    public Realization save(RealizationInput realizationInput) {
        Date date = realizationInput.getDate();
        Time time = realizationInput.getTime();
        Realization realization = new Realization();
        realization.setRealizingDate(date);
        realization.setRealizingTime(time);
        return (Realization) this.realizationRepository.save(realization);
    }

    @Override
    public Realization update(Date date, Time time, RealizationInput realizationInput) {
        Realization realization = this.realizationRepository.findRealizationByDateAndTime(date, time);
        if (realization == null) {
            return null;
        } else {
            realization.setRealizingDate(date);
            realization.setRealizingTime(time);
            return (Realization) this.realizationRepository.save(realization);
        }
    }

    @Override
    public void delete(Date date, Time time) {
        Realization realization = this.realizationRepository.findRealizationByDateAndTime(date, time);
        if (realization != null) {
            this.realizationRepository.delete(realization);
        }
    }
    @Override
    public List<Realization> findRealizationByLessonName(String name) {
        return this.realizationRepository.findRealizationByLessonName(name);
    }
}
