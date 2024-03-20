public class Professor {

    private String nome;
    private String horario;
    private String periodo;
    private double sala;
    private double predio;

    public Inimigo (String nome, String horario, String periodo, double sala, double predio){
        this.nome = nome;
        this.horario = horario;
        this.periodo = periodo;
        this. sala = sala;
        this.predio = predio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPredio() {
        return periodo;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }
}
