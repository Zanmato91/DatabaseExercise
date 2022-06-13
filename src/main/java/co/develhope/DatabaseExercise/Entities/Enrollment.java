package co.develhope.DatabaseExercise.Entities;

import javax.persistence.*;

//la tabella di join enrollmentscon:
//una chiave primaria
//le 2 chiavi esterne
@Entity
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calsses_id")
    private Classes classes;

    public Enrollment(long enrollmentId, Student student, Classes classes) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.classes = classes;
    }

    public Enrollment() {
    }
}
