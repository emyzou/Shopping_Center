public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto [] estoqueProdutos;



    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[quantidadeEstoque];
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario() {
        //Verificando se o salário é -1 para retornar o mét
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        //retorna o valor total dos gastos das lojas com os funci
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';

        } else if (quantidadeFuncionarios <= 30) {
            return 'M';

        } else {
            return 'G';
        }
    }

    public void imprimeProdutos () {

        for(int i = 0 ; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i]);
            }
        }
    }

    public boolean insereProduto (Produto produto1){
        for ( int i = 0 ; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto1;
                return true;
            }
        }
               return false;
    }

    public boolean removeProduto (String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
               return false;
    }

    @Override
    public String toString () {
        return nome + " " + quantidadeFuncionarios + " " + salarioBaseFuncionario + " " + endereco + " " + dataFundacao
                + " " + estoqueProdutos;
    }
}
