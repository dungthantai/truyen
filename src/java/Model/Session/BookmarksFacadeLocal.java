/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Session;

import Model.Entity.Bookmarks;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DTT
 */
@Local
public interface BookmarksFacadeLocal {

    void create(Bookmarks bookmarks);

    void edit(Bookmarks bookmarks);

    void remove(Bookmarks bookmarks);

    Bookmarks find(Object id);

    List<Bookmarks> findAll();

    List<Bookmarks> findRange(int[] range);

    int count();
    
}
