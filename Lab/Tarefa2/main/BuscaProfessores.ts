import { ProfessorService } from './ProfessorService';
import { Professor } from './Professores';

export class BuscaProfessor {
    private professorService: ProfessorService;

    constructor(service: ProfessorService) {
        this.professorService = service;
    }

    public buscaProfessor(id: number): Professor {
        const professorJson: string = this.professorService.busca(id);
        const jsonObject: any = JSON.parse(professorJson);

        return new Professor(
            jsonObject.nome as string,
            jsonObject.horario as string,
            jsonObject.periodo as string,
            Number(jsonObject.sala),
            Number(jsonObject.predio)
        );
    }

    public verificaArrayListExistente(id: number): boolean {
        return this.professorService.professorExistente(id);
    }
}
