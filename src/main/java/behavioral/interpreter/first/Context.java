package behavioral.interpreter.first;

import java.util.Arrays;
import java.util.List;

class Context {
    private int yearsOfExperience;
    private List<String> permissibleGrades;

    public Context(int yearsOfExperience, String... allowedGrades) {
        this.yearsOfExperience = yearsOfExperience;
        this.permissibleGrades = Arrays.asList(allowedGrades.clone());
    }

    public List<String> getPermissibleGrades() {
        return permissibleGrades;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
