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
public class nombreVariable {

    public String id;

    public nombreVariable(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
