public class School {
    String schoolName;
    int children;
    String lesson;

    public School(String schoolName, int children, String lesson) {
        this.schoolName = schoolName;
        this.children = children;
        this.lesson = lesson;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", children=" + children +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
