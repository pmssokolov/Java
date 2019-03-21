package by.gsu.pmslab;

public class SubjectUniformMaterial {
    private final static String NAME = "wire";
    private UniformMaterial material;
    private final static double VOLUME = 0.03;

    public SubjectUniformMaterial(UniformMaterial material){
        this.material = material;
    }

    public String getName(){
        return NAME;
    }


    public UniformMaterial getMaterial(){
        return material;
    }
    public void setMaterial(UniformMaterial material) {
        this.material = material;
    }


    public double getMass(){
        return VOLUME * material.getDensity();
    }

    @Override
    public String toString(){
        return NAME+";"+material+";"+VOLUME+";"+getMass();
    }
}
