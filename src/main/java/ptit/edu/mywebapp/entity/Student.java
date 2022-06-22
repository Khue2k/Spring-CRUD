package ptit.edu.mywebapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false,length = 25)
    private  String name;
    @Column(nullable = false,length = 25)
    private  int age;
    @Column(nullable = false,length = 25)
    private  String address;
    @Column(nullable = false,length = 25)
    private  float mark;

}
