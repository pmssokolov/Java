package by.gsu.pmslab;

public class SubjectUniformMaterial {
    private String name;
    private UniformMaterial material;
    private double volume;

    public SubjectUniformMaterial(UniformMaterial material, String name, double volume){
        this.material = material;
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return name;
    }


    public UniformMaterial getMaterial(){
        return material;
    }
    public void setMaterial(UniformMaterial material) {
        this.material = material;
    }


    public double getMass(){
        return volume * material.getDensity();
    }

    @Override
    public String toString(){
        return name+";"+material+";"+volume+";"+getMass();
    }
}
