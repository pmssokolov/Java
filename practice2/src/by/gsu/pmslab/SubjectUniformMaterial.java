package by.gsu.pmslab;

public class SubjectUniformMaterial {
    UniformMaterial blank = new UniformMaterial();


    public UniformMaterial getToDensity(){
        return blank;
    }

    private String name_subject;
    private String material;
    private double volume;


    public SubjectUniformMaterial(){
        this.name_subject = null;
        this.material = null;
        this.volume = 0;
    }

    public SubjectUniformMaterial(String name_subject,String material, double volume){
        this.name_subject = name_subject;
        this.material = material;
        this.volume = volume;
    }

    public String getName_subject(){
        return name_subject;
    }
    public void setName_subject(String name_subject){
        this.name_subject = name_subject;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass(){
        return volume * blank.getDensity();
    }

    @Override
    public String toString(){
        return name_subject+";"+material+";"+blank.getDensity()+";"+volume+";"+getMass();
    }
}
