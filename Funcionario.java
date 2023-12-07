public class Funcionario{
    private String Nome;
    private int Idade;
    private double Salario;
    private int Id;
    private String Cargo;

    public void String setNome(String nome){
        this.nome = Nome;
    }
    public String getNome(){
        return this.Nome;
    }

    public void int setIdade(int Idade){
        this.Idade = Idade;
    }
    public int getIdade(){
        return this.Idade;
    }

    public void double setSalario(double Salario){
        this.Salario = Salario;
    }
    public double getSalario(){
        return this.Salario;
    }

    public void int setId(int Id){
        this.Id= Id;
    }
    public int getId(){
        return this.Id;
    }

    public void String setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    public String getCargo(){
        return thisCargo;
    }

    public void pagamento(double Salario){
        System.out.println("Nome do funcionario: "+this.Nome);
        System.out.println("Cargo do Funcionario: "+this.Cargo);
        System.out.println("O salario do funcionario: "+this.Salario);
        
    }



}