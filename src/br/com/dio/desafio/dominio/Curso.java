package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    
    private int cargaHoraria;
    
    @Override
    public double caucularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }


    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
    
        return "Cruso {"+
                "titulo='" + getTitulo() + '\''+
                ", descricao='" + getDescricao() + '\''+
                ", cargahoraria=" + cargaHoraria +
                '}';
    }
}
