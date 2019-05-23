package pkg.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "TEACHER")
@NamedQueries({
        @NamedQuery(name = "Teacher.findAll", query = "SELECT p FROM Teacher p")
})
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 20)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Size(max = 20)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "SALARY")
    private double salary;

    @ManyToMany(mappedBy = "teacherList")
    private List<Child> childList;
}
