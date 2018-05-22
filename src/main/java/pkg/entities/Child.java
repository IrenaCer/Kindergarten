package pkg.entities;

import pkg.entities.Teacher;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.johnzon.mapper.JohnzonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
@Entity
@Table(name = "CHILD")
@NamedQueries({
        @NamedQuery(name = "Child.findAll", query = "SELECT e FROM Child e"),
        @NamedQuery(name = "Child.findById", query =  "SELECT e from Child e WHERE e.id = :id")
})
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 20)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Size( max = 20)
    @Column(name = "LAST_NAME")
    private String lastName;

    @JoinColumn(name = "KINDERGARDEN_ID", referencedColumnName = "ID")
    @ManyToOne
    @JohnzonIgnore
    private Kindergarden kindergarden;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @JoinTable(name = "CHILD_TEACHER", joinColumns = {
            @JoinColumn(name = "CHILD_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
            @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID")})
    @ManyToMany
    @JohnzonIgnore
    private List<Teacher> teacherList;
}
//wasd