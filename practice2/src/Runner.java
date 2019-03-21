import by.gsu.pmslab.UniformMaterial;
import by.gsu.pmslab.SubjectUniformMaterial;

public class Runner {
    public static void main(String[] args) {
        SubjectUniformMaterial wire = new SubjectUniformMaterial(UniformMaterial.STEEL);

        System.out.println(wire);

        wire.setMaterial(UniformMaterial.COPPER);
        System.out.println("Copper mass = "+ wire.getMass());

        wire.setMaterial(UniformMaterial.STEEL);
        System.out.println(wire);
    }
}
