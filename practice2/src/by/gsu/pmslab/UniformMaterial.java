package by.gsu.pmslab;

public enum UniformMaterial {
    STEEL("Steel",7850),COPPER("Copper",8500);
    private String name_matirial;
    private int density;


    UniformMaterial(){
        this.name_matirial = null;
        this.density = 0;
    }

    UniformMaterial(String name_matirial,int density){
        this.name_matirial = name_matirial;
        this.density = density;
    }

    public String getName_matirial(){
        return name_matirial;
    }
    public void setName_matirial(String name_matirial){
        this.name_matirial = name_matirial;
    }

    public int getDensity() {
        return density;
    }
    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public String toString(){
        return name_matirial+";"+density;
    }
}
