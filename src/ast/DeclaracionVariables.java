/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Gabriel
 */
public class DeclaracionVariables extends Codigo {

    public Tipo t;
    public ListaVariables lv;

    public DeclaracionVariables(Tipo t, ListaVariables lv) {
        this.t = t;
        this.lv = lv;
    }

}