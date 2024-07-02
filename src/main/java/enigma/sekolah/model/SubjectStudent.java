package enigma.sekolah.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "subject_students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubjectStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;

    private Date startDate;

    private Date endDate;
}
