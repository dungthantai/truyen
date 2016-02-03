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
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id"),
    @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username"),
    @NamedQuery(name = "Users.findByDisplayName", query = "SELECT u FROM Users u WHERE u.displayName = :displayName"),
    @NamedQuery(name = "Users.findByBio", query = "SELECT u FROM Users u WHERE u.bio = :bio"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email"),
    @NamedQuery(name = "Users.findByGroupId", query = "SELECT u FROM Users u WHERE u.groupId = :groupId"),
    @NamedQuery(name = "Users.findByActivated", query = "SELECT u FROM Users u WHERE u.activated = :activated"),
    @NamedQuery(name = "Users.findByBanned", query = "SELECT u FROM Users u WHERE u.banned = :banned"),
    @NamedQuery(name = "Users.findByBanReason", query = "SELECT u FROM Users u WHERE u.banReason = :banReason"),
    @NamedQuery(name = "Users.findByNewPasswordKey", query = "SELECT u FROM Users u WHERE u.newPasswordKey = :newPasswordKey"),
    @NamedQuery(name = "Users.findByNewPasswordRequested", query = "SELECT u FROM Users u WHERE u.newPasswordRequested = :newPasswordRequested"),
    @NamedQuery(name = "Users.findByNewEmail", query = "SELECT u FROM Users u WHERE u.newEmail = :newEmail"),
    @NamedQuery(name = "Users.findByNewEmailKey", query = "SELECT u FROM Users u WHERE u.newEmailKey = :newEmailKey"),
    @NamedQuery(name = "Users.findByLastIp", query = "SELECT u FROM Users u WHERE u.lastIp = :lastIp"),
    @NamedQuery(name = "Users.findByLastLogin", query = "SELECT u FROM Users u WHERE u.lastLogin = :lastLogin"),
    @NamedQuery(name = "Users.findByCreated", query = "SELECT u FROM Users u WHERE u.created = :created"),
    @NamedQuery(name = "Users.findByModified", query = "SELECT u FROM Users u WHERE u.modified = :modified"),
    @NamedQuery(name = "Users.findByUpdated", query = "SELECT u FROM Users u WHERE u.updated = :updated")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "username")
    private String username;
    @Size(max = 2147483647)
    @Column(name = "display_name")
    private String displayName;
    @Size(max = 2147483647)
    @Column(name = "bio")
    private String bio;
    @Size(max = 2147483647)
    @Column(name = "password")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "activated")
    private Integer activated;
    @Column(name = "banned")
    private Integer banned;
    @Size(max = 2147483647)
    @Column(name = "ban_reason")
    private String banReason;
    @Size(max = 2147483647)
    @Column(name = "new_password_key")
    private String newPasswordKey;
    @Column(name = "new_password_requested")
    @Temporal(TemporalType.TIMESTAMP)
    private Date newPasswordRequested;
    @Size(max = 2147483647)
    @Column(name = "new_email")
    private String newEmail;
    @Size(max = 2147483647)
    @Column(name = "new_email_key")
    private String newEmailKey;
    @Size(max = 2147483647)
    @Column(name = "last_ip")
    private String lastIp;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @OneToMany(mappedBy = "userId")
    private List<Bookmarks> bookmarksList;
    @OneToMany(mappedBy = "userId")
    private List<Memberships> membershipsList;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public Integer getBanned() {
        return banned;
    }

    public void setBanned(Integer banned) {
        this.banned = banned;
    }

    public String getBanReason() {
        return banReason;
    }

    public void setBanReason(String banReason) {
        this.banReason = banReason;
    }

    public String getNewPasswordKey() {
        return newPasswordKey;
    }

    public void setNewPasswordKey(String newPasswordKey) {
        this.newPasswordKey = newPasswordKey;
    }

    public Date getNewPasswordRequested() {
        return newPasswordRequested;
    }

    public void setNewPasswordRequested(Date newPasswordRequested) {
        this.newPasswordRequested = newPasswordRequested;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewEmailKey() {
        return newEmailKey;
    }

    public void setNewEmailKey(String newEmailKey) {
        this.newEmailKey = newEmailKey;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @XmlTransient
    public List<Bookmarks> getBookmarksList() {
        return bookmarksList;
    }

    public void setBookmarksList(List<Bookmarks> bookmarksList) {
        this.bookmarksList = bookmarksList;
    }

    @XmlTransient
    public List<Memberships> getMembershipsList() {
        return membershipsList;
    }

    public void setMembershipsList(List<Memberships> membershipsList) {
        this.membershipsList = membershipsList;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Users[ id=" + id + " ]";
    }
    
}
