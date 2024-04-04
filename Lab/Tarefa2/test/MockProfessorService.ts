class MockProfessorService implements ProfessorService {

    public busca(id: number): string {
        if (id === 10) {
            return ProfessorConst.CHRIS;
        } else if (id === 20) {
            return ProfessorConst.RENZO;
        } else if (id === 30) {
            return ProfessorConst.RENAN;
        } else if (id === 40) {
            return ProfessorConst.JOAO;
        } else if (id === 50) {
            return ProfessorConst.EDSON;
        } else if (id < 0) {
            return ProfessorConst.INEXISTENTE;
        } else {
            return ProfessorConst.PADRAO;
        }
    }

    public professorExistente(id: number): boolean {
        const list: number[] = [];
        for (let i = 0; i <= id; i += 10) {
            list.push(i);
        }

        for (let i = 0; i < list.length; i++) {
            if (list[i] === id || list[i] === id) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
