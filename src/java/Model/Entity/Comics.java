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
@Table(name = "comics")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comics.findAll", query = "SELECT c FROM Comics c"),
    @NamedQuery(name = "Comics.findById", query = "SELECT c FROM Comics c WHERE c.id = :id"),
    @NamedQuery(name = "Comics.findByName", query = "SELECT c FROM Comics c WHERE c.name = :name"),
    @NamedQuery(name = "Comics.findByStub", query = "SELECT c FROM Comics c WHERE c.stub = :stub"),
    @NamedQuery(name = "Comics.findByUniqid", query = "SELECT c FROM Comics c WHERE c.uniqid = :uniqid"),
    @NamedQuery(name = "Comics.findByAuthor", query = "SELECT c FROM Comics c WHERE c.author = :author"),
    @NamedQuery(name = "Comics.findByDescription", query = "SELECT c FROM Comics c WHERE c.description = :description"),
    @NamedQuery(name = "Comics.findByThumbnail", query = "SELECT c FROM Comics c WHERE c.thumbnail = :thumbnail"),
    @NamedQuery(name = "Comics.findByCustomchapter", query = "SELECT c FROM Comics c WHERE c.customchapter = :customchapter"),
    @NamedQuery(name = "Comics.findByFormat", query = "SELECT c FROM Comics c WHERE c.format = :format"),
    @NamedQuery(name = "Comics.findByHidden", query = "SELECT c FROM Comics c WHERE c.hidden = :hidden"),
    @NamedQuery(name = "Comics.findByAdult", query = "SELECT c FROM Comics c WHERE c.adult = :adult"),
    @NamedQuery(name = "Comics.findByCreated", query = "SELECT c FROM Comics c WHERE c.created = :created"),
    @NamedQuery(name = "Comics.findByUpdated", query = "SELECT c FROM Comics c WHERE c.updated = :updated"),
    @NamedQuery(name = "Comics.findByCreator", query = "SELECT c FROM Comics c WHERE c.creator = :creator"),
    @NamedQuery(name = "Comics.findByEditor", query = "SELECT c FROM Comics c WHERE c.editor = :editor"),
    @NamedQuery(name = "Comics.findByChecked", query = "SELECT c FROM Comics c WHERE c.checked = :checked"),
    @NamedQuery(name = "Comics.findByViewed", query = "SELECT c FROM Comics c WHERE c.viewed = :viewed")})
public class Comics implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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
    @Column(name = "author")
    private String author;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 2147483647)
    @Column(name = "thumbnail")
    private String thumbnail;
    @Size(max = 2147483647)
    @Column(name = "customchapter")
    private String customchapter;
    @Column(name = "format")
    private Integer format;
    @Column(name = "hidden")
    private Integer hidden;
    @Column(name = "adult")
    private Integer adult;
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
    @OneToMany(mappedBy = "comicId")
    private List<Bookmarks> bookmarksList;
    @OneToMany(mappedBy = "comicId")
    private List<Chapters> chaptersList;

    public Comics() {
    }

    public Comics(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getCustomchapter() {
        return customchapter;
    }

    public void setCustomchapter(String customchapter) {
        this.customchapter = customchapter;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
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
    public List<Bookmarks> getBookmarksList() {
        return bookmarksList;
    }

    public void setBookmarksList(List<Bookmarks> bookmarksList) {
        this.bookmarksList = bookmarksList;
    }

    @XmlTransient
    public List<Chapters> getChaptersList() {
        return chaptersList;
    }

    public void setChaptersList(List<Chapters> chaptersList) {
        this.chaptersList = chaptersList;
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
        if (!(object instanceof Comics)) {
            return false;
        }
        Comics other = (Comics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Comics[ id=" + id + " ]";
    }
    
}
