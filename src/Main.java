import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    Estudiante estudianteUno = new Estudiante("juanito","Informatica", 21);

    estudianteUno.mostrarInformacion();

    System.out.println("Ingrese nombre del estudiante:  ");
    String nombre = scanner.next();

    System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

   System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();


    }
}