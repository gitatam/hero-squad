package models;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private String squad;

    public Hero(String name, int age, String power, String weakness, String squad) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public String getSquad() {
        return squad;
    }
}
