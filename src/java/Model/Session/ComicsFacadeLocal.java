/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Session;

import Model.Entity.Comics;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface ComicsFacadeLocal {

    void create(Comics comics);

    void edit(Comics comics);

    void remove(Comics comics);

    Comics find(Object id);

    List<Comics> findAll();

    List<Comics> findRange(int[] range);

    int count();
    
}
