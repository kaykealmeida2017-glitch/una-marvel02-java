public class marvelswitch {
    public static void main(String[] args) {
        String faseWanda = "Feiticeira Escarlate";

        String status = switch (faseWanda) {

            case "Vingadora" -> "Heroína em treinamento de controle de poderes";
            case "WandaVision" -> "Criação de realidade alternativa (hex) por luto";
            case "Feiticeira Escarlate" -> "Poder máximo: Manipulação da magia do caos e Darkhold";
            case "Civil war" -> "Confinamento no complexo dos vingadores";
            default -> "Fase não identificada no multiverso";
        };
        System.out.println("Status de Wanda: " + status);
        
    }
}