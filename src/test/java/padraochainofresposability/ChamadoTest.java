package padraochainofresposability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    AtendenteGerente gerente;
    AtendenteAnalista analista;
    AtendenteTecnico tecnico;
    AtendenteSuporte suporte;

    @BeforeEach
    void setUp() {
        gerente = new AtendenteGerente(null);
        analista = new AtendenteAnalista(gerente);
        tecnico = new AtendenteTecnico(analista);
        suporte = new AtendenteSuporte(tecnico);
    }

    @Test
    void deveRetornarSuporteParaChamadoSenha() {
        assertEquals("Suporte", suporte.atenderChamado(new Chamado(TipoChamadoSenha.getTipoChamadoSenha())));
    }

    @Test
    void deveRetornarTecnicoParaChamadoInternet() {
        assertEquals("Tecnico", suporte.atenderChamado(new Chamado(TipoChamadoInternet.getTipoChamadoInternet())));
    }

    @Test
    void deveRetornarAnalistaParaChamadoSistema() {
        assertEquals("Analista", suporte.atenderChamado(new Chamado(TipoChamadoSistema.getTipoChamadoSistema())));
    }

    @Test
    void deveRetornarGerenteParaChamadoReembolso() {
        assertEquals("Gerente", suporte.atenderChamado(new Chamado(TipoChamadoReembolso.getTipoChamadoReembolso())));
    }

    @Test
    void deveRetornarSemAtendimentoParaChamadoJuridico() {
        assertEquals("Sem atendimento", suporte.atenderChamado(new Chamado(TipoChamadoJuridico.getTipoChamadoJuridico())));
    }

}
