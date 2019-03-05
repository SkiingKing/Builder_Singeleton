package com.company;


public class Person {

    private String name;
    private int birth_day;
    private int color_of_hair;
    private int height;
    private int mas;
    private boolean children;

    @Override
    public String toString() {
        return "Name = "+name+" "+"Birthday = "+birth_day+" Color of hair = "+color_of_hair+" Height = "+height+" Masa = "+mas+" Children = "+children;

    }
    public static void main(String[] args){

    }

    public Person(String name, int birth_day) {
        this.name = name;
        this.birth_day = birth_day;
    }
    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person("Valera", 16);
        }

        public Builder withColor(int color_of_hair) {
            newPerson.color_of_hair = color_of_hair;
            return this;
        }

        public Builder withHeight(int height) {
            newPerson.height = height;
            return this;
        }

        public Builder withMax(int mas) {
            newPerson.mas = mas;
            return this;
        }

        public Builder withChildren(boolean children) {
            newPerson.children = children;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }


}

