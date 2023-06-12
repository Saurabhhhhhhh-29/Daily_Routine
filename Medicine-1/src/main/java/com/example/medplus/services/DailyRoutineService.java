package com.example.medplus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medplus.entity.DailyRoutine;
import com.example.medplus.repository.DailyRoutineRepository;

import java.time.LocalTime;
import java.util.List;

@Service
public class DailyRoutineService {

    private final DailyRoutineRepository dailyRoutineRepository;

    @Autowired
    public DailyRoutineService(DailyRoutineRepository dailyRoutineRepository) {
        this.dailyRoutineRepository = dailyRoutineRepository;
    }

    public List<DailyRoutine> getAllDailyRoutines() {
        return dailyRoutineRepository.findAll();
    }

    public DailyRoutine createDailyRoutine(DailyRoutine dailyRoutine) {
        return dailyRoutineRepository.save(dailyRoutine);
    }

    public DailyRoutine getDailyRoutinesByid(long id) {
        return dailyRoutineRepository.findByid(id);
    }

    public List<DailyRoutine> getDailyRoutinesBeforeTime(LocalTime time) {
        return dailyRoutineRepository.findByTimeBefore(time);
    }

    public List<DailyRoutine> searchDailyRoutinesByActivity(String activity) {
        return dailyRoutineRepository.findByActivityContainsIgnoreCase(activity);
    }
}
