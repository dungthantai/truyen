/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DTT
 */
@Entity
@Table(name = "pages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pages.findAll", query = "SELECT p FROM Pages p"),
    @NamedQuery(name = "Pages.findById", query = "SELECT p FROM Pages p WHERE p.id = :id"),
    @NamedQuery(name = "Pages.findByFilename", query = "SELECT p FROM Pages p WHERE p.filename = :filename"),
    @NamedQuery(name = "Pages.findByCreated", query = "SELECT p FROM Pages p WHERE p.created = :created"),
    @NamedQuery(name = "Pages.findByUpdated", query = "SELECT p FROM Pages p WHERE p.updated = :updated"),
    @NamedQuery(name = "Pages.findByCreator", query = "SELECT p FROM Pages p WHERE p.creator = :creator"),
    @NamedQuery(name = "Pages.findByEditor", query = "SELECT p FROM Pages p WHERE p.editor = :editor"),
    @NamedQuery(name = "Pages.findBySize", query = "SELECT p FROM Pages p WHERE p.size = :size")})
public class Pages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "filename")
    private String filename;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @Column(name = "creator")
    private Integer creator;
    @Column(name = "editor")
    private Integer editor;
    @Column(name = "size")
    private Integer size;
    @JoinColumn(name = "chapter_id", referencedColumnName = "id")
    @ManyToOne
    private Chapters chapterId;

    public Pages() {
    }

    public Pages(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getEditor() {
        return editor;
    }

    public void setEditor(Integer editor) {
        this.editor = editor;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Chapters getChapterId() {
        return chapterId;
    }

    public void setChapterId(Chapters chapterId) {
        this.chapterId = chapterId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pages)) {
            return false;
        }
        Pages other = (Pages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Pages[ id=" + id + " ]";
    }
    
}
