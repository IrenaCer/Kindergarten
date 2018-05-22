package pkg.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "KINDERGARDEN")
@NamedQueries({
        @NamedQuery(name = "Kindergarden.findAll", query = "SELECT c FROM Kindergarden c"),
        @NamedQuery(name = "Kindergarden.findById", query =  "SELECT c from Kindergarden c WHERE c.id = :id")
})
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "kindergardenName"})
public class Kindergarden implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 20)
    @Column(name = "KINDERGARDEN_NAME")
    private String kindergardenName;

    @Size(max = 20)
    @Column(name = "COUNTRY")
    private String country;

    @OneToMany(mappedBy = "kindergarden")
    private List<Child> childList = new ArrayList<>();
}