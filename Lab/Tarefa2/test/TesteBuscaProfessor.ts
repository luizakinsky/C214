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

    // Teste Unitário
    test('testeBuscaProfessorInvalido', () => {
        // Busca
        const professorInvalido: Professor | null = buscaProfessor.buscaProfessor(-1);

        // Assertion
        expect(professorInvalido).toBeNull();
    });

    // Testes de Mock
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

    test('testeBuscaProfessorRenzo', () => {
        // Busca
        const renzo: Professor = buscaProfessor.buscaProfessor(20);

        // Assertion
        expect(renzo.getNome()).toBe('Renzo');
        expect(renzo.getHorario()).toBe('19:30');
        expect(renzo.getPeriodo()).toBe('Noturno');
        expect(renzo.getSala()).toBeCloseTo(10.0, 1);
        expect(renzo.getPredio()).toBeCloseTo(2.0, 1);
    });

    test('testeBuscaProfessorRenan', () => {
        // Busca
        const renan: Professor = buscaProfessor.buscaProfessor(30);

        // Assertion
        expect(renan.getNome()).toBe('Renan');
        expect(renan.getHorario()).toBe('13:30');
        expect(renan.getPeriodo()).toBe('Integral');
        expect(renan.getSala()).toBeCloseTo(15.0, 1);
        expect(renan.getPredio()).toBeCloseTo(3.0, 1);
    });

    test('testeBuscaProfessorJoao', () => {
        // Busca
        const joao: Professor = buscaProfessor.buscaProfessor(40);

        // Assertion
        expect(joao.getNome()).toBe('Joao');
        expect(joao.getHorario()).toBe('17:30');
        expect(joao.getPeriodo()).toBe('Integral');
        expect(joao.getSala()).toBeCloseTo(13.0, 1);
        expect(joao.getPredio()).toBeCloseTo(3.0, 1);
    });

    test('testeBuscaProfessorEdson', () => {
        // Busca
        const edson: Professor = buscaProfessor.buscaProfessor(50);

        // Assertion
        expect(edson.getNome()).toBe('Edson');
        expect(edson.getHorario()).toBe('15:30');
        expect(edson.getPeriodo()).toBe('Integral');
        expect(edson.getSala()).toBeCloseTo(3.0, 1);
        expect(edson.getPredio()).toBeCloseTo(1.0, 1);
    });
});
