@Entity
public class Employee {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long employeeId;
  private String firstName;
  private String lastName;
  private String role;
  private Double salary;
  
  
}
