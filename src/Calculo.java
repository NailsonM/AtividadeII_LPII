public class Calculo {
    public Calculo(float totalSalario) {
        this.totalSalario = totalSalario;
    }

    private float totalSalario;

    public void calculaSalario(float salarioBase, float horasTrabalhadas) {
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public float getTotalSalario() {
        return totalSalario;
    }
}