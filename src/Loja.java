public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        salarioBaseFuncionario = -1;
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

    @Override
    public String toString () {
        return nome + " " + quantidadeFuncionarios + " " + salarioBaseFuncionario;
    }
}
