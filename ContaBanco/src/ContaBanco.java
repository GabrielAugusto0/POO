public class ContaBanco{
    //atributos
    public String nomeCliente;
    public int numeroConta, agencia;
    public float saldo;
    public boolean status;

    //metodo construtor
    public ContaBanco(){

    }
    public ContaBanco(String nomeCliente){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0;
        this.status = true;
    }
    //depositar
    public void depositar(float x){
        if(this.status){
            this.status = true;
            this.saldo += x;
            System.out.println("status ativo, deposito confirmado!! " + this.saldo);

        }

    }
    public void sacar(float x){
        if (this.status && this.saldo + x >= 0){
            this.saldo += x;
        } else {
            System.out.print("Saldo insulficiente!!" + this.saldo);
        }
    }
}