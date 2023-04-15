@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployee(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		if(employeeRepository.existsById(employee.getEmployeeId())) {
			return employeeRepository.save(employee);
		}
		
		return null;
	}
	
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}	
}
