package behavioral.interpreter.first;

public class IndividualEmployee implements Employee {

    private int yearsOfExperience;
    private String currentGrade;

    public IndividualEmployee(int yearsOfExperience, String currentGrade) {
        this.yearsOfExperience = yearsOfExperience;
        this.currentGrade = currentGrade;
    }

    @Override
    public boolean interpret(Context context) {
        boolean hasRelevantGrade = context.getPermissibleGrades().contains(this.currentGrade);
        boolean hasEnougExperience = this.yearsOfExperience >= context.getYearsOfExperience();
        if (hasEnougExperience && hasRelevantGrade) {
            return true;
        }
        return false;
    }
}
