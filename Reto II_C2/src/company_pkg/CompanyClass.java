/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_pkg;

import java.util.ArrayList;
import java.util.Scanner;
import person_pkg.AdminClass;
import person_pkg.ClientClass;
import person_pkg.EmployeeClass;

/**
 *
 * @author Daniel Fajardo
 */
public class CompanyClass {

    private String nameCompany;
    private String NIT;
    private String address;
    private EmployeeClass employee;
    private ClientClass client;
    private static Scanner insDatos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    ArrayList<EmployeeClass> employeeList = new ArrayList<>();
    ArrayList<EmployeeClass> subordinates = new ArrayList<>();
    ArrayList<ClientClass> clientList = new ArrayList<>();
    ArrayList<JobPositionClass> jobs = new ArrayList<>();

    public CompanyClass(String nameCompany, String NIT, String address, EmployeeClass employee, JobPositionClass job) {
        this.nameCompany = nameCompany;
        this.NIT = NIT;
        this.address = address;
        employeeList.add(employee);
        jobs.add(job);
    }

    public CompanyClass() {
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the employee
     */
    public EmployeeClass getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(EmployeeClass employee) {
        this.employee = employee;
    }

    /**
     * @return the client
     */
    public ClientClass getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(ClientClass client) {
        this.client = client;
    }

    //Método para realizar el CRUD de los empleados de la empresa
    public void crudEmployees() {
        boolean exitProgram = false;
        while (!exitProgram) {
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println(" 1. Crear empleado");
            System.out.println(" 2. Consultar lista de empleados");
            System.out.println(" 3. Editar empleado");
            System.out.println(" 4. Eliminar empleado");
            System.out.println(" 5. Administrar personal"); //Esta opción adicional en el CRUD es referente al personal subordinado
            System.out.println(" 6. Salir");
            System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
            int option = Integer.parseInt(insDatos.nextLine());

            switch (option) {
                case 1:
                    System.out.println("¿El empleado es administrativo? (Si,No)");
                    String optionA = insDatos.nextLine();
                    if (optionA.toLowerCase().equals("no")) {
                        System.out.println("¿Cuántos empleados deseas añadir?");
                        int numEmployees = Integer.parseInt(insDatos.nextLine());
                        System.out.println("\n==============================================");
                        System.out.println(ANSI_BLUE + "FORMULARIO DE REGISTRO DE EMPLEADOS" + ANSI_RESET);
                        for (int i = 1; i <= numEmployees; i++) {
                            employee = new EmployeeClass();
                            System.out.println("\n" + ANSI_BLUE + "      Empleado " + i + ANSI_RESET);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET);
                            int doc = Integer.parseInt(insDatos.nextLine());

                            System.out.println(ANSI_BLUE + "Nombre completo: " + ANSI_RESET);
                            String fullName = insDatos.nextLine();

                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET);
                            String email = insDatos.nextLine();

                            employee.setId(doc);
                            employee.setName(fullName);
                            employee.setEmail(email);
                            employeeList.add(employee);
                            JobPositionClass jobPos = new JobPositionClass(employee);
                            jobPos.CreateJobPos();
                            jobs.add(jobPos);
                            //Aqui obligatoriamente debe ser de producción
                        }

                        for (int i = 0; i < employeeList.size(); i++) {
                            EmployeeClass employee_ = (EmployeeClass) employeeList.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee_.getId());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee_.getName());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee_.getEmail());
                            System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee_.getSalary());
                            System.out.println(ANSI_BLUE + "Cargo: " + ANSI_RESET + jobs.get(i).getNamePos());
                            System.out.println(ANSI_BLUE + "Nivel jerárquico: " + ANSI_RESET + jobs.get(i).getLevel());
                        }
                        System.out.println("==============EMPLEADO CREADO CON ÉXITO=============");
                    } else {
                        System.out.println("¿Cuántos empleados deseas añadir?");
                        int numEmployees = Integer.parseInt(insDatos.nextLine());
                        System.out.println("\n===============================================");
                        System.out.println(ANSI_BLUE + "FORMULARIO DE REGISTRO DE EMPLEADOS" + ANSI_RESET);
                        for (int i = 1; i <= numEmployees; i++) {
                            System.out.println("\n" + ANSI_BLUE + "      Empleado " + i + ANSI_RESET);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET);
                            int doc = Integer.parseInt(insDatos.nextLine());

                            System.out.println(ANSI_BLUE + "Nombre completo: " + ANSI_RESET);
                            String fullName = insDatos.nextLine();

                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET);
                            String email = insDatos.nextLine();

                            System.out.println(ANSI_BLUE + "Categoría: (Senior, Semi-Senior, Junior)" + ANSI_RESET);
                            String category = insDatos.nextLine();

                            AdminClass admin = new AdminClass(doc, fullName, email, category);
                            employeeList.add(admin);
                            JobPositionClass jobPos = new JobPositionClass(employee);
                            jobPos.CreateJobPos();
                            jobs.add(jobPos);
                        }

                        for (int i = 0; i < employeeList.size(); i++) {
                            EmployeeClass employee_ = (EmployeeClass) employeeList.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee_.getId());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee_.getName());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee_.getEmail());
                            System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee_.getSalary());
                            System.out.println(ANSI_BLUE + "Cargo: " + ANSI_RESET + jobs.get(i).getNamePos());
                            System.out.println(ANSI_BLUE + "Nivel jerárquico: " + ANSI_RESET + jobs.get(i).getLevel());
                            System.out.println("\n==============EMPLEADO CREADO CON ÉXITO=============\n");
                        }
                    }
                    break;
                case 2:
                    System.out.println("===============BASE DE DATOS EMPLEADOS===============");
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.println("\n" + ANSI_BLUE + "      Empleado " + (i + 1) + ANSI_RESET);
                        EmployeeClass employee1 = (EmployeeClass) employeeList.get(i);
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee1.getId());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee1.getName());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee1.getEmail());
                        System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee1.getSalary());
                        System.out.println(ANSI_BLUE + "Cargo: " + ANSI_RESET + jobs.get(i).getNamePos());
                        System.out.println(ANSI_BLUE + "Nivel jerárquico: " + ANSI_RESET + jobs.get(i).getLevel());
                    }
                    break;
                case 3:
                    System.out.println("===============EDITAR INFORMACIÓN DEL EMPLEADO===============");
                    System.out.println("Ingresa el índice del empleado a editar: ");
                    int index = Integer.parseInt(insDatos.nextLine());
                    if (index >= 0 && index <= employeeList.size()) {
                        EmployeeClass employee2 = (EmployeeClass) employeeList.get(index);
                        System.out.println("===============INFORMACIÓN ACTUAL DEL EMPLEADO===============");
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee2.getId());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee2.getName());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee2.getEmail());
                        System.out.println("¿Qué campo deseas editar?\n     1. Documento\n     2. Nombre\n     3. Email\n");
                        int editField = Integer.parseInt(insDatos.nextLine());
                        switch (editField) {
                            case 1:
                                System.out.println("Documento nuevo: ");
                                int newId = Integer.parseInt(insDatos.nextLine());
                                employee2.setId(newId);
                                break;
                            case 2:
                                System.out.println("Nombre nuevo: ");
                                String newName = insDatos.nextLine();
                                employee2.setName(newName);
                                break;
                            case 3:
                                System.out.println("Email nuevo: ");
                                String newEmail = insDatos.nextLine();
                                employee2.setEmail(newEmail);
                                break;
                        }
                        System.out.println("===========LA INFORMACIÓN DEL EMPLEADO FUE ACTUALIZADA EXITOSAMENTE===========");
                    }
                    break;
                case 4:
                    System.out.println(ANSI_RED + "=============ELIMINAR INFORMACIÓN DEL EMPLEADO=============" + ANSI_RESET);
                    System.out.println("Ingresa el índice del empleado a eliminar: ");
                    int indexRemove = Integer.parseInt(insDatos.nextLine());
                    if (indexRemove >= 0 && indexRemove <= employeeList.size()) {
                        EmployeeClass employee2 = (EmployeeClass) employeeList.get(indexRemove);
                        System.out.println("===============INFORMACIÓN ACTUAL DEL EMPLEADO===============");
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee2.getId());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee2.getName());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee2.getEmail());
                        System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee2.getSalary());
                        System.out.println("¿Estás seguro que deseas eliminar a " + employee2.getName() + "? (Si, No)");
                        String answer = insDatos.nextLine();
                        if (answer.toLowerCase().equals("si") || answer.toLowerCase().equals("sí")) {
                            employeeList.remove(indexRemove);
                        } else {
                            System.out.println("=================CANCELANDO PROCESO=================");
                        }
                        System.out.println(ANSI_BLUE + "BASE DE DATOS EMPLEADOS ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < employeeList.size(); i++) {
                            System.out.println("\n" + ANSI_BLUE + "       Empleado " + (i + 1) + ANSI_RESET);
                            EmployeeClass employee3 = employeeList.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee3.getId());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee3.getName());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee3.getEmail());
                            System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee3.getSalary());
                        }
                    }
                    break;
                case 5:
                    boolean exit = false;
                    while (!exit) {
                        System.out.println(ANSI_BLUE + "=============ADMINISTRAR PERSONAL SUBORDINADO============" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
                        System.out.println(" 1. Insertar subordinado");
                        System.out.println(" 2. Consultar lista de subordinados");
                        System.out.println(" 3. Buscar un subordinado en específico");                        
                        System.out.println(" 4. Salir");
                        System.out.println(ANSI_BLUE + "Ingresa tu respuesta: " + ANSI_RESET);
                        int sub = Integer.parseInt(insDatos.nextLine());
                        switch (sub) {
                            case 1:
                                System.out.println("¿Cuántos subordinados deseas añadir?");
                                int numSubordinates = Integer.parseInt(insDatos.nextLine());
                                System.out.println("\n==============================================");
                                System.out.println(ANSI_BLUE + "FORMULARIO DE REGISTRO DE SUBORDINADOS" + ANSI_RESET);
                                for (int i = 1; i <= numSubordinates; i++) {
                                    employee = new EmployeeClass();
                                    System.out.println("\n" + ANSI_BLUE + "      Empleado " + i + ANSI_RESET);
                                    System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET);
                                    int subDoc = Integer.parseInt(insDatos.nextLine());

                                    System.out.println(ANSI_BLUE + "Nombre completo: " + ANSI_RESET);
                                    String subName = insDatos.nextLine();

                                    System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET);
                                    String subEmail = insDatos.nextLine();

                                    System.out.println(ANSI_BLUE + "Nivel del cual el empleado es subordinado (Institucional, Intermedio, Operacional, Ejecución): " + ANSI_RESET);
                                    String subLevel = insDatos.nextLine();

                                    employee.setId(subDoc);
                                    employee.setName(subName);
                                    employee.setEmail(subEmail);
                                    JobPositionClass job = new JobPositionClass(employee);
//                                    jobs.get(i).setNamePos(subLevel);
                                    job.setEmployee(employee);
                                    subordinates.add(employee);                                    
                                }
                                for (int i = 0; i < subordinates.size(); i++) {
                                    System.out.println(i + 1 + ". " + subordinates.get(i).getName());
                                    System.out.println("\n" + ANSI_BLUE + "      Subordinado " + (i + 1) + ANSI_RESET);
                                    EmployeeClass subEmployee = (EmployeeClass) subordinates.get(i);
                                    System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + subEmployee.getId());
                                    System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + subEmployee.getName());
                                    System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + subEmployee.getEmail());                                    
                                    System.out.println(ANSI_BLUE + "Subordinado de : " + ANSI_RESET + jobs.get(i).getLevel());                                   
                                }
                                System.out.println("============SUBORDINADO AGREGADO CREADO CON ÉXITO=============");
                                break;
                            case 2:
                                System.out.println("=================BASE DE DATOS DE SUBORDINADOS=================");
                                for (int i = 0; i < subordinates.size(); i++) {
                                    System.out.println(i + 1 + ". " + subordinates.get(i).getName());
                                    System.out.println("\n" + ANSI_BLUE + "      Subordinado " + (i + 1) + ANSI_RESET);
                                    EmployeeClass subEmployee = (EmployeeClass) subordinates.get(i);
                                    System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + subEmployee.getId());
                                    System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + subEmployee.getName());
                                    System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + subEmployee.getEmail());                                    
                                    System.out.println(ANSI_BLUE + "Subordinado de : " + ANSI_RESET + jobs.get(i).getLevel());                                    
                                    System.out.println("EL total de subordinados es " + subordinates.size());
                                }
                                break;
                            case 3:
                                System.out.println("Ingresa el nombre del subordinado que desea consultar: ");
                                String nameSub = insDatos.nextLine();
                                JobPositionClass job1 = new JobPositionClass(employee);
                                for (int i = 0; i < subordinates.size(); i++) {
                                    if (subordinates.get(i).getName().equals(nameSub)) {
                                        System.out.println("El empleado " + nameSub + " es subordinado " + job1.getLevel());
                                    }
                                }
                                break;
                            case 4:
                                exit = true;
                                System.out.println("=======================SALIENDO DEL PROGRAMA===================");
                            default:
                                System.out.println(ANSI_RED + "======================OPCIÓN INVÁLIDA====================" + ANSI_RESET);
                        }
                        break;
                    }
                case 6:
                    exitProgram = true;
                    System.out.println(ANSI_RED + "==================SALIENDO DEL PROGRAMA===================" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "=======================OPCIÓN INVÁLIDA======================" + ANSI_RESET);
                    break;
            }
        }
    }
    //Método para realizar el CRUD de los clientes

    public void crudClients() {
        boolean exitProgram = false;
        while (!exitProgram) {
            System.out.println(ANSI_GREEN + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println(" 1. Crear cliente");
            System.out.println(" 2. Consultar lista de clientes");
            System.out.println(" 3. Editar cliente");
            System.out.println(" 4. Eliminar cliente");
            System.out.println(" 5. Salir");
            System.out.println(ANSI_GREEN + "Ingresa tu respuesta: " + ANSI_RESET);
            int option = Integer.parseInt(insDatos.nextLine());

            switch (option) {
                case 1:
                    System.out.println("¿Cuántos clientes deseas añadir?");
                    int numClients = Integer.parseInt(insDatos.nextLine());
                    System.out.println("\n ==============================================");
                    System.out.println(ANSI_GREEN + "FORMULARIO DE REGISTRO DE CLIENTES" + ANSI_RESET);
                    for (int i = 1; i <= numClients; i++) {
//                        client = new ClientClass();
                        System.out.println("\n" + ANSI_GREEN + "      Cliente " + i + ANSI_RESET);
                        System.out.println(ANSI_GREEN + "Documento: " + ANSI_RESET);
                        int doc = Integer.parseInt(insDatos.nextLine());

                        System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET);
                        String name = insDatos.nextLine();

                        System.out.println(ANSI_GREEN + "Email: " + ANSI_RESET);
                        String email = insDatos.nextLine();

                        System.out.println(ANSI_GREEN + "Teléfono: " + ANSI_RESET);
                        int phone = Integer.parseInt(insDatos.nextLine());

                        System.out.println(ANSI_GREEN + "Dirección: " + ANSI_RESET);
                        String address = insDatos.nextLine();
                        ClientClass client = new ClientClass(doc, name, email, phone, address);
                        clientList.add(client);
                        System.out.println("==============CLIENTE CREADO CON ÉXITO=============");
                    }
                    break;
                case 2:
                    System.out.println("===============BASE DE DATOS CLIENTES===============");
                    for (int i = 0; i < clientList.size(); i++) {
                        System.out.println("\n" + ANSI_GREEN + "      Cliente " + (i + 1) + ANSI_RESET);
                        ClientClass client1 = (ClientClass) clientList.get(i);
                        System.out.println(ANSI_GREEN + "Documento: " + ANSI_RESET + client1.getId());
                        System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + client1.getName());
                        System.out.println(ANSI_GREEN + "Email: " + ANSI_RESET + client1.getEmail());
                        System.out.println(ANSI_GREEN + "Teléfono: " + ANSI_RESET + client1.getTelephone());
                        System.out.println(ANSI_GREEN + "Dirección: " + ANSI_RESET + client1.getAddress());
                    }
                    break;
                case 3:
                    System.out.println("===============EDITAR INFORMACIÓN DEL CLIENTE===============");
                    System.out.println("Ingresa el índice del cliente a editar: ");
                    int index = Integer.parseInt(insDatos.nextLine());
                    if (index >= 0 && index <= clientList.size()) {
                        ClientClass client2 = (ClientClass) clientList.get(index);
                        System.out.println("===============INFORMACIÓN ACTUAL DEL EMPLEADO===============");
                        System.out.println(ANSI_GREEN + "Documento: " + ANSI_RESET + client2.getId());
                        System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + client2.getName());
                        System.out.println(ANSI_GREEN + "Email: " + ANSI_RESET + client2.getEmail());
                        System.out.println(ANSI_GREEN + "Teléfono: " + ANSI_RESET + client2.getTelephone());
                        System.out.println(ANSI_GREEN + "Dirección: " + ANSI_RESET + client2.getAddress());
                        System.out.println("¿Qué campo deseas editar?\n     1. Documento\n     2. Nombre\n     3. Email\n     4. Teléfono\n     5. Dirección");
                        int editField = Integer.parseInt(insDatos.nextLine());
                        switch (editField) {
                            case 1:
                                System.out.println("Documento nuevo: ");
                                int newId = Integer.parseInt(insDatos.nextLine());
                                client2.setId(newId);
                                break;
                            case 2:
                                System.out.println("Nombre nuevo: ");
                                String newName = insDatos.nextLine();
                                client2.setName(newName);
                                break;
                            case 3:
                                System.out.println("Email nuevo: ");
                                String newEmail = insDatos.nextLine();
                                client2.setEmail(newEmail);
                                break;
                            case 4:
                                System.out.println("Teléfono nuevo: ");
                                int newPhone = Integer.parseInt(insDatos.nextLine());
                                client2.setTelephone(newPhone);
                                break;
                            case 5:
                                System.out.println("Dirección nueva: ");
                                String newAddress = insDatos.nextLine();
                                client2.setAddress(newAddress);
                                break;
                        }
                        System.out.println("===========LA INFORMACIÓN DEL CLIENTE FUE ACTUALIZADA EXITOSAMENTE===========");
                    }
                    break;
                case 4:
                    System.out.println(ANSI_RED + "=============ELIMINAR INFORMACIÓN DEL CLIENTE=============" + ANSI_RESET);
                    System.out.println("Ingresa el índice del cliente a eliminar: ");
                    int indexRemove = Integer.parseInt(insDatos.nextLine());
                    if (indexRemove >= 0 && indexRemove <= clientList.size()) {
                        ClientClass client3 = (ClientClass) clientList.get(indexRemove);
                        System.out.println("===============INFORMACIÓN ACTUAL DEL CLIENTE===============");
                        System.out.println(ANSI_GREEN + "Documento: " + ANSI_RESET + client3.getId());
                        System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + client3.getName());
                        System.out.println(ANSI_GREEN + "Email: " + ANSI_RESET + client3.getEmail());
                        System.out.println(ANSI_GREEN + "Teléfono: " + ANSI_RESET + client3.getTelephone());
                        System.out.println(ANSI_GREEN + "Dirección: " + ANSI_RESET + client3.getAddress());
                        System.out.println("¿Estás seguro que deseas eliminar a " + client3.getName() + "? (Si, No)");
                        String answer = insDatos.nextLine();
                        if (answer.toLowerCase().equals("si") || answer.toLowerCase().equals("sí")) {
                            clientList.remove(indexRemove);
                        } else {
                            System.out.println("===============CANCELANDO PROCESO===============");
                        }
                        System.out.println(ANSI_GREEN + "BASE DE DATOS CLIENTES ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < clientList.size(); i++) {
                            System.out.println("\n" + ANSI_GREEN + "       CLIENTE " + (i + 1) + ANSI_RESET);
                            ClientClass client4 = clientList.get(i);
                            System.out.println(ANSI_GREEN + "Documento: " + ANSI_RESET + client4.getId());
                            System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + client4.getName());
                            System.out.println(ANSI_GREEN + "Email: " + ANSI_RESET + client4.getEmail());
                            System.out.println(ANSI_GREEN + "Teléfono: " + ANSI_RESET + client4.getTelephone());
                            System.out.println(ANSI_GREEN + "Dirección: " + ANSI_RESET + client4.getAddress());
                        }
                    }
                    break;
                case 5:
                    exitProgram = true;
                    System.out.println(ANSI_RED + "===================SALIENDO DEL PROGRAMA===================" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "=====================OPCIÓN INVÁLIDA=======================" + ANSI_RESET);
                    break;
            }

        }

    }

}
