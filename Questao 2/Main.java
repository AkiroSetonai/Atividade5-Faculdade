import java.util.ArrayList;

abstract class Funcionario {
    public abstract double calcularSalario();
}

class FuncionarioTempoIntegral extends Funcionario {
    private double salarioMensal;
    
    public FuncionarioTempoIntegral(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

class FuncionarioMeioPeriodo extends Funcionario {
    private double taxaPorHora;
    private int horasPorMes;
    
    public FuncionarioMeioPeriodo(double taxaPorHora, int horasPorMes) {
        this.taxaPorHora = taxaPorHora;
        this.horasPorMes = horasPorMes;
    }
    
    @Override
    public double calcularSalario() {
        return taxaPorHora * horasPorMes;
    }
}

class FuncionarioContratado extends Funcionario {
    private double salarioContrato;
    
    public FuncionarioContratado(double salarioContrato) {
        this.salarioContrato = salarioContrato;
    }
    
    @Override
    public double calcularSalario() {
        return salarioContrato;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioTempoIntegral(4500.0));
        funcionarios.add(new FuncionarioMeioPeriodo(45.0, 80));
        funcionarios.add(new FuncionarioContratado(3200.0));
        
        for (Funcionario func : funcionarios) {
            System.out.println("Salário: R$ " + func.calcularSalario());
        }
    }
}