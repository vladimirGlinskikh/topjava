package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalDateTime;
import java.util.Collection;

public interface UserMealRepository {
    UserMeal save(UserMeal userMeal, int userId);

    boolean delete(int id, int userId);

    UserMeal get(int id, int userId);

    Collection<UserMeal> getAll(int userId);

    Collection<UserMeal> getBetween(LocalDateTime startDateTime, LocalDateTime endDataTime, int userId);

    void save(UserMeal meal);

    void delete(int id);

    UserMeal get(int id);

    Collection<UserMeal> getAll();
}
