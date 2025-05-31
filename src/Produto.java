public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto (String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido (Data data ){
        if ( data.getAno() > dataValidade.getAno() ){
            return true;
        }else if( data.getAno() == dataValidade.getAno() && data.getMes() > dataValidade.getMes()){
            return true;
        } else if ( data.getAno() == dataValidade.getAno() && data.getMes() == dataValidade.getMes() && data.getDia() > dataValidade.getDia()){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return nome + " " + preco + " " + dataValidade;
    }
}

