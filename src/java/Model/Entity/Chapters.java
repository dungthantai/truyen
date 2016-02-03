/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DTT
 */
@Entity
@Table(name = "chapters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chapters.findAll", query = "SELECT c FROM Chapters c"),
    @NamedQuery(name = "Chapters.findById", query = "SELECT c FROM Chapters c WHERE c.id = :id"),
    @NamedQuery(name = "Chapters.findByTeamId", query = "SELECT c FROM Chapters c WHERE c.teamId = :teamId"),
    @NamedQuery(name = "Chapters.findByChapter", query = "SELECT c FROM Chapters c WHERE c.chapter = :chapter"),
    @NamedQuery(name = "Chapters.findBySubchapter", query = "SELECT c FROM Chapters c WHERE c.subchapter = :subchapter"),
    @NamedQuery(name = "Chapters.findByVolume", query = "SELECT c FROM Chapters c WHERE c.volume = :volume"),
    @NamedQuery(name = "Chapters.findByLanguage", query = "SELECT c FROM Chapters c WHERE c.language = :language"),
    @NamedQuery(name = "Chapters.findByName", query = "SELECT c FROM Chapters c WHERE c.name = :name"),
    @NamedQuery(name = "Chapters.findByStub", query = "SELECT c FROM Chapters c WHERE c.stub = :stub"),
    @NamedQuery(name = "Chapters.findByUniqid", query = "SELECT c FROM Chapters c WHERE c.uniqid = :uniqid"),
    @NamedQuery(name = "Chapters.findByDescription", query = "SELECT c FROM Chapters c WHERE c.description = :description"),
    @NamedQuery(name = "Chapters.findByThumbnail", query = "SELECT c FROM Chapters c WHERE c.thumbnail = :thumbnail"),
    @NamedQuery(name = "Chapters.findByCreated", query = "SELECT c FROM Chapters c WHERE c.created = :created"),
    @NamedQuery(name = "Chapters.findByUpdated", query = "SELECT c FROM Chapters c WHERE c.updated = :updated"),
    @NamedQuery(name = "Chapters.findByCreator", query = "SELECT c FROM Chapters c WHERE c.creator = :creator"),
    @NamedQuery(name = "Chapters.findByEditor", query = "SELECT c FROM Chapters c WHERE c.editor = :editor"),
    @NamedQuery(name = "Chapters.findByChecked", query = "SELECT c FROM Chapters c WHERE c.checked = :checked"),
    @NamedQuery(name = "Chapters.findByViewed", query = "SELECT c FROM Chapters c WHERE c.viewed = :viewed")})
public class Chapters implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "team_id")
    private Integer teamId;
    @Column(name = "chapter")
    private Integer chapter;
    @Column(name = "subchapter")
    private Integer subchapter;
    @Column(name = "volume")
    private Integer volume;
    @Size(max = 2147483647)
    @Column(name = "language")
    private String language;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @Size(max = 2147483647)
    @Column(name = "stub")
    private String stub;
    @Size(max = 2147483647)
    @Column(name = "uniqid")
    private String uniqid;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 2147483647)
    @Column(name = "thumbnail")
    private String thumbnail;
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
    @Column(name = "checked")
    private Integer checked;
    @Column(name = "viewed")
    private Integer viewed;
    @OneToMany(mappedBy = "chapterId")
    private List<Pages> pagesList;
    @JoinColumn(name = "comic_id", referencedColumnName = "id")
    @ManyToOne
    private Comics comicId;

    public Chapters() {
    }

    public Chapters(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getSubchapter() {
        return subchapter;
    }

    public void setSubchapter(Integer subchapter) {
        this.subchapter = subchapter;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStub() {
        return stub;
    }

    public void setStub(String stub) {
        this.stub = stub;
    }

    public String getUniqid() {
        return uniqid;
    }

    public void setUniqid(String uniqid) {
        this.uniqid = uniqid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public Integer getViewed() {
        return viewed;
    }

    public void setViewed(Integer viewed) {
        this.viewed = viewed;
    }

    @XmlTransient
    public List<Pages> getPagesList() {
        return pagesList;
    }

    public void setPagesList(List<Pages> pagesList) {
        this.pagesList = pagesList;
    }

    public Comics getComicId() {
        return comicId;
    }

    public void setComicId(Comics comicId) {
        this.comicId = comicId;
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
        if (!(object instanceof Chapters)) {
            return false;
        }
        Chapters other = (Chapters) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Chapters[ id=" + id + " ]";
    }
    
}
