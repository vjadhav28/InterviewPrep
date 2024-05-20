package org.example.Enum;

public enum grade {
    A("90-100"),
    B("80-89"),
    C("70-79"),
    D("60-69"),
    F("0-59");

    private final String gradeDescription;
    private grade(String desc) {
        this.gradeDescription = desc;
    }

    public void seeDescription() {
        System.out.println(this.gradeDescription);
    }
    public static void main(String[] args) {
        grade grade = org.example.Enum.grade.A;
        System.out.println(grade);
        grade.seeDescription();
    }
}
