package padraochainofresposability;

public class TipoChamadoReembolso implements TipoChamado {

    private static TipoChamadoReembolso tipoChamadoReembolso = new TipoChamadoReembolso();

    private TipoChamadoReembolso() {};

    public static TipoChamadoReembolso getTipoChamadoReembolso() {
        return tipoChamadoReembolso;
    }
}
