package br.com.fag;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Aposta {
  private double concurso;
  private Date data;
  private int bola1;
  private int bola2;
  private int bola3;
  private int bola4;
  private int bola5;
  private int bola6;
  private int ganhadoreSeisAcertos;
  private String cidade;
  private BigDecimal rateioSeisAcertos;
  private int ganhadoreCincoAcertos;
  private BigDecimal rateioCincoAcertos;
  private int ganhadoreQuatroAcertos;
  private BigDecimal rateioQuatroAcertos;
  private BigDecimal acumuladosSeisAcertos;
  private BigDecimal arrecadacaoTotal;
  private BigDecimal estimativaPremio;
  private BigDecimal acumuladoSorteio;
  private String observacao;

}
