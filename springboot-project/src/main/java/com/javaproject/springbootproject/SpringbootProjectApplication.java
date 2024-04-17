package com.javaproject.springbootproject;

import com.javaproject.springbootproject.entity.Employee;
import com.javaproject.springbootproject.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectApplication implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;

	public SpringbootProjectApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Employee employee1 =  Employee.builder()
				.firstName("Niko")
				.lastName("San")
				.email("nikosan@gmail.com")
				.build();
		Employee employee2 =  Employee.builder()
				.firstName("Niko")
				.lastName("San2")
				.email("nikosan2@gmail.com")
				.build();
		Employee employee3 =  Employee.builder()
				.firstName("Niko")
				.lastName("San3")
				.email("nikosan3@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
