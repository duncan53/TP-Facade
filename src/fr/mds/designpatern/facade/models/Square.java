package fr.mds.designpatern.facade.models;

public class Square implements Shape{

    @Override
    public String draw() {
        return "Square::draw()";
    }
}
