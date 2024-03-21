public class TesteBuscaProfessor {

    ProfessorService service;
    BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    }

    // TESTES DE SUCESSO
    @Test
    public void testeBuscaProfessorChris(){
        // Busca
        Professor chris = buscaProfessor.buscaProfessor(10);

        // Assertion
        assertEquals("Chris", chris.getNome());
        assertEquals("17:30", chris.getHorario());
        assertEquals("Integral", chris.getPeriodo());
        assertEquals(20.0, chris.getSala(), 0.1);
        assertEquals(4.0, chris.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorRenzo(){
        // Busca
        Professor renzo = buscaProfessor.buscaProfessor(20);

        // Assertion
        assertEquals("Renzo", renzo.getNome());
        assertEquals("19:30", renzo.getHorario());
        assertEquals("Noturno", renzo.getPeriodo());
        assertEquals(10.0, renzo.getSala(), 0.1);
        assertEquals(2.0, renzo.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorRenan(){
        // Busca
        Professor renan = buscaProfessor.buscaProfessor(30);

        // Assertion
        assertEquals("Renan", renan.getNome());
        assertEquals("13:30", renan.getHorario());
        assertEquals("Integral", renan.getPeriodo());
        assertEquals(15.0, renan.getSala(), 0.1);
        assertEquals(3.0, renan.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorJoao(){
        // Busca
        Professor joao = buscaProfessor.buscaProfessor(40);

        // Assertion
        assertEquals("Joao", joao.getNome());
        assertEquals("17:30", joao.getHorario());
        assertEquals("Integral", joao.getPeriodo());
        assertEquals(13.0, joao.getSala(), 0.1);
        assertEquals(3.0, joao.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorEdson(){
        // Busca
        Professor edson = buscaProfessor.buscaProfessor(50);

        // Assertion
        assertEquals("Edson", edson.getNome());
        assertEquals("15:30", edson.getHorario());
        assertEquals("Integral", edson.getPeriodo());
        assertEquals(3.0, edson.getSala(), 0.1);
        assertEquals(1.0, edson.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorLuiz(){
        // Busca
        Professor luiz = buscaProfessor.buscaProfessor(60);

        // Assertion
        assertEquals("Luiz", luiz.getNome());
        assertEquals("13:30", luiz.getHorario());
        assertEquals("Integral", luiz.getPeriodo());
        assertEquals(7.0, luiz.getSala(), 0.1);
        assertEquals(2.0, luiz.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorCarlos(){
        // Busca
        Professor carlos = buscaProfessor.buscaProfessor(70);

        // Assertion
        assertEquals("Carlos", carlos.getNome());
        assertEquals("17:30", carlos.getHorario());
        assertEquals("Integral", carlos.getPeriodo());
        assertEquals(19.0, carlos.getSala(), 0.1);
        assertEquals(4.0, carlos.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorDaniela(){
        // Busca
        Professor daniela = buscaProfessor.buscaProfessor(80);

        // Assertion
        assertEquals("Daniela", daniela.getNome());
        assertEquals("15:30", daniela.getHorario());
        assertEquals("Integral", daniela.getPeriodo());
        assertEquals(27.0, daniela.getSala(), 0.1);
        assertEquals(6.0, daniela.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorGuilherme(){
        // Busca
        Professor guilherme = buscaProfessor.buscaProfessor(90);

        // Assertion
        assertEquals("Guilherme", guilherme.getNome());
        assertEquals("17:30", guilherme.getHorario());
        assertEquals("Integral", guilherme.getPeriodo());
        assertEquals(20.0, guilherme.getSala(), 0.1);
        assertEquals(4.0, guilherme.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorMarcelo(){
        // Busca
        Professor marcelo = buscaProfessor.buscaProfessor(100);

        // Assertion
        assertEquals("Marcelo", marcelo.getNome());
        assertEquals("17:30", marcelo.getHorario());
        assertEquals("Integral", marcelo.getPeriodo());
        assertEquals(8.0, marcelo.getSala(), 0.1);
        assertEquals(2.0, marcelo.getPredio(), 0.1);
    }

    @Test
    public void testeBuscaProfessorValido(){
        // Busca de um id válido
        boolean professorValido = buscaProfessor.verificaArrayListExistente(10);

        assertTrue(professorValido);
    }
    
    // TESTES DE FALHA
    @Test
    public void testeBuscaProfessorInValido(){
        // Busca de um id inválido
        boolean professorValido = buscaProfessor.verificaArrayListExistente(-8);

        assertFalse(professorValido);
    }
}