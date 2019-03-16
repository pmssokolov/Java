import by.gsu.pmslab.UniformMaterial;
import by.gsu.pmslab.SubjectUniformMaterial;

public class Runner {
    public static void main(String[] args) {
        UniformMaterial steel = new UniformMaterial("Steel",7850);
        UniformMaterial copper = new UniformMaterial("Copper",8500);
        SubjectUniformMaterial wire = new SubjectUniformMaterial("Wire","Steel",0.03);

        wire.getToDensity().setDensity(steel.getDensity());
        System.out.println(wire);

        wire.getToDensity().setDensity(copper.getDensity());
        System.out.println("Copper mass = "+wire.getMass());

        wire.getToDensity().setDensity(steel.getDensity());
        System.out.println(wire);
    }
}
