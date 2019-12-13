package practise.javasePackage.stu;

public class gradeScore {
    private  int gradeClass;
    private  double avgScore;
    public gradeScore(){

    }

    public gradeScore(int gradeClass, double avgScore) {
        this.gradeClass = gradeClass;
        this.avgScore = avgScore;
    }

    public int getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(int gradeClass) {
        this.gradeClass = gradeClass;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "GradeScore{" +
                "gradeClass=" + gradeClass +
                ", avgScore=" + avgScore +
                '}';
    }
}
