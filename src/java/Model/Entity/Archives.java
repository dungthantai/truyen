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
@Table(name = "archives")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Archives.findAll", query = "SELECT a FROM Archives a"),
    @NamedQuery(name = "Archives.findById", query = "SELECT a FROM Archives a WHERE a.id = :id"),
    @NamedQuery(name = "Archives.findByFilename", query = "SELECT a FROM Archives a WHERE a.filename = :filename"),
    @NamedQuery(name = "Archives.findBySize", query = "SELECT a FROM Archives a WHERE a.size = :size"),
    @NamedQuery(name = "Archives.findByCreated", query = "SELECT a FROM Archives a WHERE a.created = :created"),
    @NamedQuery(name = "Archives.findByUpdated", query = "SELECT a FROM Archives a WHERE a.updated = :updated"),
    @NamedQuery(name = "Archives.findByLastdownload", query = "SELECT a FROM Archives a WHERE a.lastdownload = :lastdownload")})
public class Archives implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "filename")
    private String filename;
    @Column(name = "size")
    private Integer size;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @Column(name = "lastdownload")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastdownload;

    public Archives() {
    }

    public Archives(Integer id) {
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public Date getLastdownload() {
        return lastdownload;
    }

    public void setLastdownload(Date lastdownload) {
        this.lastdownload = lastdownload;
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
        if (!(object instanceof Archives)) {
            return false;
        }
        Archives other = (Archives) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Archives[ id=" + id + " ]";
    }
    
}
