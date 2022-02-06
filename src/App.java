import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        List<String> month = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "10Noviembre", "Diciembre");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println("output="+month.get(i-1));
    }
}