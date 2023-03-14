public class exec2 {

    public static void main(String[] args) {

        try {
            criarCliente();
        } catch (Exception e) {
            System.out.print("Falha ao criar o cliente. Erro: " + e.getMessage());
        }
    }

    public static void criarCliente() throws Exception {
        Cliente c = new Cliente();
        c.setIdade(5);
    }

}
