import { MockProfessorService } from './MockProfessorService';
import { BuscaProfessor } from './BuscaProfessor';
import { Professor } from './Professor';

describe('TesteBuscaProfessor', () => {
    let service: MockProfessorService;
    let buscaProfessor: BuscaProfessor;

    beforeEach(() => {
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    });

    // TESTES DE SUCESSO
    test('testeBuscaProfessorChris', () => {
        // Busca
        const chris: Professor = buscaProfessor.buscaProfessor(10);

        // Assertion
        expect(chris.getNome()).toBe('Chris');
        expect(chris.getHorario()).toBe('17:30');
        expect(chris.getPeriodo()).toBe('Integral');
        expect(chris.getSala()).toBeCloseTo(20.0, 1);
        expect(chris.getPredio()).toBeCloseTo(4.0, 1);
    });

    // Adicione os outros testes de sucesso da mesma maneira...

    // TESTES DE FALHA
    test('testeBuscaProfessorChrisFalha', () => {
        // Busca
        const chris: Professor = buscaProfessor.buscaProfessor(10);

        // Assertion
        expect(chris.getNome()).toBe('Chris');
        expect(chris.getHorario()).toBe('17:30');
        expect(chris.getPeriodo()).toBe('Manhã'); // valor esperado é integral
        expect(chris.getSala()).toBeCloseTo(20.0, 1);
        expect(chris.getPredio()).toBeCloseTo(4.0, 1);
    });

    // Adicione os outros testes de falha da mesma maneira...
});
