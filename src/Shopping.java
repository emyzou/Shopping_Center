import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja [] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja (Loja loja) {
        for( int i = 0 ; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja (String nomeLoja){
        for ( int i = 0 ; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo (String tipoLoja){
        if(!tipoLoja.equalsIgnoreCase("Alimentação")&& !tipoLoja.equalsIgnoreCase("Bijuteria")&& !tipoLoja.equalsIgnoreCase("Cosmético") && !tipoLoja.equalsIgnoreCase("Informática")&& !tipoLoja.equalsIgnoreCase("Vestuário")){
            return -1;
        }

        int contador = 0;
        for (int i = 0 ; i < lojas.length; i ++){

            if(lojas[i] != null && lojas[i] instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")){
                contador++;
            }

            if(lojas[i] != null && lojas[i] instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")){
                contador++;
            }

            if(lojas[i] != null && lojas[i] instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")){
                contador++;
            }

            if(lojas[i] != null && lojas[i] instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")){
                contador++;
            }

            if(lojas[i] != null && lojas[i] instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")){
                contador++;
            }
        }

        if(contador == 0){
            return -1;
        }

        return contador;
    }

    public Informatica lojaSeguroMaisCaro (){
        Informatica lojaMaisCara = null;
        for (int i = 0 ; i < lojas.length; i ++){
            if(lojas[i] != null && lojas[i] instanceof Informatica){
                lojaMaisCara = (Informatica) lojas[i];
                double seguroMaisCaro = lojaMaisCara.getSeguroEletronicos();
                if(((Informatica) lojas[i]).getSeguroEletronicos() > seguroMaisCaro){
                    lojaMaisCara = (Informatica) lojas[i];
                }
            }
        }
        return lojaMaisCara;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }
}
