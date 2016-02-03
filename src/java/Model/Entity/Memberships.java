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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DTT
 */
@Entity
@Table(name = "memberships")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memberships.findAll", query = "SELECT m FROM Memberships m"),
    @NamedQuery(name = "Memberships.findById", query = "SELECT m FROM Memberships m WHERE m.id = :id"),
    @NamedQuery(name = "Memberships.findByIsLeader", query = "SELECT m FROM Memberships m WHERE m.isLeader = :isLeader"),
    @NamedQuery(name = "Memberships.findByAccepted", query = "SELECT m FROM Memberships m WHERE m.accepted = :accepted"),
    @NamedQuery(name = "Memberships.findByRequested", query = "SELECT m FROM Memberships m WHERE m.requested = :requested"),
    @NamedQuery(name = "Memberships.findByApplied", query = "SELECT m FROM Memberships m WHERE m.applied = :applied"),
    @NamedQuery(name = "Memberships.findByCreated", query = "SELECT m FROM Memberships m WHERE m.created = :created"),
    @NamedQuery(name = "Memberships.findByUpdated", query = "SELECT m FROM Memberships m WHERE m.updated = :updated")})
public class Memberships implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "is_leader")
    private Integer isLeader;
    @Column(name = "accepted")
    private Integer accepted;
    @Column(name = "requested")
    private Integer requested;
    @Column(name = "applied")
    private Integer applied;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    @ManyToOne
    private Teams teamId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    private Users userId;

    public Memberships() {
    }

    public Memberships(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public Integer getAccepted() {
        return accepted;
    }

    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
    }

    public Integer getRequested() {
        return requested;
    }

    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    public Integer getApplied() {
        return applied;
    }

    public void setApplied(Integer applied) {
        this.applied = applied;
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

    public Teams getTeamId() {
        return teamId;
    }

    public void setTeamId(Teams teamId) {
        this.teamId = teamId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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
        if (!(object instanceof Memberships)) {
            return false;
        }
        Memberships other = (Memberships) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Memberships[ id=" + id + " ]";
    }
    
}
