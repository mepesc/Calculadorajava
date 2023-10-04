import java.util.Scanner;
class calculador{
public static void main(String [] args){
        
        Scanner scanner = new Scanner (System.in);

double Soma;
double Sub;
double Div;
double Mult;

System.out.print("Digite o primeiro numero:"); 
Double Valor1 = scanner.nextDouble();
System.out.print("Digite o segundo  numero:");
Double Valor2 = scanner.nextDouble();
System.out.print("Digite o operador matematico +, -, *, / :");
char operador = scanner.next().charAt(0);
Soma = Valor1 + Valor2;
Sub = Valor1 - Valor2;
Div = Valor1 / Valor2;
Mult = Valor1 * Valor2;

if (operador == '+'){
    System.out.println("O valor da soma: " +Soma);
}else if (operador == '-'){
    System.out.println("O valor da subtracao: " +Sub);
}else if (operador == '*'){
    System.out.println("O valor da multiplicacao: " +Mult);
}else if (operador == '/'){
    System.out.println("O valor da divisao: " +Div);
}else {
    System.out.println("formato invalido");
}
}
}
