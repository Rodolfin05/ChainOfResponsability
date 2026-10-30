package padraochainofresposability;

public class AtendenteSuporte extends Atendente {

    public AtendenteSuporte(Atendente superior) {
        listaChamados.add(TipoChamadoSenha.getTipoChamadoSenha());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte";
    }

}
