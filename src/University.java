public class University {
    String universityName;
    int student;
    String lesson;

    public University(String universityName, int student, String lesson) {
        this.universityName = universityName;
        this.student = student;
        this.lesson = lesson;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", student=" + student +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
