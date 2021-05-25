package com.ucreativa.familia;

public class Lizbeth {

    private int age ;
    private String hobby ;

    public Lizbeth (String saludo){
        age = 1;
        hobby = "Chat";
        System.out.println(saludo);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age + 1;
    }

    public String getHobby() {
        return hobby;
    }


}
