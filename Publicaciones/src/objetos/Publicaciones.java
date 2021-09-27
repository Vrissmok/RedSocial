/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import objetos.Usuario;

/**
 *
 * @author crist
 */
public class Publicaciones{
    
    /**
    *   Contenido de la publicación.
    */
    private String contenidoPublicación;
    
    /**
    *   Nombre de quieén la publico.
    */
    private String nombrePublico;
    
    /**
    *   Si es publico o privado.
    */
    private String privOamigos;

    /**
     * 
     * @param contenidoPublicación Donde se guardara el contenido de la publicación.
     * @param nombrePublico Mostrara el nombre del Usuario 
     * @param privOamigos A quien se mostrara ya sea privado o publico
     * 
     */
    
    public Publicaciones(String contenidoPublicación, String privOamigos, Usuario usuario) {
        this.contenidoPublicación = contenidoPublicación;
        nombrePublico = usuario.getNombre();
        this.privOamigos = privOamigos;
    }

    public String getContenidoPublicación() {
        return contenidoPublicación;
    }

    public String getNombrePublico() {
        return nombrePublico;
    }

    public String getPubOamigos() {
        return pubOamigos;
    }

    public void setContenidoPublicación(String contenidoPublicación) {
        this.contenidoPublicación = contenidoPublicación;
    }

    public void setNombrePublico(String nombrePublico) {
        this.nombrePublico = nombrePublico;
    }

    public void setPubOamigos(String pubOamigos) {
        this.pubOamigos = pubOamigos;
    }
    
    
    
}
