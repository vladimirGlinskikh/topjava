package ru.javawebinar.topjava.web.meal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.LoggedUser;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.service.UserMealService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UserMealRestController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMealService service;

    public UserMeal get(int id) {
        int userId = LoggedUser.id();
        log.info("get UserMeal {} for User {}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = LoggedUser.id();
        log.info("delete UserMeal {} for User {}", id, userId);
        service.delete(id, userId);
    }

    public List<UserMeal> getAll() {
        int userId = LoggedUser.id();
        log.info("getAll for User {}", userId);
        return (List<UserMeal>) service.getAll(userId);
    }

    public void deleteAll() {
        int userId = LoggedUser.id();
        log.info("deleteAll for User {}", userId);
        service.deleteAll(userId);
    }

    public void update(UserMeal meal) {
        int userId = LoggedUser.id();
        log.info("update {} for User {}", meal, userId);
        service.update(meal, userId);
    }

    public UserMeal create(UserMeal meal){
        int userId = LoggedUser.id();
        log.info("create {} for User {}", meal, userId);
        return service.save(meal, userId);
    }

    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate){
        int userId = LoggedUser.id();
        log.info("getBetween {} and {} for User {}", startDate, endDate, userId);
        return service.getBetween(startDate, endDate, userId);
    }

    public List<UserMeal> getBetween(LocalDateTime of) {
        return service.getBetween(of);
    }
}