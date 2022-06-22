package ptit.edu.mywebapp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(nullable = false)
    private  String email;
    @Column(length = 15,nullable = false)
    private  String password;
    @Column(length = 45,nullable = false,name = "first_name")
    private  String firstName;
    @Column(length = 45,nullable = false,name = "last_name")
    private  String lastName;
    private  boolean enabled;
}
