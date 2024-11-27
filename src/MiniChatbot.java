public class MiniChatbot {
    void iniciar() {
        System.out.println("Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?");
    }

    void responder(String entrada) {
        entrada = entrada.toLowerCase();

        if (entrada.contains("oi") || entrada.contains("olá")) {
            System.out.println("Olá! Como posso ajudar?");
        } else if (entrada.contains("qual é o seu nome")) {
            System.out.println("Eu sou o MiniChatbot, seu assistente virtual!");
        } else if (entrada.contains("como você está")) {
            System.out.println("Estou funcionando perfeitamente, obrigado!");
        } else if (entrada.equals("sair")) {
            System.out.println("Tchau! Até a próxima.");
        } else {
            System.out.println("Desculpe, não entendi sua pergunta. Pode reformular?");
        }
    }

}
