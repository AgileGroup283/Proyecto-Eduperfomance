import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String dataUsername = "usuario@dominio.com";
        String dataPassword = "123456";
        String username = "";
        String password = "";
        System.out.println("Bienvenido a Eduperformance");
        System.out.println("Por favor ingresa tu correo registrado: ");
        username = sc.nextLine();
        System.out.println("Por favor ingresa tu contraseña: ");
        password = sc.nextLine();
        if (username.equals(dataUsername) && password.equals(dataPassword)) {
            System.out.println("Bienvenido");
        } else if (username != dataUsername && password.equals(dataPassword)){
            System.out.println("Correo no registrado");
        } else if (username.equals(dataUsername) && password != dataPassword) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Correo o contraseña incorrectos");
        }

    }
}
