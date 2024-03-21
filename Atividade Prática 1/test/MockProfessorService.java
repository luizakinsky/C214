public class MockProfessorService implements ProfessorService {


    @Override
    public String busca(int id) {

        if (id == 10){
            return ProfessorConst.CHRIS;
        }else if (id == 20){
            return ProfessorConst.RENZO;
        }else if (id == 30){
            return ProfessorConst.RENAN;
        }else if (id == 40){
            return ProfessorConst.JOAO;
        }else if (id == 50){
            return ProfessorConst.EDSON;
        }else if (id == 60){
            return ProfessorConst.LUIZ;
        }else if (id == 70){
            return ProfessorConst.CARLOS;
        }else if (id == 80){
            return ProfessorConst.DANIELA;
        }else if (id == 90){
            return ProfessorConst.GUILHERME;
        }else if (id == 100){
            return ProfessorConst.MARCELO;
        }else if(id < 0){
            return ProfessorConst.INEXISTENTE;
        }else{
            return ProfessorConst.PADRAO;
        }
    }

    @Override
    public boolean professorExistente(int id) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i <= id; i=i+10){
            list.add(i);
        }

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}