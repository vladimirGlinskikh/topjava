package ru.javawebinar.topjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.repository.UserMealRepository;
import ru.javawebinar.topjava.util.exception.ExceptionUtil;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class UserMealServiceImpl implements UserMealService {

    @Autowired
    private UserMealRepository repository;

    @Override
    public UserMeal get(int id, int userId) {
        return ExceptionUtil.check(repository.get(id, userId), id);
    }

    @Override
    public void delete(int id, int userId) {
        ExceptionUtil.check(repository.delete(id, userId), id);
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return (List<UserMeal>) repository.getAll(userId);
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public void update(UserMeal meal, int userId) {

    }

    @Override
    public UserMeal save(UserMeal meal, int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return (List<UserMeal>) repository.getBetween(startDate, endDate.plus(1, ChronoUnit.DAYS), userId);
    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime of) {
        return null;
    }
}