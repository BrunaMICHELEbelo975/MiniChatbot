import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = "";

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");
        entrada = sc.nextLine();

        while(!entrada.equals("sair")){
                if (entrada.contains("oi") || entrada.contains("olá")) {
                    System.out.println("Olá! Como posso ajudar?");
                    entrada = sc.nextLine();
                } else if (entrada.contains("qual é o seu nome")) {
                    System.out.println("Eu sou o MiniChatbot, seu assistente virtual!");
                    entrada = sc.nextLine();
                } else if (entrada.contains("como você está")) {
                    System.out.println("Estou funcionando perfeitamente, obrigado!");
                    entrada = sc.nextLine();
                }while (!entrada.equals("oi") && !entrada.equals("oi") && !entrada.equals("qual é o seu nome") && !entrada.equals("como você está") && !entrada.equals("como você está") && !entrada.equals("sair")){
                    System.out.println("Desculpe, não entendi sua pergunta. Pode reformular?");
                    entrada = sc.nextLine();
                }
        }
        System.out.println("Tchau! Até a próxima.");
    }}
