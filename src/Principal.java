import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("(1) Criar uma loja:\n");

            System.out.println("(2) Criar uma produto:\n");

            System.out.println("(3) Sair:\n");

            System.out.println("Digite a opção que deseja: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome da loja: ");
                    String nomeLoja = sc.nextLine();

                    System.out.println("Digite a quantidade dos funcionários:");
                    int funcionariosLoja = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o salário dos funcionários:");
                    double salarioLoja = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite o nome da rua:");
                    String ruaLoja = sc.nextLine();

                    System.out.println(" Digite a cidade da loja:");
                    String cidadeLoja = sc.nextLine();

                    System.out.println("Digite o estado da loja:");
                    String estadoLoja = sc.nextLine();

                    System.out.println("Digite o país da loja:");
                    String paisLoja = sc.nextLine();

                    System.out.println("digite o cep da loja:");
                    String cepLoja = sc.nextLine();

                    System.out.println("Digite o número que reside a loja:");
                    String numeroLoja = sc.nextLine();

                    System.out.println("Digite o complemento da loja: ");
                    String complementoLoja = sc.nextLine();

                    System.out.println("Digite o dia de fundação da sua loja:");
                    int diaFundacaoLoja = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o mês de fundação da sua loja:");
                    int mesFundacaoLoja = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o ano de fundação da sua loja:");
                    int anoFundacaoLoja = sc.nextInt();
                    sc.nextLine();

                    Data dataFundacao = new Data(diaFundacaoLoja, mesFundacaoLoja, anoFundacaoLoja);

                    Endereco enderecoLoja = new Endereco (ruaLoja, cidadeLoja, estadoLoja, paisLoja, cepLoja, numeroLoja,complementoLoja);

                    Loja loja = new Loja(nomeLoja, funcionariosLoja, salarioLoja, enderecoLoja, dataFundacao, 10);

                    System.out.println("Loja criada com sucesso");

                    System.out.println(loja);
                    break;

                case 2:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = sc.nextLine();

                    System.out.println("Digite o preço do produto:");
                    double precoProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite o dia da validade do produto:");
                    int diaValidadeProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o mês de validade do produto:");
                    int mesValidadeProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o ano de validade do produto:");
                    int anoValidadeProduto = sc.nextInt();
                    sc.nextLine();

                    Data validade = new Data (diaValidadeProduto, mesValidadeProduto, anoValidadeProduto);

                    Produto produto = new Produto (nomeProduto,precoProduto, validade);

                    Data data = new Data(20, 10,2023);

                    if (produto.estaVencido(data)) {
                        System.out.println("PRODUTO VENCIDO");
                    }else{
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println(" Opção inválida.");
                    break;
            }
        }
    }
}

