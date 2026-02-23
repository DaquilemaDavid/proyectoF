package com.utc.proyectoF.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @Column(name = "codigo_car", nullable = false)
    private Long codigoCar;

    @Column(name = "area_car")
    private String areaCar;

    @Column(name = "codigo_est")
    private Long codigoEst;

    @Column(name = "codigo_sectorial_car")
    private String codigoSectorialCar;

    @Column(name = "cod_cargo_legajo_car")
    private String codCargoLegajoCar;

    @Column(name = "estado_car")
    private String estadoCar;

    @Column(name = "grupo_riesgo_car")
    private String grupoRiesgoCar;

    @Column(name = "macroproceso_car")
    private String macroprocesoCar;

    @Column(name = "maquinaria_equipo_car")
    private String maquinariaEquipoCar;

    @Column(name = "mision_car")
    private String misionCar;

    @Column(name = "nivel_riesgo_car")
    private String nivelRiesgoCar;

    @Column(name = "nombre_car")
    private String nombreCar;

    @Column(name = "proceso_car")
    private String procesoCar;

    @Column(name = "reemplazo_car")
    private Long reemplazoCar;

    @Column(name = "reemplazo_cargo_car")
    private Long reemplazoCargoCar;

    @Column(name = "reporta_car")
    private Long reportaCar;

    @Column(name = "reporta_cargo_car")
    private Long reportaCargoCar;

    @Column(name = "seccion_1")
    private Integer seccion1;

    @Column(name = "seccion_2")
    private Integer seccion2;

    @Column(name = "seccion_3")
    private Integer seccion3;

    @Column(name = "seccion_4")
    private Integer seccion4;

    @Column(name = "seccion_5")
    private Integer seccion5;

    @Column(name = "seccion_6")
    private Integer seccion6;

    @Column(name = "seccion_7")
    private Integer seccion7;

    @Column(name = "seccion_8")
    private Integer seccion8;

    @Column(name = "seccion_car")
    private String seccionCar;

    // Constructor vacío obligatorio
    public Cargo() {
    }

    // ===== GETTERS & SETTERS =====

    public Long getCodigoCar() { return codigoCar; }
    public void setCodigoCar(Long codigoCar) { this.codigoCar = codigoCar; }

    public String getAreaCar() { return areaCar; }
    public void setAreaCar(String areaCar) { this.areaCar = areaCar; }

    public Long getCodigoEst() { return codigoEst; }
    public void setCodigoEst(Long codigoEst) { this.codigoEst = codigoEst; }

    public String getCodigoSectorialCar() { return codigoSectorialCar; }
    public void setCodigoSectorialCar(String codigoSectorialCar) { this.codigoSectorialCar = codigoSectorialCar; }

    public String getCodCargoLegajoCar() { return codCargoLegajoCar; }
    public void setCodCargoLegajoCar(String codCargoLegajoCar) { this.codCargoLegajoCar = codCargoLegajoCar; }

    public String getEstadoCar() { return estadoCar; }
    public void setEstadoCar(String estadoCar) { this.estadoCar = estadoCar; }

    public String getGrupoRiesgoCar() { return grupoRiesgoCar; }
    public void setGrupoRiesgoCar(String grupoRiesgoCar) { this.grupoRiesgoCar = grupoRiesgoCar; }

    public String getMacroprocesoCar() { return macroprocesoCar; }
    public void setMacroprocesoCar(String macroprocesoCar) { this.macroprocesoCar = macroprocesoCar; }

    public String getMaquinariaEquipoCar() { return maquinariaEquipoCar; }
    public void setMaquinariaEquipoCar(String maquinariaEquipoCar) { this.maquinariaEquipoCar = maquinariaEquipoCar; }

    public String getMisionCar() { return misionCar; }
    public void setMisionCar(String misionCar) { this.misionCar = misionCar; }

    public String getNivelRiesgoCar() { return nivelRiesgoCar; }
    public void setNivelRiesgoCar(String nivelRiesgoCar) { this.nivelRiesgoCar = nivelRiesgoCar; }

    public String getNombreCar() { return nombreCar; }
    public void setNombreCar(String nombreCar) { this.nombreCar = nombreCar; }

    public String getProcesoCar() { return procesoCar; }
    public void setProcesoCar(String procesoCar) { this.procesoCar = procesoCar; }

    public Long getReemplazoCar() { return reemplazoCar; }
    public void setReemplazoCar(Long reemplazoCar) { this.reemplazoCar = reemplazoCar; }

    public Long getReemplazoCargoCar() { return reemplazoCargoCar; }
    public void setReemplazoCargoCar(Long reemplazoCargoCar) { this.reemplazoCargoCar = reemplazoCargoCar; }

    public Long getReportaCar() { return reportaCar; }
    public void setReportaCar(Long reportaCar) { this.reportaCar = reportaCar; }

    public Long getReportaCargoCar() { return reportaCargoCar; }
    public void setReportaCargoCar(Long reportaCargoCar) { this.reportaCargoCar = reportaCargoCar; }

    public Integer getSeccion1() { return seccion1; }
    public void setSeccion1(Integer seccion1) { this.seccion1 = seccion1; }

    public Integer getSeccion2() { return seccion2; }
    public void setSeccion2(Integer seccion2) { this.seccion2 = seccion2; }

    public Integer getSeccion3() { return seccion3; }
    public void setSeccion3(Integer seccion3) { this.seccion3 = seccion3; }

    public Integer getSeccion4() { return seccion4; }
    public void setSeccion4(Integer seccion4) { this.seccion4 = seccion4; }

    public Integer getSeccion5() { return seccion5; }
    public void setSeccion5(Integer seccion5) { this.seccion5 = seccion5; }

    public Integer getSeccion6() { return seccion6; }
    public void setSeccion6(Integer seccion6) { this.seccion6 = seccion6; }

    public Integer getSeccion7() { return seccion7; }
    public void setSeccion7(Integer seccion7) { this.seccion7 = seccion7; }

    public Integer getSeccion8() { return seccion8; }
    public void setSeccion8(Integer seccion8) { this.seccion8 = seccion8; }

    public String getSeccionCar() { return seccionCar; }
    public void setSeccionCar(String seccionCar) { this.seccionCar = seccionCar; }
}