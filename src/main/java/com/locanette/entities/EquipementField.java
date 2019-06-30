package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loc_equipment_field")
public class EquipementField implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2383042516141805711L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String label;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="field",fetch=FetchType.LAZY)
	private Collection<ProfessionalTool>  tools;
	/**
	 * 
	 */
	public EquipementField() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param label
	 * @param description
	 * @param visible
	 */
	public EquipementField(String label, String description, boolean visible) {
		super();
		this.label = label;
		this.description = description;
		this.visible = visible;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Collection<ProfessionalTool> getTools() {
		return tools;
	}
	public void setTools(Collection<ProfessionalTool> tools) {
		this.tools = tools;
	}
	
	
	

}
