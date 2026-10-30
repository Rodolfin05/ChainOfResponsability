package padraochainofresposability;

public class AtendenteGerente extends Atendente {

    public AtendenteGerente(Atendente superior) {
        listaChamados.add(TipoChamadoReembolso.getTipoChamadoReembolso());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }

}
