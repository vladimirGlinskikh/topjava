package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public interface UserMealService {
    UserMeal get(int id, int userId);

    void delete(int id, int userId);

    Collection<UserMeal> getAll(int userId);

    void deleteAll(int userId);

    void update(UserMeal meal, int userId);

    UserMeal save(UserMeal meal, int userId);

    List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);

    List<UserMeal> getBetween(LocalDateTime of);
}