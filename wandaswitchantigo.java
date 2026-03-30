public class wandaswitchantigo {
    public static void main(String[] args) {
        String faseWanda = "WandaVision";
        String status;

            switch (faseWanda) {
                case "Vingadora":
                    status = "Heroína em treinamento";
                    break;
                case "WandaVision":
                    status = "Criação do Hex e vida suburbana";
                    break;
                case "Feiticeira Escarlate":
                    status = "Domínio da Magia do Caos";
                    break;
                default:
                    status = "Fase desconhecida";
                    break;
            }

        System.out.println("Fase de Wanda: " + faseWanda);
        System.out.println("Status: " + status);
        }
}
