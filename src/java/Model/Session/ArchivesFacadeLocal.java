/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Session;

import Model.Entity.Archives;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface ArchivesFacadeLocal {

    void create(Archives archives);

    void edit(Archives archives);

    void remove(Archives archives);

    Archives find(Object id);

    List<Archives> findAll();

    List<Archives> findRange(int[] range);

    int count();
    
}
