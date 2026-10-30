package padraochainofresposability;

public class AtendenteTecnico extends Atendente {

    public AtendenteTecnico(Atendente superior) {
        listaChamados.add(TipoChamadoInternet.getTipoChamadoInternet());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Tecnico";
    }

}
