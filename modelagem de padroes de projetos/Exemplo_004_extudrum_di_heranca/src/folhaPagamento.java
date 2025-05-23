import java.util.ArrayList;
import java.util.List;

public class folhaPagamento{
    
    private List<Funcionarios> funcionarios;

    public folhaPagamento() {
        funcionarios = new ArrayList<>();
    }
    
    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    
    public void adicionarFuncionario(Funcionarios novo)
    {
        funcionarios.add(novo);
    }
    public double calcularValorTotal(){
    
        double total = 0;

        for (Funcionarios funcionario : funcionarios)
        {
            total = total + funcionario.calcularSalario();
        }
        
        return total;
    }
}
