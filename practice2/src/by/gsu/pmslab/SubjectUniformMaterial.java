package by.gsu.pmslab;

public class SubjectUniformMaterial {
    private final static String name = "wire";
    private UniformMaterial material;
    private final static double volume = 0.03;

    public SubjectUniformMaterial(UniformMaterial material){
        this.material = material;
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
