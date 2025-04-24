public class Livro extends ItemBiblioteca implements Emprestavel {
    private boolean emprestado;

    public Livro(String titulo, int ano) {
        super(titulo, ano);
        this.emprestado = false;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Livro: " + titulo + " (" + ano + ")");
    }

    @Override
    public void emprestar() throws Exception {
        if (emprestado) {
            throw new Exception("Livro já está emprestado.");
        }
        emprestado = true;
        System.out.println("Livro emprestado com sucesso.");
    }

    @Override
    public void devolver() throws Exception {
        if (!emprestado) {
            throw new Exception("Livro não está emprestado.");
        }
        emprestado = false;
        System.out.println("Livro devolvido com sucesso.");
    }
}
