/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod;

/**
 *
 * @author badr
 */
public class SousMarin extends Navire{

    public SousMarin() {
    }

    public SousMarin(int coordonneeX, int coordonneeY, int partie_touchee, String type, String position) {
        super(coordonneeX, coordonneeY, 4, type, position);
    }
    
}
