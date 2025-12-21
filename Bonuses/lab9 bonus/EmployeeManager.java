import java.io.*;

public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public void loadEmployeesFromFile(String filepath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if(data.length == 3) {
                    Employee employee = new Employee(data[0], data[1], data[2]);
                }
                System.out.println("File loaded succesfully!");
            }

        }
        catch(Exception e) {
            System.out.println("Error while reading file!");
        }
    }
    public void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees on the list!");
        }
        else {
            for(int i = 0; i<count; i++) {
                System.out.println(employees[i]);
            }
        }
    }
    public void addEmployee(String name, String department, String email) {

        Employee newEmployee = new Employee(name, department, email);
        employees[employees.length+1] = newEmployee;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("employees.txt"))) {
            bw.write(name+","+department+","+email);
            System.out.println("Employee saved");
        }
        catch(Exception e) {
            System.out.println("Error saving the employee!");
        }

    }
    public void searchEmployee(String name) {
        for(int i = 0; i<employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("Employee found!");
            }
            else {
            System.out.println("Employee not found");
            }
        }
    }

}
