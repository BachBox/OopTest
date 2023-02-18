package Oop.Model;

import Oop.MyUtil.Util;

public abstract class Cat {

    private int id;
    private int age;
    private String name;
    private String gender;
    protected String voice;

    public Cat() {
        id = Util.getInt("Input ID", "Wrong type");
        age = Util.getInt("Input age: ", "Wrong type");
        name = Util.getString("Input name: ");
        gender = Util.getString("Input gender(Male/ Female): ");
    }

    @Override
    public String toString() {
        return "Cat [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", voice=" + voice + "]";
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

}
