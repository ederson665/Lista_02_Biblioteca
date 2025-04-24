public class Revista extends ItemBiblioteca {
    public Revista(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Revista: " + titulo + " (" + ano + ")");
    }
}
