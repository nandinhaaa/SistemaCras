package javalinkedlist;

public class Familia implements Comparable<Familia> {

    private String nome;
    private int numIntegrantes;
    private int tempo;
    private int cartaoBolsaFamilia;

    public void setCartaoBolsa(int cartaoSUS) {
        this.cartaoBolsaFamilia = cartaoSUS;
    }

    public int getCartaoBolsa() {
        return cartaoBolsaFamilia;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the prioridade
     */
    public int getIntegrante() {
        return numIntegrantes;
    }

    /**
     * @param idade the prioridade to set
     */
    public void setIntegrante(int idade) {
        this.numIntegrantes = idade;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int compareTo(Familia outraFamilia) {
        return getNome().compareTo(outraFamilia.getNome());
    }

    @Override
    public String toString() {
        return getNome() + ":" + getIntegrante() + " - " + getTempo()+ " - " + getCartaoBolsa();
    }// fim toString

}
