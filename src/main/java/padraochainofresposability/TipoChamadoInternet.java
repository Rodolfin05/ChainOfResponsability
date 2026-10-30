package padraochainofresposability;

public class TipoChamadoInternet implements TipoChamado {

    private static TipoChamadoInternet tipoChamadoInternet = new TipoChamadoInternet();

    private TipoChamadoInternet() {};

    public static TipoChamadoInternet getTipoChamadoInternet() {
        return tipoChamadoInternet;
    }
}
