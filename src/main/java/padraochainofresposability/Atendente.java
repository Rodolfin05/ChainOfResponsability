package padraochainofresposability;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listaChamados = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior() {
        return atendenteSuperior;
    }

    public void setAtendenteSuperior(Atendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }

    public abstract String getDescricaoCargo();

    public String atenderChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        }
        else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.atenderChamado(chamado);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}
