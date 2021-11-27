import java.util.Scanner;

public class Media
{
public static void main(String args[])
{
java.util.Scanner nota = new Scanner(System.in);
java.util.Scanner nome = new Scanner(System.in);
float n1, n2, n3, n4, mf;
String name;
System.out.print("Digite seu nome: ");
name = nome.next();
System.out.print("Entre com a nota do primeiro BI: ");
n1 = nota.nextFloat();
System.out.print("Entre com a nota do segundo BI: ");
n2 = nota.nextFloat();
System.out.print("Entre com a nota do terceiro BI: ");
n3 = nota.nextFloat();
System.out.print("Entre com a nota do quarto BI: ");
n4 = nota.nextFloat();
mf = (n1+n2+n3+n4)/4;
if(mf >= 7)
{
System.out.println(name + ", Voce foi APROVADO.");
}
else
{
System.out.println(name + ", Voce foi REPROVADO.");
}
System.out.print("A media final é de: " + mf + " pontos.");
}
}