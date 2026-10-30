package padraochainofresposability;

public class AtendenteAnalista extends Atendente {

    public AtendenteAnalista(Atendente superior) {
        listaChamados.add(TipoChamadoSistema.getTipoChamadoSistema());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista";
    }

}
