import by.gsu.pmslab.ThreadGenerator;

import java.io.IOException;

public class Runner {


    public static void main(String[] args) throws IOException {
        ThreadGenerator threadGenerator = new ThreadGenerator();
        threadGenerator.execute();
        System.out.println("THIS RESULT ====> " + threadGenerator.getResult());
    }
}
