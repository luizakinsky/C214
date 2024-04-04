class Professor {
    private nome: string;
    private horario: string;
    private periodo: string;
    private sala: number;
    private predio: number;

    constructor(nome: string, horario: string, periodo: string, sala: number, predio: number) {
        this.nome = nome;
        this.horario = horario;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    public getNome(): string {
        return this.nome;
    }

    public setNome(nome: string): void {
        this.nome = nome;
    }

    public getHorario(): string {
        return this.horario;
    }

    public setHorario(horario: string): void {
        this.horario = horario;
    }

    public getPeriodo(): string {
        return this.periodo;
    }

    public setPeriodo(periodo: string): void {
        this.periodo = periodo;
    }

    public getSala(): number {
        return this.sala;
    }

    public setSala(sala: number): void {
        this.sala = sala;
    }

    public getPredio(): number {
        return this.predio;
    }

    public setPredio(predio: number): void {
        this.predio = predio;
    }
}
