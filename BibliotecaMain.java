public class BibliotecaMain {
    public static void main(String[] args) {
        Livro livro = new Livro("Java para Iniciantes", 2021);
        Revista revista = new Revista("Estácio News", 2023);

        livro.exibirInfo();
        revista.exibirInfo();

        try {
            livro.emprestar();
            livro.emprestar(); // Tenta emprestar de novo — lança exceção
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            livro.devolver();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
