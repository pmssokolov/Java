package by.gsu.pmslab;

public class Person {
    private String last_name;
    private int age;
    private String sex;

    public Person(String last_name, int age, String sex){
        this.last_name = last_name;
        this.age = age;
        this.sex = sex;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString(){
        return last_name+";"+age+";"+sex;
    }
}
