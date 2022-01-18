package com.example.fitcal;

public class Model {
    private String id;
    private String dishName;
    private String calories;
    private String date;

    public Model(){
    }

    public Model(String id, String dishName, String calories, String date) {
        this.id = id;
        this.dishName = dishName;
        this.calories = calories;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
