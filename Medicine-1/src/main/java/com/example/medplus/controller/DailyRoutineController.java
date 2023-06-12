package com.example.medplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.medplus.entity.DailyRoutine;
import com.example.medplus.services.DailyRoutineService;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/daily-routines")
public class DailyRoutineController {

    private final DailyRoutineService dailyRoutineService;

    @Autowired
    public DailyRoutineController(DailyRoutineService dailyRoutineService) {
        this.dailyRoutineService = dailyRoutineService;
    }

    @GetMapping
    public List<DailyRoutine> getAllDailyRoutines() {
        return dailyRoutineService.getAllDailyRoutines();
    }

    @PostMapping("/abc")
    public DailyRoutine createDailyRoutine(@RequestBody DailyRoutine dailyRoutine) {
        return dailyRoutineService.createDailyRoutine(dailyRoutine);
    }

    @GetMapping("/id")
    public DailyRoutine getDailyRoutinesByReminderEnabled(@RequestParam long id) {
//        System.out.println("saurabh");
        return dailyRoutineService.getDailyRoutinesByid(id);
    }

    @GetMapping("/before-time")
    public List<DailyRoutine> getDailyRoutinesBeforeTime(@RequestParam LocalTime time) {
//        LocalTime localTime = LocalTime(time);
        
        return dailyRoutineService.getDailyRoutinesBeforeTime(time);
    }

    @GetMapping("/search")
    public List<DailyRoutine> searchDailyRoutinesByActivity(@RequestParam String activity) {
        return dailyRoutineService.searchDailyRoutinesByActivity(activity);
    }
}
