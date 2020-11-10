package fr.mds.designpatern.facade.models;

public class Circle implements Shape{
    @Override
    public String draw() {
       return "Circle::draw()";
    }
}
