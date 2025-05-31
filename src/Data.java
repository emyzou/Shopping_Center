public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano){

        if ( ano < 1900 || ano > 2025){
            System.out.println("Data inválida: ano inválido");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }else{
            this.ano = ano;
        }

        if ( mes < 1 || mes >12){
            System.out.println("Data inválida: mes inválido");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }else{
            this.mes = mes;
        }

       if (dia < 1 || dia > 31){
           System.out.println("Data inválida: dia invalido");
           this.dia = 1;
           this.mes = 1;
           this.ano = 2000;
       }else if (dia == 31 &&( mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) ){
           System.out.println("Data inválida: dia inválido");
           this.dia = 1;
           this.mes = 1;
           this.ano = 2000;
       }else if (dia == 29 && mes == 2 &&  verificaAnoBissexto() == false){
           System.out.println("Data inválida: dia inválido");
           this.dia = 1;
           this.mes = 1;
           this.ano = 2000;
       }else{
           this.dia = dia;
       }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}
