public abstract class ItemBiblioteca {
    protected String titulo;
    protected int ano;

    public ItemBiblioteca(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public abstract void exibirInfo();
}
