package com.example.medplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.medplus.entity.DailyRoutine;

import java.time.LocalTime;
import java.util.List;

public interface DailyRoutineRepository extends JpaRepository<DailyRoutine, Long> {

    DailyRoutine findByid(long id);

    List<DailyRoutine> findByTimeBefore(LocalTime time);

    List<DailyRoutine> findByActivityContainsIgnoreCase(String activity);
}
