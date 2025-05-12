package Questao10;

import java.util.ArrayList;
import java.util.List;

public class GestorProjeto {
    private List<MembroEquipe> equipe = new ArrayList<>();

    public void adicionarMembro(MembroEquipe membro) {
        equipe.add(membro);
    }

    public String exibirRelatorio(MembroEquipe membro) {
        return membro.obterDetalhes() + "\nTarefa atual: " + membro.trabalhar();
    }

    public List<MembroEquipe> listarEquipePorProjeto(String projeto) {
        List<MembroEquipe> membrosProjeto = new ArrayList<>();
        for (MembroEquipe membro : equipe) {
            if (membro.projeto.equals(projeto)) {
                membrosProjeto.add(membro);
            }
        }
        return membrosProjeto;
    }
}
