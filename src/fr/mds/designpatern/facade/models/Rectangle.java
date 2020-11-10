package fr.mds.designpatern.facade.models;

public class Rectangle implements Shape{

    @Override
    public String draw() {
        return "Rectangle::draw()";
    }
}
