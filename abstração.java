public class ProvaUniversidade {

    private double NotaAV1;
    private double NotaAV2;

    public ProvaUniversidade (double NotaAV1, double NotaAV2){

        this.NotaAV1 = NotaAV1;
        this.NotaAV2 = NotaAV2;

    }

    public double calcularMedia(){
        return (NotaAV1 + NotaAV2) / 2;
    }

    public double getNota1(){
        return NotaAV1;
    }

    public double getNota2(){
        return NotaAV2;
    }
}

    class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double NotaAV1, double NotaAV2) {
        super (NotaAV1, NotaAV2);

    }
    public boolean aprovado() {
        return calcularMedia() >=7.0;
    }

}

 class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double NotaAV1, double NotaAV2) {
        super (NotaAV1, NotaAV2);
    }

    public boolean aprovado(){
        return calcularMedia() >=6.0;
    }
}

     class Teste {

        public static void main(String[] args) {
            ProvaUCB provadaucb = new ProvaUCB(8.5, 4.6);
            ProvaFafifo provadafafifo = new ProvaFafifo(7.0, 6.8);

                System.out.println("Aprovado na UCB :" + (provadaucb.aprovado() ? " SIM" : "NÃO"));
                System.out.println("Aprovado na Fafifo : " + (provadafafifo.aprovado() ? " SIM" : "NÃO"));

         }

    }
