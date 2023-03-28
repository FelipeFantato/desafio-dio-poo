package br.com.dio.desafio.dominio;

public class Professor extends Dev{

    private String areaDeEnsino;
    private Integer aulasGravadas;

    public Integer getAulasGravadas() {
        return aulasGravadas;
    }

    public void setAulasGravadas(Integer aulasGravadas) {
        this.aulasGravadas = aulasGravadas;
    }

    public String getAreaDeEnsino() {
        return areaDeEnsino;
    }

    public void setAreaDeEnsino(String areaDeEnsino) {
        this.areaDeEnsino = areaDeEnsino;
    }
}
